package co.edu.uniminuto.controller;

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

import co.edu.uniminuto.entity.Recompensa;
import co.edu.uniminuto.service.IRecompensaService;


import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value="api/recompensa")
public class RecompensaController {

    @Autowired
    private IRecompensaService recompensaService;

    @GetMapping(value="recompensa", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public List<Recompensa> obtenerTodas() {
        return recompensaService.obtenerTodas();
    }

    @GetMapping(value = "/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Recompensa obtenerPorId(@PathVariable("id") Long id) {
        return recompensaService.obtenerPorId(id);
    }

    @PostMapping(value="recompensa", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Recompensa crear(@RequestBody Recompensa recompensa) {
        return recompensaService.guardar(recompensa);
    }

    @PutMapping(value = "/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public Recompensa actualizar(@PathVariable("id") Long id, @RequestBody Recompensa recompensa) {
        return recompensaService.actualizar(id, recompensa);
    }

    @DeleteMapping(value = "/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void eliminar(@PathVariable("id") Long id) {
        recompensaService.eliminar(id);
    }
}