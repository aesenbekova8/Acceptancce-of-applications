package com.example.AcceptancceOfApplications.controller;


import com.example.AcceptancceOfApplications.model.ConnectionCheck;
import com.example.AcceptancceOfApplications.model.Application;
import com.example.AcceptancceOfApplications.model.Response;
import com.example.AcceptancceOfApplications.service.ConnectionCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/check")
public class ConnectionCheckController {
    @Autowired
    private ConnectionCheckService connectionCheckService;

    @PostMapping(path = "/create", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public Response add(@RequestBody ConnectionCheck c){
//        if (application.getAddress().equals(connectionCheck.getAddress())) {
//            connectionCheck.setConnected(true);
//            return new Response("You are connected", true, connectionCheckService.add(c));
//        }
//        return new Response("You are not connected", false, null);

        return new Response("You are connected", true, connectionCheckService.add(c));
    }

    @GetMapping(path = "/getAll", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response getAll(){
        return new Response("All checks: ", true, connectionCheckService.getAll());
    }

    @GetMapping(path = "get/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response getById(@PathVariable Long id){
        return new Response("Check by id = " + id, true, connectionCheckService.getById(id));
    }

    @DeleteMapping(path = "/delete/{id}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public Response delete(@PathVariable Long id){
        connectionCheckService.delete(id);
        return new Response("Deleted check for id = " + id, true, null);
    }

//    @PostMapping(path = "/check", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    public Response check(@RequestBody Application a){
//        if (connectionCheckService.check(a).equals(true)){
//            return new Response("Your house is on", true, connectionCheckService.check(a));
//        }else return new Response("Your house is not connected", false, null);
//    }
}
