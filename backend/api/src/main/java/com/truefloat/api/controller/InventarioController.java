package com.truefloat.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {

    @GetMapping
    public Map<String, Object> getInventarioTeste() {
        Map<String, Object> skinMock = new HashMap<>();
        skinMock.put("arma", "AK-47");
        skinMock.put("skin", "Redline");
        skinMock.put("condicao", "Field-Tested");
        skinMock.put("floatValue", 0.154321);
        skinMock.put("precoDolar", 25.50);

        return skinMock;
    }
}