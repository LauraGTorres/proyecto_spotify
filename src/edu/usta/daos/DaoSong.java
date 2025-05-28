
package edu.usta.daos;


import edu.usta.database.Conexion;
import edu.usta.domain.Artist;
import edu.usta.domain.Genere;
import edu.usta.domain.Song;
import edu.usta.interfaces.FuncionalidadCanArt;
import java.math.BigDecimal;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;

public class DaoSong extends Conexion implements FuncionalidadCanArt<Song> {

    protected String miCadenaSQL;
    protected  ResultSet misRegistros; 
    protected Connection miObjetoConexion; 
    protected  Integer miCantidad; 
    protected PreparedStatement miConsulta; 
    
    @Override
    public Boolean registrar(Song elObjeto) {
        try {
            miCadenaSQL = "INSERT INTO CANCION (idCancion, idGenero, idArtista, tituloCancion, duracionCancion, archivoCancion)" 
                    + "VALUES(?, ?, ?, ?, ?, ?)";
            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL); 
            
            miConsulta.setInt(1, elObjeto.getIdCancion());
        } catch (SQLException ex) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//Connection conn = MiConexion.getInstancia().getConexion();
    @Override
    public List<Song> consultar(String orden) {
        try {
            if (orden.isEmpty()) {
                orden = "idCancion"; 
            }
            miCadenaSQL = "SELECT idCancion, idGenero, idArtista, tituloCancion, duracionCancion, archivoCancion From cancion ORDER BY"
                    + orden; 
             miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL); 
             misRegistros = miConsulta.executeQuery(); 
             
             List<Song> arrySong = new ArrayList<>(); 
             while (misRegistros.next()) {
                 int idSon = misRegistros.getInt(1); 
                 int idGen = misRegistros.getInt(2);
                 int idArtis = misRegistros.getInt(3); 
                 String tituloSon = misRegistros.getString(4); 
                 BigDecimal duraSon = misRegistros.getBigDecimal(5); 
                 Byte archiSong = misRegistros.getByte(6); 
                 
                 Artist obArtist = new Artist(); 
                 
                
            }
        } catch (Exception e) {
            
        }
        return null; 
    }

    @Override
    public Song buscar(Integer llavePrimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean eliminar(Integer llaveprimaria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Boolean actualizar(Song objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Integer totalRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
