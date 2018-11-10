package edu.umss.fcyt.tourismapp.circuit;

import edu.umss.fcyt.tourismapp.destination.Destination;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Circuit")
public class Circuit {
    @Id
    @GeneratedValue
    private Long id;
    
    @NotBlank
    private String nombre;
    
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Circuit_Destination", 
        joinColumns = { @JoinColumn(name = "Circuit_id") }, 
        inverseJoinColumns = { @JoinColumn(name = "Destination_id") }
    )
    Set<Destination> destinos = new HashSet<>();

    public Circuit() {
    }

    public Set<Destination> getDestinos() {
        return destinos;
    }

    public void setDestinos(Set<Destination> destinos) {
        this.destinos = destinos;
    }
    
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
    
}
