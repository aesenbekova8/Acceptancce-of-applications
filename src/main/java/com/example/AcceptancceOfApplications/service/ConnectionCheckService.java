package com.example.AcceptancceOfApplications.service;

import com.example.AcceptancceOfApplications.model.Application;
import com.example.AcceptancceOfApplications.model.ConnectionCheck;

import java.util.List;

public interface ConnectionCheckService {
    ConnectionCheck add(ConnectionCheck c);
    List<ConnectionCheck> getAll();
    ConnectionCheck getById(Long id);
    void delete(Long id);
    Boolean check(String address);
}
