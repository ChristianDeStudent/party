package be.thomasmore.party.controllers;

import be.thomasmore.party.model.Artist;
import be.thomasmore.party.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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

        //Bereken het aantal zalen in de databse voor de cirkel-logica
        long nrOfArtists = artistRepository.count();

        // Bereken prev en next
        int prevId = (id > 1) ? id - 1 : (int) nrOfArtists;
        int nextId = (id < nrOfArtists) ? id + 1 : 1;
        model.addAttribute("prevArtist", prevId);
        model.addAttribute("nextArtist", nextId);

        return "artistdetails";
    }
    @GetMapping("/artistlist")
    public String getArtistList(Model model,
                                @RequestParam(required = false) String keyword) {
    // Haal alle artiesten op uit de database
        Iterable<Artist> artists;
        if(keyword != null && !keyword.isEmpty()) {
            artists = artistRepository.findByFilter(keyword);
        } else {
            artists = artistRepository.findAll();
        }
        model.addAttribute("artists", artists);
        model.addAttribute("keyword", keyword);
        return "artistlist";
    }

}
