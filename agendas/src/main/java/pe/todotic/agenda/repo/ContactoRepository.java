package pe.todotic.agenda.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.todotic.agenda.model.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}
