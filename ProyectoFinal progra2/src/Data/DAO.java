package Data;

import java.util.List;

public interface DAO<x, z> {

    void insertar(x y) throws DAOException;

    void modificar(x y) throws DAOException;

    void eliminar(x y) throws DAOException;

    List<x> obtenerTodos() throws DAOException;

    x obtener(z id) throws DAOException;
}
