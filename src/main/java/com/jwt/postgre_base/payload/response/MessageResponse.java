package com.jwt.postgre_base.payload.response;

public class MessageResponse {
  private String message;
  private Boolean success;

  public MessageResponse(String message, Boolean success) {
    this.message = message;
    this.success = success;
  }

  public Boolean isSuccess() {
    return this.success;
  }

  public Boolean getSuccess() {
    return this.success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
