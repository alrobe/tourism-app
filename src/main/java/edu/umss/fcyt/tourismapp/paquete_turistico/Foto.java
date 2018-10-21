package edu.umss.fcyt.tourismapp.paquete_turistico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

@Entity
public class Foto {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String nombre;

    @NotBlank
    private String tipo;

    @Lob
    @NotBlank
    private String data;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
