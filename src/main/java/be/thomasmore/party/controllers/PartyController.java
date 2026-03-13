package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Party;
import be.thomasmore.party.repositories.PartyRepository;
import be.thomasmore.party.repositories.VenueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class PartyController {
private Logger logger = LoggerFactory.getLogger(PartyController.class);

@Autowired
private final PartyRepository partyRepository;
    public PartyController(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    @GetMapping({"/partydetails/{id}","/partydetails"})
    public String PartyDetails(@PathVariable(required = false) Integer id,
                                   Model model) {
        // 1. Bepaal het ID (als null, pak de eerste party)
        int currentId = (id == null) ? 1 : id;
        Optional<Party> party = partyRepository.findById(currentId);

        // Als de party niet bestaat, stuur dan terug naar de lijst
        if (party.isEmpty()) {
            return "redirect:/partylist/";
        }

        model.addAttribute("party", party.get());

        // 2. Navigatie logica
        long nrOfParty =  partyRepository.count(); // Het totaal aantal bepalan
        //De vorige knop
        //Is de huidige ID groter dan 1?
        //Indien waar:Je gaat gewoon een stapje terug.
        //Indien onwaar:Je gaat dan naar de laatste id
        int prevId = (currentId > 1) ? currentId - 1 : (int) nrOfParty;
        //De volgende knop
        //Conditie='Is de huidige ID kleiner dan het totaal aantal feestjes?'
        // Als het waar is ga je naar de volgende
        //Als het onwaar is wordt je terug gestuurt naar de eerste ID
        int nextId = (currentId < nrOfParty) ? currentId + 1 : 1;

        model.addAttribute("prevParty", prevId);
        model.addAttribute("nextParty", nextId);

        return "partydetails";
    }
    @GetMapping("/partylist")
    public String PartyList(Model model) {
        // 1. Haal alle parties op uit de database via de repository
        Iterable<Party> parties = partyRepository.findAll();

        // 2. Voeg de lijst toe aan het model zodat Thymeleaf erbij kan
        model.addAttribute("parties", parties);

        // 3. Return de naam van de Thymeleaf template
        return "partylist";
        
    }

}
