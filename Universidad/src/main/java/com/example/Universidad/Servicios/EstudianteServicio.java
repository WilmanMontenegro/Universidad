package com.example.Universidad.Servicios;

import com.example.Universidad.Modelo.Estudiante;

import java.util.List;
import java.util.Optional;

public interface EstudianteServicio {
   Estudiante CrearEstudiante(Estudiante e);
   Estudiante ActualizarEstudiante(Estudiante e);
   Optional<Estudiante> BuscarEstudiantePorId(long Id);
   Estudiante BuscarEstudiantePorNombre(String Nombre);
   List<Estudiante> ListarEstudiantes();
   void EliminarEstudiante(long Id);
}
