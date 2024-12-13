package co.edu.uniminuto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.uniminuto.entity.EmpresasRecicladora;
import co.edu.uniminuto.service.IEmpresasRecicladoraService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping(value="api/EmpresasRecicladora")
public class EmpresasRecicladoraController {

    @Autowired
    private IEmpresasRecicladoraService empresasRecicladoraService;

    @GetMapping(value="EmpresasRecicladora", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public List<EmpresasRecicladora> obtenerTodas() {
        return empresasRecicladoraService.obtenerTodas();
    }

    @GetMapping(value="/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public EmpresasRecicladora obtenerPorId(@PathVariable("id") Long id) {
        return empresasRecicladoraService.obtenerPorId(id);
    }

    @PostMapping(value="EmpresasRecicladora", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public EmpresasRecicladora crear(@RequestBody EmpresasRecicladora empresa) {
        return empresasRecicladoraService.guardar(empresa);
    }

    @PutMapping(value="/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public EmpresasRecicladora actualizar(@PathVariable("id") Long id, @RequestBody EmpresasRecicladora empresa) {
        return empresasRecicladoraService.actualizar(id, empresa);
    }

    @DeleteMapping(value="/{id}", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
    public void eliminar(@PathVariable("id") Long id) {
        empresasRecicladoraService.eliminar(id);
    }
}