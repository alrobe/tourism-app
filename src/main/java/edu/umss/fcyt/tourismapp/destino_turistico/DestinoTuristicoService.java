package edu.umss.fcyt.tourismapp.destino_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoTuristicoService {
    @Autowired
    private DestinoTuristicoRepository destinoTuristicoRepository;

    public List<DestinoTuristico> getAll() {
        return destinoTuristicoRepository.findAll();
    }

    public DestinoTuristico getDestinoTuristicoById(Long id) { return destinoTuristicoRepository.findById(id).get(); }

    public ResponseEntity<?> deleteDestinoTuristico(Long id) {
        DestinoTuristico destinoTuristico = destinoTuristicoRepository.findById(id).get();
        destinoTuristicoRepository.delete(destinoTuristico);
        return ResponseEntity.ok().build();
    }
}
