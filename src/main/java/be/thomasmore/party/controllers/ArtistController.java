package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Artist;
import be.thomasmore.party.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Controller
public class ArtistController {
    @Autowired
    private final ArtistRepository artistRepository;
    public ArtistController(ArtistRepository artistRepository, ArtistRepository artistRepository1) {
        this.artistRepository = artistRepository1;
    }

    @GetMapping({"/artistdetails/{id}","/artistdetails"})
    public String artistdetails(@PathVariable(required = false) Integer id, Model model) {
        if(id == null) return "artistdetails";
        Optional<Artist> artistDb = artistRepository.findById(id);
        if (artistDb.isPresent()) {
            model.addAttribute("artist", artistDb.get());
        }
        return "artistdetails";
    }
    @GetMapping("/artistlist")
    public String getArtistList(Model model) {
    // Haal alle artiesten op uit de database
        final Iterable<Artist> artists = artistRepository.findAll();
        model.addAttribute("artists", artists);
        return "artistlist";
    }

}
