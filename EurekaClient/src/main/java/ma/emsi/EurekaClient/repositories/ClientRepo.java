package ma.emsi.EurekaClient.repositories;

import ma.emsi.EurekaClient.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends JpaRepository<Client,Long> {

}
