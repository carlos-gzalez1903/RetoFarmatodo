package com.retofarmatodo.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EpisodioPersonajesPK implements Serializable {

    @Column(name = "id_episodio")
    private Integer idEpisodio;

    @Column(name = "id_personaje")
    private Integer idPersonaje;

    public Integer getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(Integer idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public Integer getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Integer idPersonaje) {
        this.idPersonaje = idPersonaje;
    }
}
