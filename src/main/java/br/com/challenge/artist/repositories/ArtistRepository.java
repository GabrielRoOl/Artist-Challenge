package br.com.challenge.artist.repositories;

import br.com.challenge.artist.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findByNameArtistContainingIgnoreCase(String name);
}