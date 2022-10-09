package com.retofarmatodo.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "episodios_personajes")
public class EpisodioPersonaje {

    @EmbeddedId
    private EpisodioPersonajesPK id;

    @ManyToOne
    @JoinColumn(name = "id_episodio", insertable = false, updatable = false)
    private Episodio episodio;

    @ManyToOne
    @JoinColumn(name = "id_personaje", insertable = false, updatable = false)
    private Personaje personaje;

    public Episodio getEpisodio() {
        return episodio;
    }

    public void setEpisodio(Episodio episodio) {
        this.episodio = episodio;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public EpisodioPersonajesPK getId() {
        return id;
    }

    public void setId(EpisodioPersonajesPK id) {
        this.id = id;
    }
}
