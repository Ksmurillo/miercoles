package com.example.appLibreriaBakend.modelo;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate fechaprestamo;
    private LocalDate fechadevolucion;

    //relacion de de muchos a  un libro
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    @JsonBackReference
    private Libro Libro;
    public Prestamo(){}

    public Prestamo(long id, LocalDate fechaprestamo, LocalDate fechadevolucion) {
        this.id = id;
        this.fechaprestamo = fechaprestamo;
        this.fechadevolucion = fechadevolucion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(LocalDate fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public LocalDate getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(LocalDate fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
}
