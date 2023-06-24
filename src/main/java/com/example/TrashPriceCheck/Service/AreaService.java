package com.example.TrashPriceCheck.Service;

import com.example.TrashPriceCheck.Domain.Dto.AreaListResponseDto;
import com.example.TrashPriceCheck.Repository.AreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class AreaService {
    private final AreaRepository areaRepository;

    @Transactional(readOnly = true)
    public List<AreaListResponseDto> searchAll(){
        return areaRepository.findAll().stream()
                .map(AreaListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<Map<String, Object>> searchAvgOrigin() {
        List<Object[]> resultList = areaRepository.findByAvgOrigin();

        return resultList.stream()
                .map(result -> {
                    Map<String, Object> resultMap = new HashMap<>();
                    resultMap.put("adr_do", result[0]);
                    resultMap.put("avg", result[1]);
                    return resultMap;
                })
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<Map<String, Object>> searchAvgFood() {
        List<Object[]> resultList = areaRepository.findByAvgFood();

        return resultList.stream()
                .map(result -> {
                    Map<String, Object> resultMap = new HashMap<>();
                    resultMap.put("adr_do", result[0]);
                    resultMap.put("avg", result[1]);
                    return resultMap;
                })
                .collect(Collectors.toList());
    }

}
