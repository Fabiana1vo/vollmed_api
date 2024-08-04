package med.vol.api.pacientes;

import io.micrometer.observation.ObservationFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<paciente, Long> {
    Page<paciente> findAllByAtivoTrue(Pageable paginacao);
}
