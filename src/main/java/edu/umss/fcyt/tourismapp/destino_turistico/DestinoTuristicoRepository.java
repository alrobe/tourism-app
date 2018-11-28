package edu.umss.fcyt.tourismapp.destino_turistico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinoTuristicoRepository extends JpaRepository<DestinoTuristico, Long> {
}
