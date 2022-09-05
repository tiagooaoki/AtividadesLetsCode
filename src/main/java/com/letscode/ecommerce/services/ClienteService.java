package com.letscode.ecommerce.services;

import java.util.List;

import com.letscode.ecommerce.dto.ClienteDto;
import com.letscode.ecommerce.models.Cliente;

public interface ClienteService {
    List<Cliente> listarTodosClientes();

    boolean novoCliente(ClienteDto clienteDto);

    boolean atualizarCliente(Cliente cliente);

    boolean removerCliente(long id);
}
