
package edu.usta.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexion {
  

    private static final String URL = "jdbc:mysql://localhost:3306/spotify";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // pon tu contraseña si tienes una

    public static Connection getConexion() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
