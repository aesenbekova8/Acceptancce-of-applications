package com.example.AcceptancceOfApplications.model;

import com.example.AcceptancceOfApplications.enums.ConnectionType;
import com.example.AcceptancceOfApplications.enums.Status;
import com.example.AcceptancceOfApplications.enums.TypeOfHouse;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Subscriber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String surnameOrNameOfOrganization;

    private String address;

    private TypeOfHouse typeOfHouse;

    private String phoneNumber;

    private ConnectionType connectionType;

    private Status status;

    public Subscriber() {
    }


}
