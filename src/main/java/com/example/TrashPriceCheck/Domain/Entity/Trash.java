package com.example.TrashPriceCheck.Domain.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "Trash")
public class Trash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trash_id", unique = true, nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "area_id")
    private Area area;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "trashUsage_id")
    private TrashUsage trashUsage;

    @Column
    private String trash_type; // 규격,특수,재사용
    private String trash_user; // 가정,사업
    @Column(name = "1L_price")
    private int price_1L;

    @Column(name = "1_5L_price")
    private int price_1_5L;

    @Column(name = "2L_price")
    private int price_2L;

    @Column(name = "2_5L_price")
    private int price_2_5L;

    @Column(name = "3L_price")
    private int price_3L;

    @Column(name = "5L_price")
    private int price_5L;

    @Column(name = "10L_price")
    private int price_10L;

    @Column(name = "20L_price")
    private int price_20L;

    @Column(name = "30L_price")
    private int price_30L;

    @Column(name = "50L_price")
    private int price_50L;

    @Column(name = "60L_price")
    private int price_60L;

    @Column(name = "75L_price")
    private int price_75L;

    @Column(name = "100L_price")
    private int price_100L;

    @Column(name = "125L_price")
    private int price_125L;

    @Builder
    public Trash(Long id, String trash_type, String trash_user,
                 int price_1L, int price_1_5L, int price_2L, int price_2_5L, int price_3L,
                 int price_5L, int price_10L, int price_20L, int price_30L, int price_50L,
                 int price_60L, int price_75L, int price_100L, int price_125L) {
        this.id = id;
//        this.area = area;
//        this.trashUsage = trashUsage;
        this.trash_type = trash_type;
        this.trash_user = trash_user;
        this.price_1L = price_1L;
        this.price_1_5L = price_1_5L;
        this.price_2L = price_2L;
        this.price_2_5L = price_2_5L;
        this.price_3L = price_3L;
        this.price_5L = price_5L;
        this.price_10L = price_10L;
        this.price_20L = price_20L;
        this.price_30L = price_30L;
        this.price_50L = price_50L;
        this.price_60L = price_60L;
        this.price_75L = price_75L;
        this.price_100L = price_100L;
        this.price_125L = price_125L;
    }
}
