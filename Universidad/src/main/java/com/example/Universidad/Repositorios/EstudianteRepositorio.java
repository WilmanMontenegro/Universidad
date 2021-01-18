package com.example.Universidad.Repositorios;


import com.example.Universidad.Modelo.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante,Long>{

}
