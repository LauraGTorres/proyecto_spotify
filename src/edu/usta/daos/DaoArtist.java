package edu.usta.daos;

import edu.usta.database.Conexion;
import edu.usta.domain.artistas;
import edu.usta.interfaces.FuncionalidadCanArt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoArtist extends Conexion implements FuncionalidadCanArt<artistas> {

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
            miObjetoConexion = getConexion();
            miConsulta.executeUpdate();
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
        try {
            miObjetoConexion = getConexion();

            miCadenaSQL = "SELECT id_artista, nombre_artista FROM artistas";
            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL);
            misRegistros = miConsulta.executeQuery();
            
            List<artistas> arryArtist = new ArrayList<>(); 
            
            while (misRegistros.next()) {
                int idArtis = misRegistros.getByte(0); 
                String nomArtis = misRegistros.getString(1);
                
                artistas objArtist = new  artistas(idArtis, nomArtis);
                arryArtist.add(objArtist); 
            }
            miObjetoConexion.close();
            return arryArtist; 
        } catch (SQLException ex) {
            Logger.getLogger(DaoArtist.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null; 
    }

    @Override
    public artistas buscar(Integer llavePrimaria) {
        try {
            miObjetoConexion = getConexion(); 
            miCadenaSQL = "SELECT c.id_artista, c.nombre_artista FROM artistas WHERE id_artista = ?"; 
            
            miConsulta = miObjetoConexion.prepareCall(miCadenaSQL);
            miConsulta.setInt(1, llavePrimaria);
            misRegistros = miConsulta.executeQuery(); 
            
            artistas objEncontrado = null; 
            
            if (misRegistros.next()) {
                int idArtis = misRegistros.getInt(1); 
                String nomArtis = misRegistros.getString(2); 
                
            }
            
       } catch (Exception ex) {
        }
        return null; 
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
