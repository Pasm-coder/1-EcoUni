package co.edu.uniminuto.controller;

import co.edu.uniminuto.entity.PuntosReciclaje;
import co.edu.uniminuto.service.IPuntosReciclajeService;
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
@RequestMapping(value="api/PuntosReciclaje")
public class PuntosReciclajeController {

    @Autowired
    private IPuntosReciclajeService puntosReciclajeService;

    @GetMapping(value="PuntosReciclaje", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public List<PuntosReciclaje> obtenerTodos() {
        return puntosReciclajeService.obtenerTodos();
    }

    @GetMapping(value="/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public PuntosReciclaje obtenerPorId(@PathVariable("id") Long id) {
        return puntosReciclajeService.obtenerPorId(id);
    }
    
    @PostMapping(value="PuntosReciclaje", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public PuntosReciclaje crear(@RequestBody PuntosReciclaje punto) {
        return puntosReciclajeService.guardar(punto);
    }

    @PutMapping(value="/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public PuntosReciclaje actualizar(@PathVariable("id") Long id, @RequestBody PuntosReciclaje punto) {
        return puntosReciclajeService.actualizar(id, punto);
    }

    @DeleteMapping(value="PuntosReciclaje/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void eliminar(@PathVariable("id") Long id) {
        puntosReciclajeService.eliminar(id);
    }
}