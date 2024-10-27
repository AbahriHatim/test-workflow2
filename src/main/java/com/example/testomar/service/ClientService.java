package com.example.testomar.service;

import com.example.testomar.entities.Client;
import com.example.testomar.entities.ClientP;
import com.example.testomar.entities.ClientVIP;

import java.util.List;

public interface ClientService {
    List<Client> listClient();
    ClientVIP addClientVIP(ClientVIP clientVIP);
    ClientP addClientP(ClientP clientP);
}
