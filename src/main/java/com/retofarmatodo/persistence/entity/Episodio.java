package com.retofarmatodo.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "episodios")
public class Episodio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_episodio")
    private Integer idEpisodio;


    private String nombre;

    @Column(name = "temporada_episodio")
    private String temporadaEpisodio;

    @Column(name = "fecha_estreno")
    private String fechaEstreno;

    @OneToMany(mappedBy = "episodio")
    private List<EpisodioPersonaje> episodios;

   /* public List<EpisodioPersonaje> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<EpisodioPersonaje> episodios) {
        this.episodios = episodios;
    }*/

    public Integer getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(Integer idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTemporadaEpisodio() {
        return temporadaEpisodio;
    }

    public void setTemporadaEpisodio(String temporadaEpisodio) {
        this.temporadaEpisodio = temporadaEpisodio;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }
}
