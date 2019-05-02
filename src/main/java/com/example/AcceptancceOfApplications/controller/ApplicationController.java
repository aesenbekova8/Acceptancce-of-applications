package com.example.AcceptancceOfApplications.controller;

import com.example.AcceptancceOfApplications.model.Application;
import com.example.AcceptancceOfApplications.model.Response;
import com.example.AcceptancceOfApplications.service.ApplicationService;
import com.example.AcceptancceOfApplications.utils.Confirmation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {
    @Autowired
    ApplicationService applicationService;

    @PostMapping(path = "/create", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public Response add(@RequestBody Application a){
        return new Response("Successfully added", true, applicationService.add(a));
    }

    @GetMapping(path = "/getAll", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response getAll(){
        return new Response("All applications: ", true, applicationService.getAll());
    }

    @GetMapping(path = "get/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response getById(@PathVariable Long id){
        return new Response("Application by id = " + id, true, applicationService.getById(id));
    }

    @DeleteMapping(path = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response delete(@PathVariable Long id){
        applicationService.delete(id);
        return new Response("Deleted application for id = " + id, true, null);
    }

    @PostMapping(path = "/confirm", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response captchaConfirmation(@RequestBody Confirmation confirmation){
       try {
           return new Response("Successfully confirmed", applicationService.captchaConfirmation
                   (confirmation.getId(), confirmation.getCaptcha()),
                           this.applicationService.getById(confirmation.getId()));
       }
       catch (Exception e){
           return new Response(e.toString(),false,  null);
       }
    }
}
