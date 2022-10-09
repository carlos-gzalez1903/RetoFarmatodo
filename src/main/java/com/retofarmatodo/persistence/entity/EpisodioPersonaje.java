package com.retofarmatodo.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "episodios_personajes")
public class EpisodioPersonaje {

    @EmbeddedId
    private EpisodioPersonajesPK id;

    public EpisodioPersonajesPK getId() {
        return id;
    }

    public void setId(EpisodioPersonajesPK id) {
        this.id = id;
    }
}
