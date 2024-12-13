package co.edu.uniminuto.service;

import co.edu.uniminuto.dao.IContactosEmpresaDao;
import co.edu.uniminuto.entity.ContactosEmpresa;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ContactosEmpresaService implements IContactosEmpresaService {

    @Autowired
    private IContactosEmpresaDao contactosEmpresaDao;

    @Override
    public List<ContactosEmpresa> obtenerTodos() {
        return contactosEmpresaDao.obtenerTodos();
    }

    @Override
    public ContactosEmpresa obtenerPorId(Long id) {
        return contactosEmpresaDao.obtenerPorId(id);
    }

    @Override
    public ContactosEmpresa guardar(ContactosEmpresa contacto) {
        return contactosEmpresaDao.guardar(contacto);
    }

    @Override
    public void eliminar(Long id) {
        contactosEmpresaDao.eliminar(id);
    }
}