package com.example.demoeventos.repository;

import com.example.demoeventos.entity.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventoRepository extends JpaRepository<Evento, Long>{
    List<Evento> findByTipoEvento(String tipoEvento);
    List<Evento> findByNombreContainingIgnoreCase(String nombre);
}
