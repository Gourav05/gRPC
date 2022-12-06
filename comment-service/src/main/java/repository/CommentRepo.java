package repository;

public interface CommentRepo {
    public boolean addComment(int job_Id, int user_Id, String comment, String commentDate);

    public boolean updateComment(int job_Id, int user_Id, String comment, String commentDate);

    public boolean deleteComment(int job_Id);
}
