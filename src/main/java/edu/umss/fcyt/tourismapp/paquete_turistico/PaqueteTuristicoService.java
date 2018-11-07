package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.ResponseEntity;

import java.util.List;

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

    public PaqueteTuristico getOne(Long id) {
        return paqueteTuristicoRepository.findById(id).get();
    }

    public ResponseEntity<?> deletePaquete(Long id) {
        PaqueteTuristico paquete = paqueteTuristicoRepository.findById(id).get();
        paqueteTuristicoRepository.delete(paquete);
        return ResponseEntity.ok().build();
    }
}
