package com.example.AcceptancceOfApplications.model;

public class Response {
    private String message;
    private Boolean isSuccess;
    private Object object;

    public Response(String message, Boolean isSuccess, Object object) {
        this.message = message;
        this.isSuccess = isSuccess;
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return isSuccess;
    }

    public void setSuccess(Boolean success) {
        isSuccess = success;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
