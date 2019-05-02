package com.example.AcceptancceOfApplications.service;

import com.example.AcceptancceOfApplications.model.Application;

import java.util.List;

public interface ApplicationService {
    Application add(Application a);
    List<Application> getAll();
    Application getById(Long id);
    void delete(Long id);
    Boolean captchaConfirmation(Long id, String captcha);
}
