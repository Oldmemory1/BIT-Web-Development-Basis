package org.example.webproject1.Entity;

import lombok.Data;

@Data
public class score {
    int ID;
    String s_name;
    int s_score;
    @Override
    public String toString() {
        return "学生ID:"+this.ID+",学生姓名"+this.s_name+",学生分数:"+this.s_score+"\n";
    }
}
