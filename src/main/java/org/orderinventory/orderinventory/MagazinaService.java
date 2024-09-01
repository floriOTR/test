package org.orderinventory.orderinventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MagazinaService {
    @Autowired
    private MagazinaRepository magazinaRepository;

    public List<Magazina> findAll() {
        return magazinaRepository.findAll();
    }

    public Magazina save(Magazina magazina) {
        return magazinaRepository.save(magazina);
    }

}

