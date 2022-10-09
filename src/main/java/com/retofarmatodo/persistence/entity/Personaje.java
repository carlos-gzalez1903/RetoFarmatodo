package com.retofarmatodo.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "personajes")
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_personaje")
    private Integer idPersonaje;

    private String nombre;

    private String especie;

    private String genero;

    @ManyToOne
    @JoinColumn(name = "id_ubicacion", insertable = false, updatable = false)
    private Ubicacion ubicacion;

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
    @OneToMany(mappedBy = "personaje")
    private List<EpisodioPersonaje> personajes;

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Integer getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(Integer idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
