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
    protected ResultSet misRegistros;
    protected Connection miObjetoConexion;
    protected Integer miCantidad;
    protected PreparedStatement miConsulta;

    @Override
    public Boolean registrar(Song elObjeto) {
        try {
            miCadenaSQL = "INSERT INTO canciones (id_cancion, id_genero, id_artista, titulo_cancion, duracion_cancion, archivo_cancion)"
                    + "VALUES(?, ?, ?, ?, ?, ?)";
            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL);

            miConsulta.setInt(1, elObjeto.getIdCancion());
            miConsulta.setInt(2, elObjeto.getIdGenero());
            miConsulta.setInt(3, elObjeto.getIdArtista());
            miConsulta.setString(4, elObjeto.getTituloCancion());
            miConsulta.setBigDecimal(5, elObjeto.getDuracionCancion());
            miConsulta.setBytes(6, elObjeto.getArchivoCancion());
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
                orden = "id_cancion";
            }
            miCadenaSQL = "SELECT id_cancion, id_genero, id_artista, titulo_cancion, duracion_cancion, archivo_cancion FROM canciones ORDER BY"
                    + orden;
            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL);
            misRegistros = miConsulta.executeQuery();

            List<Song> arrySong = new ArrayList<>();
            while (misRegistros.next()) {
                int idSon = misRegistros.getInt(1);
                int idGen = misRegistros.getInt(2);
                int idArtis = misRegistros.getInt(3);
                String nomGenere = misRegistros.getString(4);
                String descGenere = misRegistros.getString(5);
                String tituloSon = misRegistros.getString(6);
                BigDecimal duraSon = misRegistros.getBigDecimal(7);
                byte[] archiPeso = misRegistros.getBytes(8);

                Artist obArtist = new Artist();
                Genere objGenere = new Genere(idGen, nomGenere, descGenere);
                Song objSong = new Song(idSon, idGen, idArtis, tituloSon, duraSon, archiPeso);

                arrySong.add(objSong);
            }
            miObjetoConexion.close();;
            return arrySong;
        } catch (SQLException ex) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Song buscar(Integer llavePrimaria) {
        try {
            miCadenaSQL = "SELECT c.id_cancion, c.id_genero, c.id_artista, "
                    + "c.titulo_cancion, c.duracion_cancion, c.archivo_cancion, "
                    + "g.id_genero, g.nombre_genero, g.descripcion_genero "
                    + "FROM canciones c INNER JOIN generos_musicales g "
                    + "ON c.id_genero = g.id_genero "
                    + "WHERE c.id_cancion = ?";

            miConsulta = miObjetoConexion.prepareCall(miCadenaSQL);
            miConsulta.setInt(1, llavePrimaria);
            misRegistros = miConsulta.executeQuery();

            Song objEncontrado = null;

            if (misRegistros.next()) {
                int idSon = misRegistros.getInt(1);
                int idGen = misRegistros.getInt(2);
                int idArtis = misRegistros.getInt(3);
                String nomGenere = misRegistros.getNString(4);
                String descGenere = misRegistros.getNString(5);
                String tituloSon = misRegistros.getString(6);
                BigDecimal duraSon = misRegistros.getBigDecimal(7);
                byte archiSong = misRegistros.getByte(8);
                byte[] archiPeso = {archiSong};

                Artist objArtist = new Artist();
                Genere objGenere = new Genere(idGen, nomGenere, descGenere);
                objEncontrado = new Song(idSon, idGen, idArtis, tituloSon, duraSon, archiPeso);
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
    public Boolean actualizar(Song objeto) {
        try {
            miCadenaSQL = "UPDATE canciones SET id_genero = ?, id_artista = ?, titulo_cancion = ?, "
                    + "duracion_cancion = ?, archivo_cancion = ? WHERE id_cancion = ?";

            miConsulta = miObjetoConexion.prepareStatement(miCadenaSQL);
            miConsulta.setInt(1, objeto.getIdGenero());
            miConsulta.setInt(2, objeto.getIdArtista());
            miConsulta.setString(3, objeto.getTituloCancion());
            miConsulta.setBigDecimal(4, objeto.getDuracionCancion());
            miConsulta.setBytes(5, objeto.getArchivoCancion());
            miConsulta.setInt(6, objeto.getIdCancion()); // WHERE

            miCantidad = miConsulta.executeUpdate();
            miObjetoConexion.close();

            return miCantidad > 0; // true si se actualizó algo

        } catch (Exception e) {
            Logger.getLogger(DaoSong.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }

    @Override
    public Integer totalRegistros() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
