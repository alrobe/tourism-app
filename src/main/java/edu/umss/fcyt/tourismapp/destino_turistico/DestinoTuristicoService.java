package edu.umss.fcyt.tourismapp.destino_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DestinoTuristicoService {
    @Autowired
    private DestinoTuristicoRepository destinoTuristicoRepository;
}
