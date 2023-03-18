package api.MusicPlayer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity(name = "MusicPlayer")
@Table(name = "musicplayer")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MusicPlayer {


    private List<Musica> musicas;




}
