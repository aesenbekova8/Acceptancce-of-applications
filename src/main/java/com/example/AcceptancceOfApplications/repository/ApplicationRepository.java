package com.example.AcceptancceOfApplications.repository;

import com.example.AcceptancceOfApplications.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {
}
