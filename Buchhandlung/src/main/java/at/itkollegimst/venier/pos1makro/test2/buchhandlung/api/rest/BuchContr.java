package at.itkollegimst.venier.pos1makro.test2.buchhandlung.api.rest;

import at.itkollegimst.venier.pos1makro.test2.buchhandlung.Exception.KeinBuchVorhandenExcep;
import at.itkollegimst.venier.pos1makro.test2.buchhandlung.Service.BuchCommandService;
import at.itkollegimst.venier.pos1makro.test2.buchhandlung.Service.BuchQueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/buch")
public class BuchContr {

    private BuchCommandService buchCommandService;
    private BuchQueryService buchQueryService;

    public BuchContr(BuchCommandService buchCommandService, BuchQueryService buchQueryService) {

        this.buchCommandService = buchCommandService;
        this.buchQueryService = buchQueryService;

    }

    @PostMapping
    public ResponseEntity<?> createBuch(@RequestBody CreateBuchdto createBuchdto){

        buchCommandService.buchErstellen(BuchdtoMapper.toCreateBuch2Command(createBuchdto));

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{buchnummer}")
                .buildAndExpand(createBuchdto.getBuchnummer())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @GetMapping("/{buchnummer}")
    public ResponseEntity<CreateBuchdto> getBuch(@PathVariable String buchnummer) throws KeinBuchVorhandenExcep {

        return new ResponseEntity<>(BuchEntitydtoMapper.createBuchdto(

              buchQueryService.getBuchByBuchnummer(buchnummer)), HttpStatus.OK);

    }


}
