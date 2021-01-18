package com.example.Universidad.Servicios;

import com.example.Universidad.Modelo.Estudiante;
import com.example.Universidad.Repositorios.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServicioImpl implements EstudianteServicio{

    @Autowired
    EstudianteRepositorio estudianteRepositorio;

    @Override
    public Estudiante CrearEstudiante(Estudiante e) {
        return estudianteRepositorio.save(e);
    }

    @Override
    public Estudiante ActualizarEstudiante(Estudiante e) {
        return estudianteRepositorio.save(e);
    }

    @Override
    public Optional<Estudiante> BuscarEstudiantePorId(long Id) {
        return estudianteRepositorio.findById(Id);
    }


    @Override
    public Estudiante BuscarEstudiantePorNombre(String Nombre) {
        return null;
    }

    @Override
    public List<Estudiante> ListarEstudiantes() {
        return estudianteRepositorio.findAll();
    }

    @Override
    public void EliminarEstudiante(long Id) {
        estudianteRepositorio.deleteById(Id);
    }


}
