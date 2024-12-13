package co.edu.uniminuto.dao;

import co.edu.uniminuto.entity.ContactosEmpresa;
import java.util.List;

public interface IContactosEmpresaDao {
    ContactosEmpresa guardar(ContactosEmpresa contacto);
    ContactosEmpresa obtenerPorId(Long id);
    List<ContactosEmpresa> obtenerTodos();
    void eliminar(Long id);
}