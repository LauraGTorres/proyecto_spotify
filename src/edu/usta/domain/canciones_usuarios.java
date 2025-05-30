
package edu.usta.domain;


public class canciones_usuarios {
    
    private int id_suscripcion_cancion ;
    private int id_cancion  ;
    private int id_usuario ;

    public canciones_usuarios() {
    }

    public canciones_usuarios(int id_suscripcion_cancion, int id_cancion, int id_usuario) {
        this.id_suscripcion_cancion = id_suscripcion_cancion;
        this.id_cancion = id_cancion;
        this.id_usuario = id_usuario;
    }

    public int getId_suscripcion_cancion() {
        return id_suscripcion_cancion;
    }

    public void setId_suscripcion_cancion(int id_suscripcion_cancion) {
        this.id_suscripcion_cancion = id_suscripcion_cancion;
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "canciones_usuarios{" + "id_suscripcion_cancion=" + id_suscripcion_cancion + ", id_cancion=" + id_cancion + ", id_usuario=" + id_usuario + '}';
    }
    
    
    
}
