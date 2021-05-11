package at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Buch {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String buchnummer;

    public Buch(CreateBuch createBuch) {
        this.buchnummer = createBuch.getBuchnummer();
    }

    public Buch() {

    }

    public String getBuchnummer() {
        return buchnummer;
    }

    public void setBuchnummer(String buchnummer) {
        this.buchnummer = buchnummer;
    }
}
