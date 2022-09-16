package com.letscode.ecommerce.dto;

import com.letscode.ecommerce.models.PerfilEnum;

import lombok.Data;

/* Esta estrutura serve para montar um classe que não esta toda formado no banco de dados que se esta trabalho. 
Exemplo, caso existisse uma validação em cpf que vai ao sistema do governo e checa se é válido e esta ativo. 
Neste caso ClienteDTO é uma replica de Cliente + a busca de um servidor (api) externo que vai montar o cliente
*/
@Data
public class ClienteDto {
    private long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String sexo;
    private String cpf;
    private String senha;
    private PerfilEnum perfil;

    public ClienteDto(String nome, String sobrenome, String email, String sexo, String cpf){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
    }


    public ClienteDto() {}
}
