package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.repository.ClientRepository;

@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;



}
