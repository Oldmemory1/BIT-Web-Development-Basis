package org.example.webproject1.Entity;

import lombok.Builder;
import lombok.Data;
@Builder
@Data
public class score {
    private int ID;
    private String s_name;
    private int s_score;
    @Override
    public String toString() {
        return "学生ID:"+this.ID+",学生姓名:"+this.s_name+",学生分数:"+this.s_score+"<br>";
    }

}
