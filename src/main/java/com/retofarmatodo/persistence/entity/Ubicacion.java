package com.retofarmatodo.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ubicaciones")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ubicacion")
    private Integer idUbicaion;

    private String nombre;

    private String dimension;

    private String tipo;

    @OneToMany(mappedBy = "ubicacion")
    private List<Personaje> personajes;

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Integer getIdUbicaion() {
        return idUbicaion;
    }

    public void setIdUbicaion(Integer idUbicaion) {
        this.idUbicaion = idUbicaion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
