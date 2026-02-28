package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import be.thomasmore.party.repositories.VenueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;



@Controller
public class VenueController {
    // LoggerFactory.getLogger(...): Dit is een 'fabriek' die een logger voor je maakt.
    // VenueController .class:Hiermee vertel je de logger:"onthoud dat de berichten die ik stuur uti de klasse VenueController komen
    private Logger logger = LoggerFactory.getLogger(VenueController.class);
    private final VenueRepository venueRepository;

    public  VenueController (VenueRepository venueRepository){
        this.venueRepository = venueRepository;
    }

    // we schrijven nu een extra stukje bij onze url
    @GetMapping({"/venuedetails/{id}","/venuedetails"})
    // We voegen nu een nieuwe parameter toe @PathVariable int id
    // de id in de parameter moet hetzelfde zijn als de id in het url
    public String venueDetails(Model model, @PathVariable(required = false) Integer id){
        // required false betekent dat je geen id moet hebben om naar die page te kunnen gaan
        // pathvariable is dus optioneel
        // Gebruik venueFromDb (met 'Db' op het einde)
        if (id == null) return "venuedetails";

        Optional<Venue> venueFromDb = venueRepository.findById(id);
        if (venueFromDb.isPresent()) {
            model.addAttribute("venue", venueFromDb.get());
        }

        // Bereken het aantal zalen in de database voor de cirkel-logica
        long nrOfVenues = venueRepository.count();

        // Bereken prev en next (beginnend vanaf 1 zoals de tip zegt)
        int prevId = (id > 1) ? id - 1 : (int) nrOfVenues;
        int nextId = (id < nrOfVenues) ? id + 1 : 1;

        model.addAttribute("prevVenues", prevId);
        model.addAttribute("nextVenues", nextId);

        // vertel welke html file moet openen
        return "venuedetails";
        // Dit is de naam van de html page die we hebben
    }

    @GetMapping("/venuelist")
    //De query paramet is not required omdat minCapacity ook null kan zijn
    // Daarom gebruiken we Integer inplaats van int
    // Want een Integer kan wel null zijn.
    public String venueList(Model model,
                            @RequestParam(required = false) Integer minCapacity,
                            @RequestParam(required = false) Integer maxCapacity) {
        //Dit geeft aan dat het om een informatief bericht gaan(geen foutmelding-
        // %d is ene placeholder voor ene decimal getal
        // minCapacity neemt dan die plek over
        logger.info(String.format("venueList--min=%d",minCapacity));
        // Haal alle venues op uit de database
        //De methode die we in de venueRepository hebben gemaakt roepen we hier uit
        // we hebben het over findBy filter
       final Iterable<Venue> venues = venueRepository.findByFilter(minCapacity,maxCapacity);
       long nrOfVenues = venueRepository.count();
        model.addAttribute("venues", venues);
        return "venuelist";
    }


}
