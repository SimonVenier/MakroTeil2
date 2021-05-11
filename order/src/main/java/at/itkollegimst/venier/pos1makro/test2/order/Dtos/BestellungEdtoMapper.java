package at.itkollegimst.venier.pos1makro.test2.order.Dtos;

import at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung.Bestellung;

public class BestellungEdtoMapper {

    public static CreateBestellungDto toCreateBestellungDto(Bestellung bestellung){
        return new CreateBestellungDto(

                bestellung.getBestellnummer(),
                bestellung.getBuchnummer(),
                bestellung.getPreis(),
                bestellung.isGedruckt()

        );
    }

}
