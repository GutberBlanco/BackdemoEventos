package com.example.demoeventos.service;

import com.example.demoeventos.entity.Evento;
import com.example.demoeventos.repository.EventoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    private final EventoRepository repository;

    public EventoService(EventoRepository repository) {
        this.repository = repository;
    }

    public List<Evento> listarTodos() {
        return repository.findAll();
    }

    public Optional<Evento> obtenerPorId(Long id) {
        return repository.findById(id);
    }

    public Evento guardarEvento(Evento evento) {
        return repository.save(evento);
    }

    public void eliminarEvento(Long id) {
        repository.deleteById(id);
    }
}
