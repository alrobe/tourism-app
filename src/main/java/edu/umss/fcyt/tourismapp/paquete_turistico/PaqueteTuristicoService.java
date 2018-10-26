package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaqueteTuristicoService {
    @Autowired
    private PaqueteTuristicoRepository paqueteTuristicoRepository;

    public List<PaqueteTuristico> getAll() {
        return paqueteTuristicoRepository.findAll();
    }

    public PaqueteTuristico save(PaqueteTuristico paqueteTuristico) {
        return paqueteTuristicoRepository.save(paqueteTuristico);
    }
    public PaqueteTuristico update (PaqueteTuristico paqueteTuristico) {
        return paqueteTuristicoRepository.save(paqueteTuristico);
    }
    public Optional<PaqueteTuristico> findById(long id) {
        return paqueteTuristicoRepository.findById(id);
    }

}
