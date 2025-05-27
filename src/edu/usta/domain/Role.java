
package edu.usta.domain;


public class Role {
    private int idRol;
    private String nombreRorl;
    private boolean estadoRol;

    public Role() {
    }
    

    public Role(int idRol, String nombreRorl, boolean estadoRol) {
        this.idRol = idRol;
        this.nombreRorl = nombreRorl;
        this.estadoRol = estadoRol;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getNombreRorl() {
        return nombreRorl;
    }

    public void setNombreRorl(String nombreRorl) {
        this.nombreRorl = nombreRorl;
    }

    public boolean getEstadoRol() {
        return estadoRol;
    }

    public void setEstadoRol(boolean estadoRol) {
        this.estadoRol = estadoRol;
    }

    @Override
    public String toString() {
        return "Role{" + "idRol=" + idRol + ", nombreRorl=" + nombreRorl + ", estadoRol=" + estadoRol + '}';
    }
    
    
    
     
    
}
