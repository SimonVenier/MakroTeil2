package at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung;

import lombok.Value;

@Value
public class CreateBuch {

    String buchnummer;

    public CreateBuch(String buchnummer) {
        this.buchnummer = buchnummer;
    }

    public String getBuchnummer() {
        return buchnummer;
    }
}
