package be.thomasmore.party.repositories;

import be.thomasmore.party.model.Artist;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ArtistRepository extends CrudRepository<Artist, Integer> {
    Optional<Artist> findById(Integer id);

    @Query("select a from Artist a where " +
            "LOWER(a.ArtistName) like lower(concat('%', :keyword, '%')) or " +
            "LOWER(a.Bio) like lower(concat('%', :keyword, '%')) or " +
            "LOWER(a.Genre) like lower(concat('%', :keyword, '%')) or " +
            "LOWER(a.Portfolio) like lower(concat('%', :keyword, '%'))")
            //ILIKE zorgt ervoor dat "DJ","dj" en "Dj" allemaal gevonden worden
    // De procenttekens zijn wildcards.Dit betekent:"zoek de tekst overal in de naam"
    //lower zorgt ervoor dat een tekstreeks volledig omzet naar kleine letters
    //Het is een standaarmanier om zoekopdrachten case-insensitive te maken.
    List<Artist> findByFilter(@Param("keyword") String keyword);
    //like is te strek en ilike niet en negeert hoofdletters
//    static Iterable<Artist> findAll() {
//        return ArtistRepository.findAll();
//    }
//
//    Optional<Artist> findById(Integer id);
}
