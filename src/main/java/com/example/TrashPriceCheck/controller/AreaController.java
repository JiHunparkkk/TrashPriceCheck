package com.example.TrashPriceCheck.controller;

import com.example.TrashPriceCheck.Domain.Dto.AreaListResponseDto;
import com.example.TrashPriceCheck.Service.AreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AreaController {
    private final AreaService areaService;

    @GetMapping("/area")
    public List<AreaListResponseDto> searchAll(){
        return areaService.searchAll();
    }
}
