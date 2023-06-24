package com.example.TrashPriceCheck.Domain.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "Area")
public class Area {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "area_id", unique = true, nullable = false)
    private Long id;

    @Column
    private String adr_do;

    @Column
    private String adr_si;

    @Builder
    public Area(String adr_do, String adr_si) {
        this.adr_do = adr_do;
        this.adr_si = adr_si;
    }
}
