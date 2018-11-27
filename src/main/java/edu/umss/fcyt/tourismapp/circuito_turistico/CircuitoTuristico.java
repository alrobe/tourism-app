package edu.umss.fcyt.tourismapp.circuito_turistico;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import edu.umss.fcyt.tourismapp.destino_turistico.DestinoTuristico;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@JsonIdentityInfo(
        generator= ObjectIdGenerators.PropertyGenerator.class,
        property="id")
public class CircuitoTuristico implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "circuito_destino",
            joinColumns = @JoinColumn(name = "circuito_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "destino_id", referencedColumnName = "id")
    )
//    @JsonIgnore
    private Set<DestinoTuristico> destinoTuristicos = new HashSet<DestinoTuristico>();

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

    public Set<DestinoTuristico> getDestinoTuristicos() {
        return destinoTuristicos;
    }

    public void setDestinoTuristicos(Set<DestinoTuristico> destinoTuristicos) {
        this.destinoTuristicos = destinoTuristicos;
    }
}
//https://hellokoding.com/jpa-many-to-many-relationship-mapping-example-with-spring-boot-maven-and-mysql/