package com.example.TrashPriceCheck.Repository;

import com.example.TrashPriceCheck.Domain.Entity.Area;
import com.example.TrashPriceCheck.Domain.Entity.Trash;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AreaRepository {

    private final EntityManager em;

    public List<Trash> findAll() {
        String query = "SELECT t FROM Trash t";
        return em.createQuery(query, Trash.class)
                .getResultList();
    }

    public List<Object[]> findByAvgOrigin() {
        String query = "SELECT t.area.adr_do, AVG(CASE WHEN t.price_20L!=0 THEN t.price_20L END) " +
                "FROM Trash t "+
                "WHERE t.trashUsage.trashUsage_type='생활쓰레기' AND t.trash_user='가정용' "+
                "AND t.trash_type = '규격봉투' " +
                "GROUP BY t.area.adr_do";
        return em.createQuery(query, Object[].class)
                .getResultList();
    }

    public List<Object[]> findByAvgFood() {
        String query = "SELECT t.area.adr_do, " +
                "AVG(CASE WHEN t.trashUsage.trashUsage_type = '음식물쓰레기' THEN (CASE WHEN t.price_3L != 0 THEN t.price_3L END) END) " +
                "FROM Trash t " +
                "WHERE t.trash_user = '가정용' " +
                "AND t.trash_type = '규격봉투' " +
                "GROUP BY t.area.adr_do";

        return em.createQuery(query, Object[].class)
                .getResultList();
    }





}
