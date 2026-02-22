package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
    Optional<Artist> findById(Integer id);

//    static Iterable<Artist> findAll() {
//        return ArtistRepository.findAll();
//    }
//
//    Optional<Artist> findById(Integer id);
}
