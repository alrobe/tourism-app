
package edu.umss.fcyt.tourismapp.paquete_turistico;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Calificacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private long id;
    
    @NotNull
    private int valor;

    //@ManyToOne
    private long paquete_turistico_id; 

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    private String comentario;

    public long getPaqueteTuristicoId()
    {
        return paquete_turistico_id;
    }

    public void setPaqueteTuristicoId(long paquete_turistico_id)
    {
        this.paquete_turistico_id = paquete_turistico_id;
    }
}
