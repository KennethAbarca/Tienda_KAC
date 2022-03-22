package com.tienda.service;

import com.tienda.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    public List<Articulo> getArticulos(boolean activos);
    
    public void save(Articulo articulo); //O inserta o actualiza
    
    public void delete(Articulo articulo); 
    
    public Articulo getArticulo(Articulo articulo); //Busca el registro del articulo y si existe lo devuelve como objeto
}
