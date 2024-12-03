package com.example.demoeventos.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String lugar;
    private LocalDate fecha;
    private LocalTime hora;
    private LocalDate fechaFin;
    private LocalTime horaFin;
    private String descripcion;
    private String organizador;
    private String tipoEvento;
    private Integer capacidad;
    private String imagen;
    private String imagenPortada;
    private Double lat;
    private Double lon;

    // Otros datos relevantes
    private Double costo;
    private String linkRegistro;

    public Evento(Long id, String nombre, String lugar, LocalDate fecha, LocalTime hora, LocalDate fechaFin, LocalTime horaFin, String descripcion, String organizador, String tipoEvento, Integer capacidad, String imagen, String imagenPortada, Double lat, Double lon, Double costo, String linkRegistro) {
        this.id = id;
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.hora = hora;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.descripcion = descripcion;
        this.organizador = organizador;
        this.tipoEvento = tipoEvento;
        this.capacidad = capacidad;
        this.imagen = imagen;
        this.imagenPortada = imagenPortada;
        this.lat = lat;
        this.lon = lon;
        this.costo = costo;
        this.linkRegistro = linkRegistro;
    }

    public Evento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getImagenPortada() {
        return imagenPortada;
    }

    public void setImagenPortada(String imagenPortada) {
        this.imagenPortada = imagenPortada;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    public String getLinkRegistro() {
        return linkRegistro;
    }

    public void setLinkRegistro(String linkRegistro) {
        this.linkRegistro = linkRegistro;
    }
}
