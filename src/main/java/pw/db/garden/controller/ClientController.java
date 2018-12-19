package pw.db.garden.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import pw.db.garden.model.Client;
import pw.db.garden.repository.ClientRepository;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/clients/firstName/{firstName}")
    public List<Client> getClientsByFirstName(@PathVariable String firstName) {
        return clientRepository.findByFirstName(firstName);
    }
    @GetMapping("/clients/email/{email}")
    public List<Client> getClientsByEmail(@PathVariable String email) {
        return clientRepository.findByEmail(email);
    }
}
