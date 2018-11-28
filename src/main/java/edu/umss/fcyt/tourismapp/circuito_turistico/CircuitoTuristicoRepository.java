package edu.umss.fcyt.tourismapp.circuito_turistico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CircuitoTuristicoRepository extends JpaRepository<CircuitoTuristico, Long> {
}
