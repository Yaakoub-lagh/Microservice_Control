package ma.emsi.EurekaClient.services;

import ma.emsi.EurekaClient.entities.Client;
import ma.emsi.EurekaClient.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepo cr;

    public List<Client> findAll(){
        return cr.findAll();
    }

    public Optional<Client> findById(Long id){
        return cr.findById(id);
    }
    public void addClient(Client client){
        cr.save(client);
    }
}


