package medi.voli.api.paciente;

import medi.voli.api.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PacienteRepository  extends JpaRepository<Paciente, Long> {
}
