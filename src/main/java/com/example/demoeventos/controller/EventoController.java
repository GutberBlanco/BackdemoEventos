package com.example.demoeventos.controller;

import com.example.demoeventos.entity.Evento;
import com.example.demoeventos.service.EventoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/eventos")
@CrossOrigin(origins = "*")
public class EventoController {
    private final EventoService service;

    public EventoController(EventoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Evento> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evento> obtenerPorId(@PathVariable Long id) {
        return service.obtenerPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Evento crearEvento(@RequestBody Evento evento) {
        return service.guardarEvento(evento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evento> actualizarEvento(@PathVariable Long id, @RequestBody Evento eventoActualizado) {
        return service.obtenerPorId(id)
                .map(evento -> {
                    evento.setNombre(eventoActualizado.getNombre());
                    evento.setLugar(eventoActualizado.getLugar());
                    evento.setFecha(eventoActualizado.getFecha());
                    evento.setHora(eventoActualizado.getHora());
                    evento.setFechaFin(eventoActualizado.getFechaFin());
                    evento.setHoraFin(eventoActualizado.getHoraFin());
                    evento.setDescripcion(eventoActualizado.getDescripcion());
                    evento.setOrganizador(eventoActualizado.getOrganizador());
                    evento.setTipoEvento(eventoActualizado.getTipoEvento());
                    evento.setCapacidad(eventoActualizado.getCapacidad());
                    evento.setImagen(eventoActualizado.getImagen());
                    evento.setImagenPortada(eventoActualizado.getImagenPortada());
                    evento.setLat(eventoActualizado.getLat());
                    evento.setLon(eventoActualizado.getLon());
                    evento.setCosto(eventoActualizado.getCosto());
                    evento.setLinkRegistro(eventoActualizado.getLinkRegistro());
                    return ResponseEntity.ok(service.guardarEvento(evento));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarEvento(@PathVariable Long id) {
        if (service.obtenerPorId(id).isPresent()) {
            service.eliminarEvento(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/tipo/{tipoEvento}")
    public List<Evento> listarPorTipoEvento(@PathVariable String tipoEvento) {
        return service.listarPorTipoEvento(tipoEvento);
    }

    @GetMapping("/buscar")
    public List<Evento> buscarPorNombre(@RequestParam String nombre) {
        return service.buscarPorNombre(nombre);
    }
}
