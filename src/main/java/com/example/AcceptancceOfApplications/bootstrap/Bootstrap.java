package com.example.AcceptancceOfApplications.bootstrap;

import com.example.AcceptancceOfApplications.enums.ConnectionType;
import com.example.AcceptancceOfApplications.enums.TypeOfHouse;
import com.example.AcceptancceOfApplications.model.Application;
import com.example.AcceptancceOfApplications.service.ApplicationService;
import com.example.AcceptancceOfApplications.service.ConnectionCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private ConnectionCheckService connectionCheckService;

    @Override
    public void run(String... args) throws Exception {
        Application a1 = new Application("Aidana", "Esenbekova", "Bishkek, Abadanov 21",
                TypeOfHouse.PRIVATE_HOUSE, "+9960353135", ConnectionType.TELEVISION);


    }
}
