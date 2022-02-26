package com.tienda.service;

import com.tienda.domain.Cliente;
import java.util.List;


public interface ClienteService {
    public List<Cliente> getCliente();
    
    public void save(Cliente cliente); //O inserta o actualiza
    
    public void delete(Cliente cliente); 
    
    public Cliente getCliente(Cliente cliente); //Busca el registro del cliente y si existe lo devuelve como objeto
}
