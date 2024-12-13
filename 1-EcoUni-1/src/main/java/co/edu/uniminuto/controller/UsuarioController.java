package co.edu.uniminuto.controller;

import co.edu.uniminuto.entity.Usuario;
import co.edu.uniminuto.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/api/usuarios")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping(produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public List<Usuario> obtenerTodos() {
        return usuarioService.obtenerTodos();
    }

    @GetMapping(value = "/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Usuario obtenerPorId(@PathVariable("id") Long id) {
        return usuarioService.obtenerPorId(id);
    }

    @PostMapping(produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE, 
                 consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Usuario crear(@RequestBody Usuario usuario) {
        return usuarioService.guardar(usuario);
    }

    @PutMapping(value = "/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE,
                consumes = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Usuario actualizar(@PathVariable("id") Long id, @RequestBody Usuario usuario) {
        return usuarioService.actualizar(id, usuario);
    }

    @DeleteMapping(value = "/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void eliminar(@PathVariable("id") Long id) {
        usuarioService.eliminar(id);
    }
}