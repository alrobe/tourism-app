package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.persistence.PostUpdate;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin
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

    @RequestMapping(
            value = "/paquete/{id}",   //paquete
            method = RequestMethod.PUT
    )                                    //delete path
    public ResponseEntity<Object> update(@Valid @PathVariable Long id, @RequestBody PaqueteTuristico paqueteTuristico) {
                                                                                    // paqueteTuristico.getId()
        Optional<PaqueteTuristico> paqueteTuristicoOptional = paqueteTuristicoService.findById(id);
        if (!paqueteTuristicoOptional.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        PaqueteTuristico paquete = paqueteTuristicoOptional.get();

        paquete.setNombre(paqueteTuristico.getNombre());
        paquete.setDescripcion(paqueteTuristico.getDescripcion());
        paquete.setPrecio(paqueteTuristico.getPrecio());
        paquete.setFotos(paqueteTuristico.getFotos());
        paquete.setCircuitos(paqueteTuristico.getCircuitos());
        paquete.setServicios(paqueteTuristico.getServicios());
        paqueteTuristicoService.update(paquete);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/paquete/{id}")
    public PaqueteTuristico getOne(@PathVariable(value = "id") Long id) {
        return paqueteTuristicoService.getOne(id);
    }

    @DeleteMapping("/paquete/{id}")
    public ResponseEntity<?> deletePaquete(@PathVariable(value = "id") Long id) {
        return paqueteTuristicoService.deletePaquete(id);
    }
}
