
package edu.usta.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private static Conexion instancia;
    private Connection conexion;
    
    

    private final String usuario = "root";
    private final String clave = "";
    private final String url = "jdbc:mysql://localhost:3306/spotify";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    
    public Conexion() {
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Conexión exitosa!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar a la base de datos.");
        }
    }

    // Método público para obtener la única instancia
    public static Conexion getInstancia() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    // Método para obtener la conexión
    public Connection getConexion() {
        return conexion;
    }
}
