package co.edu.uniminuto.service;

import co.edu.uniminuto.entity.ContactosEmpresa;

import java.util.List;

public interface IContactosEmpresaService {
    List<ContactosEmpresa> obtenerTodos();
    ContactosEmpresa obtenerPorId(Long id);
    ContactosEmpresa guardar(ContactosEmpresa contacto);
    void eliminar(Long id);
}