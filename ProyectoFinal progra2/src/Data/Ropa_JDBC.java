package Data;

import Domain.Ropa_DTO;
import java.util.List;
import java.sql.*;

public class Ropa_JDBC implements Ropa_DAO {

    final String INSERT = "INSERT INTO Ropa(Nombre, Precio Q, Existencias, porcentaje_oferta, imagen) VALUES (?,?,?,?,?)";
    final String UPDATE = "UPDATE Ropa SET Nombre = ?, Precio Q = ?, Existencias = ?, porcentaje_oferta = ?, imagen = ? WHERE Id = ?";
    final String DELETE = "DELETE FROM Ropa WHERE Id = ?";
    final String GETALL = "SELECT Id, Nombre, Precio Q, Existencias, porcentaje_ofera, Imagen FROM Ropa";
    final String GETONE = "SELECT Id, Nombre, Precio Q, Existencias, porcentaje_ofera, Imagen FROM Ropa WHERE Id = ?";

    private Connection conn;

    public Ropa_JDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(Ropa_DTO y) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, y.getNombre());
            stat.setFloat(2, y.getPrecio());
            stat.setInt(3, y.getExistencia());
            stat.setInt(4, y.getPorcentajeOferta());
            //stat.setBlob(6, y.getId());        Aqui va el blob para imagenes pero lo tengo pendiente
            stat.executeUpdate();
            if (stat.executeUpdate() == 0) {
                System.out.println("Quizas no se guardó correctamente la información.");
            }
            ResultSet rs = stat.getGeneratedKeys();

        } catch (SQLException ex) {
            System.out.println("Hubo un error. " + ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    System.out.println("Hubo un error. " + ex);
                }
            }
        }
    }

    @Override
    public void modificar(Ropa_DTO y) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setLong(1, y.getId());
            stat.setString(2, y.getNombre());
            stat.setFloat(3, y.getPrecio());
            stat.setInt(4, y.getExistencia());
            stat.setInt(5, y.getPorcentajeOferta());
            //stat.setBlob(6, y.getId());        Aqui va el blob para imagenes pero lo tengo pendiente
            stat.executeUpdate();
            if (stat.executeUpdate() == 0) {
                System.out.println("Quizas no se actualizó correctamente la información.");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un error. " + ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    System.out.println("Hubo un error. " + ex);
                }
            }
        }
    }

    @Override
    public void eliminar(Ropa_DTO y) {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setLong(1, y.getId());
            stat.setString(2, y.getNombre());
            stat.setFloat(3, y.getPrecio());
            stat.setInt(4, y.getExistencia());
            stat.setInt(5, y.getPorcentajeOferta());
            //stat.setBlob(6, y.getId());        Aqui va el blob para imagenes pero lo tengo pendiente
            stat.executeUpdate();
            if (stat.executeUpdate() == 0) {
                System.out.println("Quizas no se eliminó correctamente la información.");
            }
        } catch (SQLException ex) {
            System.out.println("Hubo un error. " + ex);
        } finally {
            if (stat != null) {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    System.out.println("Hubo un error. " + ex);
                }
            }
        }
    }

    private Ropa_DTO convertir(ResultSet rs) throws SQLException {
        String nombre = rs.getString("Nombre");
        float precio = rs.getFloat("precio");
        int existencia = rs.getInt("existencia");
        int porcentaje = rs.getInt("porcentajeOferta");
        
        Ropa_DTO Ropa = new Ropa_DTO(nombre, precio, existencia, porcentaje);
        Ropa.setId(rs.getLong("id"));
        return Ropa;
    }

    @Override
    public List<Ropa_DTO> obtenerTodos() { //get all
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ropa_DTO obtener(Long id) { //get one
        throw new UnsupportedOperationException("Not supported yet.");

        /*
        PreparedStatement stat = null;
        ResultSet rs = null;
        try {
            stat = conn.prepareStatement(GETONE);
        } catch (SQLException ex) {
            System.out.println("Hubo un error en Ropa JDBC: "+ex);
        } finally {
        }*/
    }
}
