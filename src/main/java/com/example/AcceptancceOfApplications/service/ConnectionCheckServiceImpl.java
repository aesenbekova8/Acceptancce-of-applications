package com.example.AcceptancceOfApplications.service;


import com.example.AcceptancceOfApplications.model.ConnectionCheck;
import com.example.AcceptancceOfApplications.repository.ConnectionCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConnectionCheckServiceImpl implements ConnectionCheckService {
    @Autowired
    private ConnectionCheckRepository connectionCheckRepository;

    @Override
    public ConnectionCheck add(ConnectionCheck c) {
        return this.connectionCheckRepository.save(c);
    }

    @Override
    public List<ConnectionCheck> getAll() {
        return this.connectionCheckRepository.findAll();
    }

    @Override
    public ConnectionCheck getById(Long id) {
        return this.connectionCheckRepository.findById(id).get();
    }

    @Override
    public void delete(Long id) {
        this.connectionCheckRepository.deleteById(id);
    }

    @Override
    public Boolean check(String address) {
        return null;
    }
}
