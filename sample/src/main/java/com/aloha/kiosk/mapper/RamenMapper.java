package com.aloha.kiosk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.aloha.kiosk.dto.RamenDTO;

@Mapper
public interface RamenMapper {
    List<RamenDTO> findAll();
    RamenDTO findById(@Param("id") int id);
}
