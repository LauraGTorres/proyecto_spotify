package edu.usta.daos;

import edu.usta.database.Conexion;
import edu.usta.domain.artistas;
import edu.usta.domain.generos;
import edu.usta.domain.canciones;
import edu.usta.domain.artistas;
import edu.usta.domain.canciones;
import edu.usta.domain.generos;
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

public class DaoSong extends Conexion implements FuncionalidadCanArt<canciones> {

    protected String miCadenaSQL;
    protected ResultSet misRegistros;
    protected Connection miObjetoConexion;
    protected Integer miCantidad;
    protected PreparedStatement miConsulta;

    @Override
    public Boolean registrar(canciones elObjeto) {
        try {
            
            miCadenaSQL = "INSERT INTO canciones (id_cancion, id_genero, id_artista, titulo_cancion, duracion_cancion, archivo_cancion)"
                    + "VALUES(?, ?, ?, ?, ?, ?)";
            miObjetoConexion = getConexion();
            miConsulta.executeUpdate();
            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL);

            miConsulta.setInt(1, elObjeto.getId_cancion());
            miConsulta.setInt(2, elObjeto.getId_genero());
            miConsulta.setInt(3, elObjeto.getId_artista());
            miConsulta.setString(4, elObjeto.getTitulo_cancion());
            miConsulta.setBigDecimal(5, elObjeto.getDuracion_cancion());
            miConsulta.setBytes(6, elObjeto.getArchivo_cancion());
        } catch (SQLException ex) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

//Connection conn = MiConexion.getInstancia().getConexion();
    @Override
    public List<canciones> consultar() {
        try {
            miObjetoConexion = getConexion();

            miCadenaSQL = "SELECT id_cancion, id_genero, id_artista, titulo_cancion, duracion_cancion, archivo_cancion FROM canciones";
            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL);
            misRegistros = miConsulta.executeQuery();

            List<canciones> arrySong = new ArrayList<>();
            while (misRegistros.next()) {
                int idSon = misRegistros.getInt(1);
                int idGen = misRegistros.getInt(2);
                int idArtis = misRegistros.getInt(3);
                String tituloSon = misRegistros.getString(4);
                BigDecimal duraSon = misRegistros.getBigDecimal(5);
                byte[] archiPeso = misRegistros.getBytes(6);

                canciones objSong = new canciones(idSon, idGen, idArtis, tituloSon, duraSon, archiPeso);

                arrySong.add(objSong);
            }
            miObjetoConexion.close();
            return arrySong;
        } catch (SQLException ex) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public canciones buscar(Integer llavePrimaria) {
        try {
            miObjetoConexion = getConexion();
            miCadenaSQL = "SELECT c.id_cancion, c.id_genero, c.id_artista, "
                    + "c.titulo_cancion, c.duracion_cancion, c.archivo_cancion, "
                    + "g.id_genero, g.nombre_genero, g.descripcion_genero "
                    + "FROM canciones c INNER JOIN generos g "
                    + "ON c.id_genero = g.id_genero "
                    + "WHERE c.id_cancion = ?";

            miConsulta = miObjetoConexion.prepareCall(miCadenaSQL);
            miConsulta.setInt(1, llavePrimaria);
            misRegistros = miConsulta.executeQuery();

            canciones objEncontrado = null;

            if (misRegistros.next()) {
                int idSon = misRegistros.getInt(1);
                int idGen = misRegistros.getInt(2);
                int idArtis = misRegistros.getInt(3);
                String tituloSon = misRegistros.getString(4);
                BigDecimal duraSon = misRegistros.getBigDecimal(5);
                byte[] archiPeso = misRegistros.getBytes(6);

                canciones objSong = new canciones(); 
            }

            miObjetoConexion.close();
            return objEncontrado;

        } catch (Exception ex) {
        }
        return null;
    }

    @Override
    public Boolean eliminar(Integer llaveprimaria) {
        try {
            miObjetoConexion = getConexion();
            miCadenaSQL = "DELETE FROM canciones WHERE id_cancion=?";
            miConsulta = miObjetoConexion.prepareCall(miCadenaSQL);

            miConsulta.setInt(1, llaveprimaria);
            miCantidad = miConsulta.executeUpdate();
            miObjetoConexion.close();
            return miCantidad > 0;

        } catch (Exception ex) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean actualizar(canciones objeto) {
        try {
            miObjetoConexion = getConexion();
            miCadenaSQL = "UPDATE canciones SET id_genero = ?, id_artista = ?, titulo_cancion = ?, "
                    + "duracion_cancion = ?, archivo_cancion = ? WHERE id_cancion = ?";

            miConsulta.setInt(1, objeto.getId_genero());
            miConsulta.setInt(2, objeto.getId_artista());
            miConsulta.setString(3, objeto.getTitulo_cancion());
            miConsulta.setBigDecimal(4, objeto.getDuracion_cancion());
            miConsulta.setBytes(5, objeto.getArchivo_cancion());
            miConsulta.setInt(6, objeto.getId_cancion());

            miCantidad = miConsulta.executeUpdate();
            miObjetoConexion.close();

            return miCantidad > 0; // true si se actualizó algo

        } catch (Exception e) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

}
