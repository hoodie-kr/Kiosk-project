package com.aloha.kiosk.mapper;

import com.aloha.kiosk.dto.Ramen;
import java.util.List;

public interface RamenMapper {
    List<Ramen> findAll();
    List<Ramen> findByCategory(String category);
}