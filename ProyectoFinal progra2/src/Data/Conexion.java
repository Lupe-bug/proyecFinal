/*A diferencia de MySQL y otras MDBS, SQLite no requiere de un usuario, contraseña
o puerto para acceder a esta ya que es una base de datos local. En este caso se
utlizará conectar las tablas del archivo "store.db" a la aplicación Java*/
package Data;

import java.sql.*;

public class Conexion {

    Connection conn = null;

    public static Connection conexion() {
        try {
            Class.forName("org.sqlite.JDBC");
            //Creamos la clase conexión para la BD con Sqlite asignandole una ubicación. 
            Connection conn = DriverManager.getConnection("jdbc:sqlite:Store.db");
            /*Aquí se utiliza una ruta relativa ya que la base de datos se encuentra
            dentro del proyecto*/
            System.out.println("La base de datos se ha conectado con exito.");
            return conn;
        } catch (Exception e) {
            System.out.println("La base de datos no se pudo conectar." + e);
            return null;
        }
    }
}
