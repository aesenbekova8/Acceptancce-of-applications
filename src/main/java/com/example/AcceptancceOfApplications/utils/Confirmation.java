package com.example.AcceptancceOfApplications.utils;

public class Confirmation {
    private Long id;
    private  String captcha;

    public Confirmation() {
    }

    public Confirmation(Long id, String captcha) {
        this.id = id;
        this.captcha = captcha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
