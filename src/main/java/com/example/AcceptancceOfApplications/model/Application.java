package com.example.AcceptancceOfApplications.model;

import com.example.AcceptancceOfApplications.enums.ConnectionType;
import com.example.AcceptancceOfApplications.enums.Status;
import com.example.AcceptancceOfApplications.enums.TypeOfHouse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Subscriber subscriber;

    private Long captcha;

    public Application() {
    }

    public Application(Long id, Subscriber subscriber, Long captcha) {
        this.id = id;
        this.subscriber = subscriber;
        this.captcha = captcha;
    }

    public Application(Subscriber subscriber, Long captcha, Status status) {
        this.subscriber = subscriber;
       this.captcha = id + 2;


    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(Subscriber subscriber) {
        this.subscriber = subscriber;
    }

    public Long getCaptcha() {
        return captcha;
    }

    public void setCaptcha(Long captcha) {
        this.captcha = captcha;
    }
}
