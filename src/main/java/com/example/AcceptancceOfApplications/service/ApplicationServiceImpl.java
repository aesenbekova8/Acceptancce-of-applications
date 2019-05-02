package com.example.AcceptancceOfApplications.service;

import com.example.AcceptancceOfApplications.model.Application;
import com.example.AcceptancceOfApplications.model.Subscriber;
import com.example.AcceptancceOfApplications.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    @Override
    public Application add(Application a) {
        return this.applicationRepository.save(a);
    }

    @Override
    public List<Application> getAll() {
        return this.applicationRepository.findAll();
    }

    @Override
    public Application getById(Long id) {
        return this.applicationRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        this.applicationRepository.deleteById(id);
    }

    @Override
    public Boolean captchaConfirmation(Long id, String captcha) {
        Application a = getById(id);
        if (captcha.equals(a.getCaptcha())){
            return true;
        }
        return false;
    }
}
