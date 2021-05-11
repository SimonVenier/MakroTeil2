package at.itkollegimst.venier.pos1makro.test2.order.Dtos;

import at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung.CreateBestellung;

public class BestellungCdtoMapper {

    public static CreateBestellung toCreateBestellung(CreateBestellungDto createBestellungDto){
        return new CreateBestellung(

                createBestellungDto.getBestellnummer(),
                createBestellungDto.getBuchnummer(),
                createBestellungDto.getPreis(),
                createBestellungDto.isGedruckt()

        );
    }

}
