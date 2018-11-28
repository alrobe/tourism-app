package edu.umss.fcyt.tourismapp.destino_turistico;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import edu.umss.fcyt.tourismapp.circuito_turistico.CircuitoTuristico;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
//https://blog.encodez.com/tips/jackson-bidirectional-relationship-the-right-way-preventing-infinite-recursion-exception-with-java-jackson
//@JsonIdentityInfo(
//        generator= ObjectIdGenerators.PropertyGenerator.class,
//        property="id")
public class DestinoTuristico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String pais;
    @NotBlank
    private String departamento;
    @NotBlank
    private String provincia;
    @NotBlank
    private String localidad;
    @NotBlank
    private String clima;
    @NotNull
    private int secuencia;
    @ManyToMany(mappedBy = "destinoTuristicos")
    @JsonIgnore
    private Set<CircuitoTuristico> circuitoTuristicos = new HashSet<CircuitoTuristico>();

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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    public Set<CircuitoTuristico> getCircuitoTuristicos() {
        return circuitoTuristicos;
    }

    public void setCircuitoTuristicos(Set<CircuitoTuristico> circuitoTuristicos) {
        this.circuitoTuristicos = circuitoTuristicos;
    }
}
