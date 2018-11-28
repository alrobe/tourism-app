package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CalificacionService {
    @Autowired
    private CalificacionRepository calificacionService;

    public List<Calificacion> getAll() {
        return calificacionService.findAll();
    }

    public Calificacion save(Calificacion calificacion) {
        return calificacionService.save(calificacion);
    }
}
