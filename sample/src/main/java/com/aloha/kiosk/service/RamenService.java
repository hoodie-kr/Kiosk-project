package com.aloha.kiosk.service;

import com.aloha.kiosk.dto.RamenDTO;
import com.aloha.kiosk.mapper.RamenMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RamenService {

    private final RamenMapper ramenMapper;

    public RamenService(RamenMapper ramenMapper) {
        this.ramenMapper = ramenMapper;
    }

    public List<RamenDTO> getAllRamen() {
        return ramenMapper.findAll();
    }

    public RamenDTO getRamenById(int id) {
        return ramenMapper.findById(id);
    }
}
