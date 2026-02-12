package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Venue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VenueController {
    @GetMapping("/venuedetails")
    public String venueDetails(Model model){
        Venue venue = new Venue();
        // gebruik kleine letter 'venue'
        venue.setVenueName("De Roma");
        venue.setLinkMoreInfo("https://www.deroma.be");

        // Stuurt het object naar de html
        model.addAttribute("venue", venue);
        // vertel welke html file moet openen
        return "venuedetails";
        // Dit is de naam van de html page die we hebben
    }
}
