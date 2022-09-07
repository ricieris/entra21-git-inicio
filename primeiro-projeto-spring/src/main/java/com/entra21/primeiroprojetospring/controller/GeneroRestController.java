package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.FranquiaPayloadDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroPayloadDTO;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroRestController {

    @Autowired
    private GeneroService generoService;

    @GetMapping
    public List<GeneroDTO> getGeneros() {
        return generoService.getAll();
    }

    @PostMapping
    public void addGenero(@RequestBody GeneroPayloadDTO newGenero) {
        generoService.saveGen(newGenero);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GeneroEntity> getGenero(@PathVariable(name = "id") Long id) {
        Optional<GeneroEntity> genero = generoService.getById(id);
        if (genero.isPresent()) {
            return ResponseEntity.ok(genero.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteGenero(@PathVariable(name = "id") Long id) {
        generoService.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GeneroEntity> updateFranquia(@PathVariable(name = "id") Long id,
                                                       @RequestBody String novoNome) {
        Optional<GeneroEntity> entity = generoService.findById(id);
        if (entity.isPresent()) {
            entity.get().setNome(novoNome);
            return ResponseEntity.ok(generoService.save(entity.get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}