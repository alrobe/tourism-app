package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
public class ServicioController {
    @Autowired
    private ServicioService servicioService;

    @GetMapping("/servicios")
    public List<Servicio> getAll() {
        return servicioService.getAll();
    }

    @GetMapping("/servicio/{id}")
    public Servicio getById(@PathVariable long id) {
        return servicioService.getById(id);
    }

    @PostMapping("/servicio")
    public Servicio create(@Valid @RequestBody Servicio servicio) {
        return servicioService.save(servicio);
    }

    @DeleteMapping("/servicio/eliminar/{id}")
    public void delete(@PathVariable long id)
    {
        servicioService.delete(id);
    }
}
