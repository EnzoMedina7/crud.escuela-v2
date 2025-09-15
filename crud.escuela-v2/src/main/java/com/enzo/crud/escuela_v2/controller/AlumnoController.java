package com.enzo.crud.escuela_v2.controller;

import com.enzo.crud.escuela_v2.model.Alumno;
import com.enzo.crud.escuela_v2.repository.AlumnoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    private final AlumnoRepository repo;

    public AlumnoController(AlumnoRepository repo) {
        this.repo = repo;
    }

    // Create - crear
    @PostMapping
    public ResponseEntity<Alumno> crear(@RequestBody Alumno alumno) {
        Alumno saved = repo.save(alumno);
        return ResponseEntity.ok(saved);
    }

    // read all- leer todo
    @GetMapping
    public ResponseEntity<List<Alumno>> listar() {
        return ResponseEntity.ok(repo.findAll());
    }

    // read by Id - leer por el id x
    @GetMapping("/{id}")
    public ResponseEntity<Alumno> obtener(@PathVariable Long id) {
        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // UPDATE- actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Alumno> actualizar(@PathVariable Long id, @RequestBody Alumno dto) {
        return repo.findById(id).map(alumno -> {
            alumno.setNombres(dto.getNombres());
            alumno.setApellidos(dto.getApellidos());
            alumno.setDni(dto.getDni());
            alumno.setDomicilio(dto.getDomicilio());
            alumno.setCelular(dto.getCelular());
            alumno.setCurso(dto.getCurso());
            alumno.setNotacuantitativa(dto.getNotacuantitativa());
            Alumno updated = repo.save(alumno);
            return ResponseEntity.ok(updated);
        }).orElse(ResponseEntity.notFound().build());
    }

    // DELETE- eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        if (!repo.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
