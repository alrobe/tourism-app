package edu.umss.fcyt.tourismapp.paquete_turistico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioService {
    @Autowired
    private ServicioRepository servicioService;

    public List<Servicio> getAll() {
        return servicioService.findAll();
    }

    public Servicio getById(long id)
    {
        return servicioService.findById(id).get();
    }

    public Servicio save(Servicio servicio) {
        return servicioService.save(servicio);
    }
}
