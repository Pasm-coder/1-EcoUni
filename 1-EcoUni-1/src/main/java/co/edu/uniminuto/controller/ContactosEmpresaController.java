package co.edu.uniminuto.controller;

import co.edu.uniminuto.entity.ContactosEmpresa;
import co.edu.uniminuto.service.IContactosEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value="api/ContactosEmpresa")
public class ContactosEmpresaController {

    @Autowired
    private IContactosEmpresaService contactosEmpresaService;

    @GetMapping(value="ContactosEmpresa", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public List<ContactosEmpresa> obtenerTodos() {
        return contactosEmpresaService.obtenerTodos();
    }

    @GetMapping(value="/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public ContactosEmpresa obtenerPorId(@PathVariable("id") Long id) {
        return contactosEmpresaService.obtenerPorId(id);
    }

    @PostMapping(value="ContactosEmpresa", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public ContactosEmpresa crear(@RequestBody ContactosEmpresa contacto) {
        return contactosEmpresaService.guardar(contacto);
    }

    @DeleteMapping(value="/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void eliminar(@PathVariable("id") Long id) {
        contactosEmpresaService.eliminar(id);
    }
}