package org.example.webproject1.Mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.example.webproject1.Entity.score;

import java.util.List;

@Mapper
public interface ScoreMapper {
    @Select("select * from score")
    List<score> getAllScore();

    @Delete("delete * from score")
    int deleteAllScore();
}
