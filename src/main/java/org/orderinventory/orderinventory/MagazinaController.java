package org.orderinventory.orderinventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/magazina")
public class MagazinaController {
    @Autowired
    private MagazinaService magazinaService;

    @GetMapping
    public List<Magazina> getAllMagazina() {
        return magazinaService.findAll();
    }

    @PostMapping
    public Magazina createMagazina(@RequestBody Magazina magazina) {
        return magazinaService.save(magazina);
    }

}

