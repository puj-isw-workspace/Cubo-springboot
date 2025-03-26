package tareas.repository;

import tareas.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TareasRepository extends JpaRepository<Tarea, Long> {
    
}