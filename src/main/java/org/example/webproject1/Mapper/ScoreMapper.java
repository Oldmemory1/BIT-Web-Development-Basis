package org.example.webproject1.Mapper;

import org.apache.ibatis.annotations.*;
import org.example.webproject1.Entity.score;

import java.util.List;

@Mapper
public interface ScoreMapper {
    @Select("select * from score order by s_score desc ")
    List<score> getAllScore();

    @Delete("delete from score")
    void deleteAllScore();

    @Insert("insert into score(s_name,s_score) values(#{input_s_name},#{input_s_score}) ")
    void insertScoreEntity(@Param("input_s_name") String input_s_name, @Param("input_s_score") int input_s_score);
}
