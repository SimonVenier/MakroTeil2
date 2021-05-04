package at.itkollegimst.venier.pos1makro.test2.buchhandlung.repo;

import at.itkollegimst.venier.pos1makro.test2.buchhandlung.domain.Buch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RepoBuch extends JpaRepository<Buch, Long> {

    Optional<Buch> getBuchByBuchnummer(String BN);

}
