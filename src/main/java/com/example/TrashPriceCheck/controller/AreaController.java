package com.example.TrashPriceCheck.controller;

import com.example.TrashPriceCheck.Domain.Dto.AreaListResponseDto;
import com.example.TrashPriceCheck.Service.AreaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins = "*")
public class AreaController {
    private final AreaService areaService;

    @GetMapping("/allArea")
    public List<AreaListResponseDto> searchAll(){
        return areaService.searchAll();
    }

    @GetMapping("/area")
    public List<Map<String,Object>> search(){
        return areaService.searchAvgOrigin();
    }

    @GetMapping("/areaFood")
    public List<Map<String,Object>> searchFood(){
        return areaService.searchAvgFood();
    }
}
