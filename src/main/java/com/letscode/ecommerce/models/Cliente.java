package com.letscode.ecommerce.models;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cliente")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sobrenome")
    private String sobrenome;

    @Column(name = "email")
    private String email;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "cpf")
    private String cpf;

    //@JsonIgnoreProperties(allowGetters = true)
    @Column(name="senha")
    private String senha;
    
    @Enumerated(EnumType.STRING)
    private PerfilEnum perfil;


    public Cliente(String nome, String sobrenome, String email, String sexo, String cpf, String senha, PerfilEnum perfil) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
        this.senha = senha;
        this.perfil = perfil;
    }
   

}
