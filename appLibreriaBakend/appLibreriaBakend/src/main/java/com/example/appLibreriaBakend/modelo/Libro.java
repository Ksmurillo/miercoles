package com.example.appLibreriaBakend.modelo;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
//@Data// ussar anotaciones de lombok
//@AllArgsConstructor//constructor vacio
//@NoArgsConstructor//costructor con todos los atribitos
//@Getter
//@Setter
//@Table(name = "tbllibros"
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name="idbook",nullable = false,length = 20,unique = true)
    @Column(length = 20)
    private Long id;
    private String name;
    
    //relacion o asocion de que un libro puede ener varios prestamos
    @OneToMany(mappedBy = "Libro")
    @JsonManagedReference

    private List<Prestamo>
    prestamos;
    public Libro(){}

    public Libro(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
