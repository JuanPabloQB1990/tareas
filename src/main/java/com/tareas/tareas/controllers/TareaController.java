package com.tareas.tareas.controllers;

import com.tareas.tareas.entities.Tareas;
import com.tareas.tareas.services.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping("/tarea/{id}")
    public Tareas getTarea(@PathVariable(name = "id") Long id){
        return this.tareaService.getTarea(id).orElseThrow();
    }

    @GetMapping
    public List<Tareas> getAllTareas(){
        return this.tareaService.getAllTareas();
    }

    @PostMapping
    public void saveTarea(@RequestBody Tareas tarea){
        this.tareaService.saveTarea(tarea);
    }

    @DeleteMapping(path = "/tarea/{id}")
    public void deleteTarea(@PathVariable(name = "id") Long id){
        this.tareaService.deleteTarea(id);
    }

}
