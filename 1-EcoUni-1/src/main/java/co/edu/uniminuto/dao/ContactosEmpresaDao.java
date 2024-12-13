package co.edu.uniminuto.dao;

import co.edu.uniminuto.entity.ContactosEmpresa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactosEmpresaDao implements IContactosEmpresaDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ContactosEmpresa guardar(ContactosEmpresa contacto) {
        entityManager.persist(contacto);
        return contacto;
    }

    @Override
    public ContactosEmpresa obtenerPorId(Long id) {
        return entityManager.find(ContactosEmpresa.class, id);
    }

    @Override
    public List<ContactosEmpresa> obtenerTodos() {
        String jpql = "SELECT c FROM ContactosEmpresa c";
        TypedQuery<ContactosEmpresa> query = entityManager.createQuery(jpql, ContactosEmpresa.class);
        return query.getResultList();
    }

    @Override
    public void eliminar(Long id) {
        ContactosEmpresa contacto = obtenerPorId(id);
        if (contacto != null) {
            entityManager.remove(contacto);
        }
    }
}