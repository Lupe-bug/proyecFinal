 package Data;

import Data.Usuarios_DAO;
import Domain.Usuarios_DTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuarios_JDBC implements Usuarios_DAO {

    final String INSERT = "INSERT INTO Usuarios(usuario, contrasena) VALUES (?,?)";
    final String UPDATE = "UPDATE Ropa SET contrasena = ? WHERE usuario = ?";
    final String DELETE = "DELETE FROM Usuarios WHERE usuario = ?";

    final String GETALL = "SELECT usuario, contrasena FROM Usuarios";
    final String GETONE = "SELECT usuario, contrasena FROM Usuarios WHERE usuario = ?";

    private Connection conn;

    public Usuarios_JDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insertar(Usuarios_DTO y) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(INSERT);
            stat.setString(1, y.getUsuario());
            stat.setString(2, y.getContrasena());
            if (stat.executeUpdate() == 0) {
                throw new DAOException("Hubieron problemas con la base de datos.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en la solicitud en SQL. ", ex);
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
            } catch (SQLException ex) {
                throw new DAOException("Error en la solicitud en SQL. ", ex);
            }
        }
    }

    @Override
    public void modificar(Usuarios_DTO y) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(UPDATE);
            stat.setString(1, y.getContrasena());
            if (stat.executeUpdate() == 0) {
                throw new DAOException("Hubieron problemas con la base de datos.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en la solicitud en SQL. ", ex);
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
            } catch (SQLException ex) {
                throw new DAOException("Error en la solicitud en SQL. ", ex);
            }
        }
    }

    @Override
    public void eliminar(Usuarios_DTO y) throws DAOException {
        PreparedStatement stat = null;
        try {
            stat = conn.prepareStatement(DELETE);
            stat.setString(1, y.getUsuario());
            if (stat.executeUpdate() == 0) {
                throw new DAOException("Hubieron problemas con la base de datos.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en la solicitud en SQL. ", ex);
        } finally {
            try {
                if (stat != null) {
                    stat.close();
                }
            } catch (SQLException ex) {
                throw new DAOException("Error en la solicitud en SQL. ", ex);
            }
        }
    }

    private Usuarios_DTO convertir(ResultSet rs) throws SQLException {
        String usuario = rs.getString("usuario");
        String contra = rs.getString("contrasena");
        Usuarios_DTO usuarios = new Usuarios_DTO(usuario, contra);
        return usuarios;
    }

    @Override
    public List<Usuarios_DTO> obtenerTodos() throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;

        List<Usuarios_DTO> u = new ArrayList<>();
        try {
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while (rs.next()) {
                u.add(convertir(rs));
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL. ", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error en SQL. ", ex);
                }
            }
        }
        return u;
    }

    @Override
    public Usuarios_DTO obtener(String id) throws DAOException {
        PreparedStatement stat = null;
        ResultSet rs = null;
        Usuarios_DTO u = null;
        try {
            stat = conn.prepareStatement(GETONE);
            stat.setString(1, id);
            rs = stat.executeQuery();
            if (rs.next()) {
                u = convertir(rs);
            } else {
                throw new DAOException("No se ha encontrado ese registro.");
            }
        } catch (SQLException ex) {
            throw new DAOException("Error en SQL. ", ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    new DAOException("Error en SQL. ", ex);
                }
            }
        }
        return u;
    }

    public static void main(String[] args) throws DAOException, SQLException {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Store.db");
            Usuarios_DAO dao = new Usuarios_JDBC(conn);
            Usuarios_DTO user = new Usuarios_DTO("Xiaomi","pocopoco");
            dao.eliminar(user);
            //System.out.println("El usuario generado es: "+ user.getUsuario() + " y contraseña: "+ user.getContrasena());
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
