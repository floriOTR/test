package org.orderinventory.orderinventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MagazinaRepository extends JpaRepository<Magazina, Long> {
}

