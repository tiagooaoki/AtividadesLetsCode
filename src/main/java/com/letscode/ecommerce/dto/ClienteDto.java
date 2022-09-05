package com.letscode.ecommerce.dto;

/* Esta estrutura serve para montar um classe que não esta toda formado no banco de dados que se esta trabalho. 
Exemplo, caso existisse uma validação em cpf que vai ao sistema do governo e checa se é válido e esta ativo. 
Neste caso ClienteDTO é uma replica de Cliente + a busca de um servidor (api) externo que vai montar o cliente
*/
public class ClienteDto {
    private long id;
    private String nome;
    private String sobrenome;
    private String email;
    private String sexo;
    private String cpf;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ClienteDto(long id, String nome, String sobrenome, String email, String sexo, String cpf){
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.sexo = sexo;
        this.cpf = cpf;
    }


    public ClienteDto() {}
}
