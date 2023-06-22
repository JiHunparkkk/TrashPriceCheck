package com.example.TrashPriceCheck.Service;

import com.example.TrashPriceCheck.Domain.Dto.AreaListResponseDto;
import com.example.TrashPriceCheck.Repository.AreaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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
}
