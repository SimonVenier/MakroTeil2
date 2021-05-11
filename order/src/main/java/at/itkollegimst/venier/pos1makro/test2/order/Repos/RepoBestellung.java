package at.itkollegimst.venier.pos1makro.test2.order.Repos;

import at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung.Bestellung;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoBestellung extends JpaRepository<Bestellung, Long> {

    Optional<Bestellung> getBestellungByBestellnummer(String bestellnummer);
    Long countBestellungByBestellnummer(String bestellnummer);

}
