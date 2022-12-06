package org.stackroute.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.stackroute.commentDetails.Comment;
import org.stackroute.commentDetails.commentGrpc;
import org.stackroute.jobPosting.Jobposting;
import org.stackroute.jobPosting.jobPostingGrpc;
import org.stackroute.register.Userservice;
import org.stackroute.register.userServiceGrpc;
import repository.CommentRepoImpl;

import java.util.List;

public class CommentService extends commentGrpc.commentImplBase{

    CommentRepoImpl commnetRepo = new CommentRepoImpl();

    public boolean validateUser(int userId){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8091).usePlaintext().build();
        userServiceGrpc.userServiceBlockingStub userServiceBlockingStub = userServiceGrpc.newBlockingStub(channel);

        Userservice.userIdResponse userResponse = userServiceBlockingStub.allUserId(Userservice.empty.newBuilder().build());
        Userservice.userIdResponse.Builder userIdRes = Userservice.userIdResponse.newBuilder();
        List<Integer> uid = userResponse.getUserIdList();
        if(uid.contains(userId)){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validateJob(int jobId){
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8085).usePlaintext().build();
        jobPostingGrpc.jobPostingBlockingStub jobPostingBlockingStub = jobPostingGrpc.newBlockingStub(channel);

        Jobposting.jobIdResponse jobResponse = jobPostingBlockingStub.allJobId(Jobposting.empty.newBuilder().build());
        Jobposting.jobIdResponse.Builder jobIdRes = Jobposting.jobIdResponse.newBuilder();
        List<Integer> jid = jobResponse.getJobIdList();
        if(jid.contains(jobId)){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void commentAdd(Comment.commentAddMessage request, StreamObserver<Comment.commentAddAPIResponse> responseObserver) {
        int job_Id = request.getJobId();
        int userId = request.getUserId();
        String comment = request.getComment();
        String commentDate = request.getCommentDate();

        Comment.commentAddAPIResponse.Builder cmRes = Comment.commentAddAPIResponse.newBuilder();
        boolean valUser = validateUser(userId);
        boolean valJob = validateJob(job_Id);
        if(valUser == true && valJob == true){
            commnetRepo.addComment(job_Id, userId, comment,commentDate);
            cmRes.setResponseMessage("Comment added").setResponseCode(201);
        }else{
            cmRes.setResponseMessage("Comment Not added").setResponseCode(203);
        }
        responseObserver.onNext(cmRes.build());
        responseObserver.onCompleted();
    }

    @Override
    public void commentUpdate(Comment.commentUpdateMessage request, StreamObserver<Comment.commentUpdateAPIResponse> responseObserver) {
        int job_Id = request.getJobId();
        int userId = request.getUserId();
        String comment = request.getComment();
        String commentDate = request.getCommentDate();

        Comment.commentUpdateAPIResponse.Builder cmRes = Comment.commentUpdateAPIResponse.newBuilder();
        boolean valUser = validateUser(userId);
        boolean valJob = validateJob(job_Id);
        if(valUser == true && valJob == true){
            commnetRepo.updateComment(job_Id, userId, comment,commentDate);
            cmRes.setResponseMessage("Comment update").setResponseCode(202);
        }else{
            cmRes.setResponseMessage("Comment Not update").setResponseCode(204);
        }

        responseObserver.onNext(cmRes.build());
        responseObserver.onCompleted();
    }

    @Override
    public void commentDelete(Comment.commentDeleteMessage request, StreamObserver<Comment.commentDeleteAPIResponse> responseObserver) {
        int job_Id = request.getJobId();
        boolean valJob = validateJob(job_Id);
        Comment.commentDeleteAPIResponse.Builder apiRes = Comment.commentDeleteAPIResponse.newBuilder();
        if(valJob == true){
            commnetRepo.deleteComment(job_Id);
            apiRes.setResponseMessage("Comment deleted").setResponseCode(205);
        }else{
            apiRes.setResponseMessage("Comment Not deleted").setResponseCode(206);
        }

        responseObserver.onNext(apiRes.build());
        responseObserver.onCompleted();
    }
}
