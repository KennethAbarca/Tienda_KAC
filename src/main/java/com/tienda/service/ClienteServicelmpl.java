package com.tienda.service;

import com.tienda.dao.ClienteDao;
import com.tienda.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //Permite que podamos usar la implementacion en el controlador
public class ClienteServicelmpl implements ClienteService {

    @Autowired
    private ClienteDao clienteDao;
    
    @Override
    public List<Cliente> getCliente() {
       return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    public void save(Cliente cliente) {
       clienteDao.save(cliente);
    }

    @Override
    public void delete(Cliente cliente) {
       clienteDao.delete(cliente);
    }

    @Override
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdCliente()).orElse(null);
    }
}