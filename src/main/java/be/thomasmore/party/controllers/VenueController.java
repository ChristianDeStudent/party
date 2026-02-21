package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import be.thomasmore.party.repositories.VenueRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;



@Controller
public class VenueController {
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
        //Venue venue = new Venue();
        // gebruik kleine letter 'venue'
        //venue.setVenueName("De Roma");
        //venue.setLinkMoreInfo("https://www.deroma.be");

        // Stuurt het object naar de html
       // model.addAttribute("venue", venue);
        // vertel welke html file moet openen
        return "venuedetails";
        // Dit is de naam van de html page die we hebben
    }

    @GetMapping("/venuelist")
    public String venueList(Model model){
        // Haal alle venues op uit de database
        Iterable<Venue> venues = venueRepository.findAll();
        model.addAttribute("venues", venues);
        return "venuelist";
    }


}
