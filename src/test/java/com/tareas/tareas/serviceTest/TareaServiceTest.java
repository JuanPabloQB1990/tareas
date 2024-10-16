package com.tareas.tareas.serviceTest;


import com.tareas.tareas.entities.Tareas;
import com.tareas.tareas.repositories.TareaRepository;
import com.tareas.tareas.services.TareaService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TareaServiceTest {

    private TareaService tareaService;
    private TareaRepository tareaRepository;


    @BeforeEach
    public void setUp(){
        this.tareaRepository = mock(TareaRepository.class);
        this.tareaService = new TareaService(this.tareaRepository);
    }

    @Test
    public void testGetTareaById(){
        Tareas tarea = new Tareas(1L, "Tarea 1 test", "descripcion tarea test 1");

        when(this.tareaRepository.findById(anyLong())).thenReturn(Optional.of(tarea));

        Optional<Tareas> tareaEncontrada = this.tareaService.getTarea(1L);

        Assertions.assertNotNull(tareaEncontrada);
    }
}
