package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conexion;

    private static final String URL = "jdbc:mysql://localhost:3306/fruver";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "Nakamura1997*";

    public Connection conectar() {
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos.");
            e.printStackTrace();
        }

        return conexion;
    }
}