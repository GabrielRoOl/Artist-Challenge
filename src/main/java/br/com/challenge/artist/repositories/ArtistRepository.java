package br.com.challenge.artist.repositories;

import br.com.challenge.artist.model.Artist;
import br.com.challenge.artist.model.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findByNameArtistContainingIgnoreCase(String name);

    @Query("SELECT Music m FROM Artist a JOIN a.musicList m WHERE a.nameArtist LIKE %:artist")
    List<Music> searchMusicByArtist(String artist);
}