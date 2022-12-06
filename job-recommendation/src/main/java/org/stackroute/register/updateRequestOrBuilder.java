// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userservice.proto

package org.stackroute.register;

public interface updateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:updateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string userName = 1;</code>
   * @return The userName.
   */
  java.lang.String getUserName();
  /**
   * <code>string userName = 1;</code>
   * @return The bytes for userName.
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string userEmail = 2;</code>
   * @return The userEmail.
   */
  java.lang.String getUserEmail();
  /**
   * <code>string userEmail = 2;</code>
   * @return The bytes for userEmail.
   */
  com.google.protobuf.ByteString
      getUserEmailBytes();

  /**
   * <pre>
   * delete this
   * </pre>
   *
   * <code>int32 userId = 3;</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>string dob = 4;</code>
   * @return The dob.
   */
  java.lang.String getDob();
  /**
   * <code>string dob = 4;</code>
   * @return The bytes for dob.
   */
  com.google.protobuf.ByteString
      getDobBytes();

  /**
   * <code>string gender = 5;</code>
   * @return The gender.
   */
  java.lang.String getGender();
  /**
   * <code>string gender = 5;</code>
   * @return The bytes for gender.
   */
  com.google.protobuf.ByteString
      getGenderBytes();

  /**
   * <code>string password = 6;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <code>string password = 6;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();

  /**
   * <code>string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int64 phone = 8;</code>
   * @return The phone.
   */
  long getPhone();

  /**
   * <code>string designation = 9;</code>
   * @return The designation.
   */
  java.lang.String getDesignation();
  /**
   * <code>string designation = 9;</code>
   * @return The bytes for designation.
   */
  com.google.protobuf.ByteString
      getDesignationBytes();

  /**
   * <pre>
   *list of primary skill
   * </pre>
   *
   * <code>string primarySkil = 10;</code>
   * @return The primarySkil.
   */
  java.lang.String getPrimarySkil();
  /**
   * <pre>
   *list of primary skill
   * </pre>
   *
   * <code>string primarySkil = 10;</code>
   * @return The bytes for primarySkil.
   */
  com.google.protobuf.ByteString
      getPrimarySkilBytes();

  /**
   * <code>string secondarySkill = 11;</code>
   * @return The secondarySkill.
   */
  java.lang.String getSecondarySkill();
  /**
   * <code>string secondarySkill = 11;</code>
   * @return The bytes for secondarySkill.
   */
  com.google.protobuf.ByteString
      getSecondarySkillBytes();
}
