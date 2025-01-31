package br.com.challenge.artist.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "tb_music")
public class Music {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameMusic;


    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;

    public Music(){}

    public Music(Artist artist, Long id, String nameMusic) {
        this.artist = artist;
        this.id = id;
        this.nameMusic = nameMusic;
    }

    public Music(String title) {
        this.nameMusic = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }

    @Override
    public String toString() {
        return  "Name music: " + nameMusic;
    }
}
