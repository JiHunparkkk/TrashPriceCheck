package com.example.TrashPriceCheck.Domain.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "TrashUsage")
public class TrashUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trashUsage_id", unique = true, nullable = false)
    private Long id;

    @Column
    private String trashUsage_type;

    @Builder
    public TrashUsage(String trashUsage_type) {
        this.trashUsage_type = trashUsage_type;
    }
}
