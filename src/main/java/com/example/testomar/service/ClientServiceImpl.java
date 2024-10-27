package com.example.testomar.service;

import com.example.testomar.entities.Client;
import com.example.testomar.entities.ClientP;
import com.example.testomar.entities.ClientVIP;
import com.example.testomar.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;
    @Override
    public List<Client> listClient() {
        return clientRepository.findAll();
    }

    @Override
    public ClientVIP addClientVIP(ClientVIP clientVIP) {
        return clientRepository.save(clientVIP);
    }

    @Override
    public ClientP addClientP(ClientP clientP) {
        return clientRepository.save(clientP);
    }

}
