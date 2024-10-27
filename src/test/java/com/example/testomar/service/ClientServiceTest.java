package com.example.testomar.service;


import com.example.testomar.entities.Client;
import com.example.testomar.entities.ClientP;
import com.example.testomar.entities.ClientVIP;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @Mock
    private ClientService clientService;

    private ClientVIP testClientVIP;
    private ClientP testClientP;

    @BeforeEach
    public void setUp() {
        testClientVIP = new ClientVIP(); // Initialize with test data as needed
        testClientVIP.setId(String.valueOf(1L));
        testClientVIP.setName("VIP Client");

        testClientP = new ClientP(); // Initialize with test data as needed
        testClientP.setId(String.valueOf(2L));
        testClientP.setName("Regular Client");
    }

    @Test
    public void testListClient() {
        List<Client> clients = Arrays.asList(testClientVIP, testClientP);
        when(clientService.listClient()).thenReturn(clients);

        List<Client> result = clientService.listClient();

        assertEquals(2, result.size());
        assertEquals("VIP Client", result.get(0).getName());
        verify(clientService, times(1)).listClient();
    }

    @Test
    public void testAddClientVIP() {
        when(clientService.addClientVIP(testClientVIP)).thenReturn(testClientVIP);

        ClientVIP result = clientService.addClientVIP(testClientVIP);

        assertEquals(testClientVIP, result);
        assertEquals("VIP Client", result.getName());
        verify(clientService, times(1)).addClientVIP(testClientVIP);
    }

    @Test
    public void testAddClientP() {
        when(clientService.addClientP(testClientP)).thenReturn(testClientP);

        ClientP result = clientService.addClientP(testClientP);

        assertEquals(testClientP, result);
        assertEquals("Regular Client", result.getName());
        verify(clientService, times(1)).addClientP(testClientP);
    }
}
