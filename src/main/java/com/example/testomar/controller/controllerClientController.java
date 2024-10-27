package com.example.testomar.controller;

import com.example.testomar.entities.Client;
import com.example.testomar.entities.ClientP;
import com.example.testomar.entities.ClientVIP;
import com.example.testomar.service.ClientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
public class controllerClientController {
    @Autowired
    private ClientServiceImpl clientService;


    @PostMapping("/add/ClientVip")
    public ClientVIP addClientVip(@RequestBody ClientVIP clientVIP){
        return clientService.addClientVIP(clientVIP);
    }

    @PostMapping("/add/ClientP")
    public ClientP addClientP(@RequestBody ClientP clientP){
        return clientService.addClientP(clientP);
    }

    @GetMapping("/list")
    public List<Client> clientList(){
        return clientService.listClient();
    }

}
