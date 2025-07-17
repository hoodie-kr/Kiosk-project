package com.aloha.kiosk.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.aloha.kiosk.dto.RamenDTO;

@Mapper
public interface RamenMapper {

    @Select("SELECT * FROM ramen")
    List<RamenDTO> findAll();  // ✅ ramenMapper.findAll() 에 대응

    @Select("SELECT * FROM ramen WHERE id = #{id}")
    RamenDTO findById(@Param("id") int id);  // ✅ ramenMapper.findById(id) 에 대응

}
