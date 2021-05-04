package at.itkollegimst.venier.pos1makro.test2.buchhandlung.api.rest;

import at.itkollegimst.venier.pos1makro.test2.buchhandlung.Service.BuchCommandService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/buch")
public class BuchContr {

    private BuchCommandService buchCommandService;

    public BuchContr(BuchCommandService buchCommandService) {

        this.buchCommandService = buchCommandService;

    }

    @PostMapping
    public ResponseEntity<?> createBuch(@RequestBody CreateBuchdto createBuchdto){

        System.out.println("========================================================================================");

        buchCommandService.buchErstellen(BuchdtoMapper.toCreateBuch2Command(createBuchdto));

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{buchnummer}")
                .buildAndExpand(createBuchdto.getBuchnummer())
                .toUri();

        return ResponseEntity.created(location).build();

    }


}
