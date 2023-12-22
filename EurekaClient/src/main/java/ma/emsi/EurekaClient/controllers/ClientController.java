package ma.emsi.EurekaClient.controllers;

import ma.emsi.EurekaClient.entities.Client;
import ma.emsi.EurekaClient.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/client")
public class ClientController {

    @Autowired
    private ClientService cs;

    @GetMapping
    public List<Client> findAll(){
        return cs.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> findAll(@PathVariable Long id){
      return cs.findById(id);
    }

    @PostMapping
    public void save (@RequestBody Client client){
        cs.addClient(client);
    }


}
