package com.truefloat.api.controller;

import com.truefloat.api.model.Skin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @GetMapping
    public Skin getInventarioTeste() {
        // Agora estamos a instanciar um objeto Skin de verdade!
        return new Skin(1L, "AK-47", "Redline", "Field-Tested", 0.154321, 25.50);
    }
}