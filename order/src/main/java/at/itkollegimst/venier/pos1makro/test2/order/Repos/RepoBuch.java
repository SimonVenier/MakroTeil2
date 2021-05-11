package at.itkollegimst.venier.pos1makro.test2.order.Repos;

import at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung.Buch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoBuch extends JpaRepository<Buch, Long> {
    Optional<Buch> findBuchByBuchnummer(String buchnummer);
}
