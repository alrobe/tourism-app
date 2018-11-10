package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaqueteTuristicoService {
    @Autowired
    private PaqueteTuristicoRepository paqueteTuristicoRepository;

    public List<PaqueteTuristico> getAll() {
        return paqueteTuristicoRepository.findAll();
    }

    public PaqueteTuristico getById(long id) {
        return paqueteTuristicoRepository.findById(id).get();
    }

    public PaqueteTuristico save(PaqueteTuristico paqueteTuristico) {
        return paqueteTuristicoRepository.save(paqueteTuristico);
    }
}
