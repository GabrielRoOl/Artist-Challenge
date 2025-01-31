package br.com.challenge.artist.model;

import br.com.challenge.artist.enums.Gender;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_artist")
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nameArtist;

    @Enumerated(EnumType.STRING)
    private Gender genre;

    @OneToMany(mappedBy = "artist", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    List<Music> musicList = new ArrayList<>();

    public Artist(){}

    public Artist(Long id, List<Music> musicList, String nameArtist) {
        this.id = id;
        this.musicList = musicList;
        this.nameArtist = nameArtist;
    }

    public Artist(String name, Gender genre) {
        this.nameArtist = name;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public void setNameArtist(String nameArtist) {
        this.nameArtist = nameArtist;
    }

    @Override
    public String toString() {
        return "Name: " + nameArtist +
                " Musical gender: " + genre +
                " Musics : " + musicList;
    }
}
