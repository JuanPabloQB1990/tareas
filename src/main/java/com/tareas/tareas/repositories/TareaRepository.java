package com.tareas.tareas.repositories;

import com.tareas.tareas.entities.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tareas, Long> {

}
