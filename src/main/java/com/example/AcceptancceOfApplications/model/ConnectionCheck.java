package com.example.AcceptancceOfApplications.model;

import com.example.AcceptancceOfApplications.enums.ConnectionType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ConnectionCheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private ConnectionType connectionType;

    private String address;

    private Boolean connected;

    public ConnectionCheck() {
    }

    public ConnectionCheck(ConnectionType connectionType, String address, Boolean connected) {
        this.connectionType = connectionType;
        this.address = address;
        this.connected = connected;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }
}
