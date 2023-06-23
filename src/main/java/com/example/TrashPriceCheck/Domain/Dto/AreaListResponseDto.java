package com.example.TrashPriceCheck.Domain.Dto;

import com.example.TrashPriceCheck.Domain.Entity.Area;
import com.example.TrashPriceCheck.Domain.Entity.Trash;
import com.example.TrashPriceCheck.Domain.Entity.TrashUsage;
import lombok.Getter;

@Getter
public class AreaListResponseDto {
    private Long id;
    private String trash_type;
    private String trash_user;
    private int price_1L;
    private int price_1_5L;
    private int price_2L;
    private int price_2_5L;
    private int price_3L;
    private  int price_5L;
    private  int price_10L;
    private int price_20L;
    private int price_30L;
    private int price_50L;

    private String adr_si;
    private String adr_do;
    private String trashUsage_type;

    public AreaListResponseDto(Trash trash) {
        this.id = trash.getId();
        this.adr_si = trash.getArea().getAdr_si();
        this.adr_do = trash.getArea().getAdr_do();
        this.trash_type = trash.getTrash_type();
        this.trash_user = trash.getTrash_user();
        this.price_1L = trash.getPrice_1L();
        this.price_1_5L = trash.getPrice_1_5L();
        this.price_2L = trash.getPrice_2L();
        this.price_2_5L = trash.getPrice_2_5L();
        this.price_3L = trash.getPrice_3L();
        this.price_5L = trash.getPrice_5L();
        this.price_10L = trash.getPrice_10L();
        this.price_20L = trash.getPrice_20L();
        this.price_30L = trash.getPrice_30L();
        this.price_50L = trash.getPrice_50L();
        this.trashUsage_type = trash.getTrashUsage().getTrashUsage_type();
    }
}
