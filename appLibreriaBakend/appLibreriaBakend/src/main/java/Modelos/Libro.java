package Modelos;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data// ussar anotaciones de lombok
@AllArgsConstructor//constructor vacio
@NoArgsConstructor//costructor con todos los atribitos
@Getter
@Setter
@Table(name = "tbllibros")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idbook",nullable = false,length = 20,unique = true)
    private Long id;
    private String name;
}
