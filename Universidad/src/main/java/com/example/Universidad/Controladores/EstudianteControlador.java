package com.example.Universidad.Controladores;

import com.example.Universidad.Modelo.Estudiante;
import com.example.Universidad.Servicios.EstudianteServicioImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {
    @Autowired
    private EstudianteServicioImpl estudianteServicio;
    @GetMapping
    public List<Estudiante>ListarEstudiantes(){
        return estudianteServicio.ListarEstudiantes();
    }
    @GetMapping("/{Id}")
    public Optional<Estudiante> BuscarPorId(@PathVariable("Id") long Id){
        return estudianteServicio.BuscarEstudiantePorId(Id);
    }
    @PostMapping
    public Estudiante CrearEstudiante(@RequestBody Estudiante e){
        return estudianteServicio.CrearEstudiante(e);
    }
    @PutMapping
    public Estudiante ActualizarEstudiante(@RequestBody Estudiante e){
        return estudianteServicio.ActualizarEstudiante(e);
    }
    @DeleteMapping("/{Id}")
    public void BorrarEstudiante(@PathVariable("Id") long Id){
        estudianteServicio.EliminarEstudiante(Id);
    }
}
