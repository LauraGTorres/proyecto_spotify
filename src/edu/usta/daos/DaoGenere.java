package edu.usta.daos;

import edu.usta.database.Conexion;
import edu.usta.domain.generos;
import edu.usta.interfaces.FuncionalidadCanArt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class DaoGenere extends Conexion implements FuncionalidadCanArt<generos> {

    protected String miCadenaSQL;
    protected ResultSet misRegistros;
    protected Connection miObjetoConexion;
    protected Integer miCantidad;
    protected PreparedStatement miConsulta;

    @Override
    public Boolean registrar(generos elObjeto) {
        try {
            miCadenaSQL = "INSERT INTO generos (id_genero, nombre_genero, descripcion_genero)"
                    + "VALUES(?, ?, ?)";
            miObjetoConexion = getConexion();
            miConsulta.executeUpdate();
            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL);

            miConsulta.setInt(1, elObjeto.getId_genero());
            miConsulta.setString(2, elObjeto.getNombre_genero());
            miConsulta.setString(3, elObjeto.getDescripcion_genero());
        } catch (SQLException ex) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false; 
    }

    @Override
    public List<generos> consultar() {
        try {
            
        } catch (Exception e) {
        }
        return null; 
    }

    @Override
    public generos buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean eliminar(Integer llaveprimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(generos objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
