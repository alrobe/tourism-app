package edu.umss.fcyt.tourismapp.destino_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class DestinoTuristicoController {
    @Autowired
    private DestinoTuristicoService destinoTuristicoService;
}
