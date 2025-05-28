
package edu.usta.interfaces;

import java.util.List;

public interface FuncionalidadCanArt<T> {
    
    public Boolean registrar(T elObjeto); 
    
    public  List<T> consultar(String orden); 
    
    public T buscar(Integer llavePrimaria); 
    
    public Boolean eliminar(Integer llaveprimaria); 
    
    public  Boolean actualizar(T objeto); 
    
    public Integer totalRegistros(); 
}
