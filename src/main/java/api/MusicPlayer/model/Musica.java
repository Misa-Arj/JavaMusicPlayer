package api.MusicPlayer.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Musica")
@Table(name = "musica")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Musica {

    @NotEmpty(message = "coluna autor não pode ser vazia")
    private String autor;
    @NotEmpty(message = "coluna nomeDaMusica não pode ser vazia")
    private String nomeDaMusica;

    @NotEmpty(message = "duracao não pode ser vazia") 
    private Double duracao;


}
