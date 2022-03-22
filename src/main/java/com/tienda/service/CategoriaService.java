package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activos);
    
    public void save(Categoria categoria); //O inserta o actualiza
    
    public void delete(Categoria categoria); 
    
    public Categoria getCategoria(Categoria categoria); //Busca el registro del categoria y si existe lo devuelve como objeto
}
