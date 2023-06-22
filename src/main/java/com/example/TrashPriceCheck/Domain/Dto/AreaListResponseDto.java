package com.example.TrashPriceCheck.Domain.Dto;

import com.example.TrashPriceCheck.Domain.Entity.Area;
import lombok.Getter;

@Getter
public class AreaListResponseDto {
    private Long id;
    private String adr_si;
    private String adr_do;

    public AreaListResponseDto(Area entity) {
        this.id = entity.getId();
        this.adr_si = entity.getAdr_si();
        this.adr_do = entity.getAdr_do();
    }
}
