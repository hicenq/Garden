package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.repository.ClientRepository;

@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;



}
