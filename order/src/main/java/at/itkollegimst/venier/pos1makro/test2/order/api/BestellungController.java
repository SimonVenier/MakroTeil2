package at.itkollegimst.venier.pos1makro.test2.order.api;

import at.itkollegimst.venier.pos1makro.test2.order.Dtos.BestellungCdtoMapper;
import at.itkollegimst.venier.pos1makro.test2.order.Dtos.BestellungEdtoMapper;
import at.itkollegimst.venier.pos1makro.test2.order.Dtos.CreateBestellungDto;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung.BestellungCommandService;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung.BestellungQueryService;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung.BuchCommandService;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung.BuchQueryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/bestellungen")
public class BestellungController {

    private BestellungCommandService bestellungCommandService;
    private BestellungQueryService bestellungQueryService;
    private BuchQueryService buchQueryService;

    public BestellungController(BestellungCommandService bestellungCommandService, BestellungQueryService bestellungQueryService, BuchQueryService buchQueryService) {
        this.bestellungCommandService = bestellungCommandService;
        this.bestellungQueryService = bestellungQueryService;
        this.buchQueryService = buchQueryService;
    }

    @PostMapping
    public ResponseEntity<?> createBestellung(@RequestBody CreateBestellungDto createBestellungDto)
    {
        bestellungCommandService.createBestellung(BestellungCdtoMapper.toCreateBestellung(createBestellungDto));

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{bestellnummer}")
                .buildAndExpand(createBestellungDto.getBestellnummer())
                .toUri();

        return ResponseEntity.created(location).build();

    }

    @GetMapping("/{bestellnummer}")
    public ResponseEntity<CreateBestellungDto> getBestellung(@PathVariable String bestellnummer){

        return new ResponseEntity<>(BestellungEdtoMapper.toCreateBestellungDto(bestellungQueryService
        .getBestellungByBestellnummer(bestellnummer)), HttpStatus.ACCEPTED);

    }

    @GetMapping("/{bestellnummer)")
    public Long getNumberOfBestellungorBuch(@PathVariable String bestellnummer){
        return bestellungQueryService.getNummerOfBestellungFuerBuch(bestellnummer);
    }

}
