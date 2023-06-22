package com.example.TrashPriceCheck.Repository;

import com.example.TrashPriceCheck.Domain.Entity.Area;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AreaRepository {

    private final EntityManager em;

    public List<Area> findAll() {
        String query = "SELECT a FROM Area a";
        return em.createQuery(query, Area.class)
                .getResultList();
    }
}
