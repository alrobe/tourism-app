package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CalificacionController {
    @Autowired
    private CalificacionService calificacionService;

    @GetMapping("/calificaciones")
    public List<Calificacion> index() {
        return calificacionService.getAll();
    }

    @PostMapping("/calificacion")
    public Calificacion create(@Valid @RequestBody Calificacion calificacion) {
        return calificacionService.save(calificacion);
    }
}
