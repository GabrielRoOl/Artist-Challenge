package br.com.challenge.artist.services;

import br.com.challenge.artist.model.Artist;
import br.com.challenge.artist.repositories.ArtistRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    private final ArtistRepository artistRepository;

    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public Artist saveArtist(Artist artist){
        return artistRepository.save(artist);
    }

    public List<Artist> findAll(){
        return artistRepository.findAll();
    }

}
