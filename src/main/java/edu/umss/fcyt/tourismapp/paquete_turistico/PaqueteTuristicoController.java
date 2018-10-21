package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PaqueteTuristicoController {
    @Autowired
    private PaqueteTuristicoService paqueteTuristicoService;

    @GetMapping("/paquetes")
    public List<PaqueteTuristico> index() {
        return paqueteTuristicoService.getAll();
    }

    @PostMapping("/paquete")
    public PaqueteTuristico create(@Valid @RequestBody PaqueteTuristico paqueteTuristico) {
        return paqueteTuristicoService.save(paqueteTuristico);
    }
}
