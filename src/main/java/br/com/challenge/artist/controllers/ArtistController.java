package br.com.challenge.artist.controllers;

import br.com.challenge.artist.model.Artist;
import br.com.challenge.artist.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/artists")
public class ArtistController {

    @Autowired
    private ArtistService service;

    @GetMapping
    public List<Artist> findAll(){
        return service.findAll();
    }
}
