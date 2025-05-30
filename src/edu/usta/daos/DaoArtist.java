
package edu.usta.daos;

import edu.usta.database.Conexion;
import edu.usta.domain.artistas;
import edu.usta.interfaces.FuncionalidadCanArt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DaoArtist extends Conexion implements FuncionalidadCanArt<artistas>{

    protected String miCadenaSQL;
    protected ResultSet misRegistros;
    protected Connection miObjetoConexion;
    protected Integer miCantidad;
    protected PreparedStatement miConsulta;

    @Override
    public Boolean registrar(artistas elObjeto) {
         try {
            miCadenaSQL = "INSERT INTO artistas (id_artista, nombre_artista)"
                    + "VALUES(?, ?)";
            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL);

            miConsulta.setInt(1, elObjeto.getId_artista());
            miConsulta.setString(2, elObjeto.getNombre_artista());
        } catch (SQLException ex) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<artistas> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public artistas buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean eliminar(Integer llaveprimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(artistas objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
