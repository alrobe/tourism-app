package edu.umss.fcyt.tourismapp.paquete_turistico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
public class PaqueteTuristico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "nombre no debe ser nulo/vacio")
    private String nombre;

    @NotBlank(message = "descripcion no debe ser nulo/vacio")
    private String descripcion;

    @NotNull(message = "precio no debe ser nulo/vacio")
    private BigDecimal precio;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "paquete_turistico_id")
    @NotNull
    private List<Foto> fotos = new ArrayList<Foto>();

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }
}
