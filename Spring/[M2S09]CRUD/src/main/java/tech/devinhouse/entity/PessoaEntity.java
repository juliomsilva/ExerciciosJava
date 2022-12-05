package tech.devinhouse.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;


@Entity(name = "pessoas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PessoaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Está anotação serve apenas caso a coluna do banco de dados seja diferente, caso seja igual nao precisa usar
    private Long id;

    @Column(name="name")
    @NotNull

    private String name;


    @Column(name = "email")
    @NotNull
    private String email;

    @Column(name="status")
    @NotNull
    private boolean status;

    @Column(name="empresa_id")
    private Long empresa;
}
