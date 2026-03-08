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

    @GetMapping({"/partydetails/{id}","/partydetails/"})
    public String showPartyDetails(@PathVariable(required = false) Integer id,
                                   Model model) {
        if (id == null) return "partydetails";
        Optional<Party> party = partyRepository.findById(id);
        if (party.isPresent()) {
            model.addAttribute("party", party.get());
        }
//        long nrOfParty =  partyRepository.count();

        return "partydetails";
    }
    @GetMapping("/partylist")
    public String showPartyList(Model model) {
        // 1. Haal alle parties op uit de database via de repository
        Iterable<Party> parties = partyRepository.findAll();

        // 2. Voeg de lijst toe aan het model zodat Thymeleaf erbij kan
        model.addAttribute("parties", parties);

        // 3. Return de naam van de Thymeleaf template
        return "partylist";
        
    }

}
