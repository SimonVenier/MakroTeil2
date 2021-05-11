package at.itkollegimst.venier.pos1makro.test2.order.api;

import at.itkollegimst.venier.pos1makro.test2.order.Dtos.BestellungCdtoMapper;
import at.itkollegimst.venier.pos1makro.test2.order.Dtos.BestellungEdtoMapper;
import at.itkollegimst.venier.pos1makro.test2.order.Dtos.CreateBestellungDto;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung.BestellungCommandService;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Bestellung.BestellungQueryService;
import at.itkollegimst.venier.pos1makro.test2.order.domain.Buchhandlung.BuchCommandService;
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
    private BuchCommandService buchCommandService;

    public BestellungController(BestellungCommandService bestellungCommandService,
                                BestellungQueryService bestellungQueryService, BuchCommandService buchCommandService) {
        this.bestellungCommandService = bestellungCommandService;
        this.bestellungQueryService = bestellungQueryService;
        this.buchCommandService = buchCommandService;
    }

    @PostMapping
    public ResponseEntity<?> createBestellung(@RequestBody CreateBestellungDto createBestellungDto)
    throws UnknownError
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
    public ResponseEntity<CreateBestellungDto> getBuchung(@PathVariable String bestellnummer){

        return new ResponseEntity<>(BestellungEdtoMapper.toCreateBestellungDto(bestellungQueryService
        .getBestellungByBestellnummer(bestellnummer)), HttpStatus.ACCEPTED);

    }

}
