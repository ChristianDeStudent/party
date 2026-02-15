package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import be.thomasmore.party.repositories.VenueRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Optional;



@Controller
public class VenueController {
    private final VenueRepository venueRepository;

    public  VenueController (VenueRepository venueRepository){
        this.venueRepository = venueRepository;
    }

    @GetMapping("/venuedetails")
    public String venueDetails(Model model){
        // Gebruik venueFromDb (met 'Db' op het einde)
        Optional<Venue> venueFromDb = venueRepository.findById(1);

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



}
