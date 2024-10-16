package com.tareas.tareas.services;

import com.tareas.tareas.entities.Tareas;
import com.tareas.tareas.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public Optional<Tareas> getTarea(Long id) {
        return this.tareaRepository.findById(id);
    }

    public List<Tareas> getAllTareas(){
        return this.tareaRepository.findAll();
    }

    public void saveTarea(Tareas tarea) {
        this.tareaRepository.save(tarea);
    }

    public void deleteTarea(Long id) {
        this.tareaRepository.deleteById(id);
    }


}
