package at.itkollegimst.venier.pos1makro.test2.buchhandlung.api.rest;

import at.itkollegimst.venier.pos1makro.test2.buchhandlung.domain.CreateBuch;

public class BuchdtoMapper {

    public static CreateBuch toCreateBuch2Command(CreateBuchdto createBuchdto){

        return new CreateBuch(

                createBuchdto.getName(),
                createBuchdto.getBuchnummer(),
                createBuchdto.getPreis()

        );

    }

}
