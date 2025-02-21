package com.br.addc.AddClients.controllers;

import java.util.List;
import com.br.addc.AddClients.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.addc.AddClients.models.Client;

@Controller
@RequestMapping("/clients")
public class ClientsController {

    @Autowired
    private ClientRepository repo;


    @GetMapping
    public String getClients(Model model){
    List<Client> clients = repo.getClients();
    model.addAttribute("clients", clients);
    return "clients/index";
    }

}
