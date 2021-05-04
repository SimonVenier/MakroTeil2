package at.itkollegimst.venier.pos1makro.test2.buchhandlung.api.rest;

import at.itkollegimst.venier.pos1makro.test2.buchhandlung.domain.Buch;

public class BuchEntitydtoMapper {

    public static CreateBuchdto createBuchdto(Buch buch){

        return new CreateBuchdto(
                buch.getName(),
                buch.getBuchnummer(),
                buch.getPreis()
        );

    }

}
