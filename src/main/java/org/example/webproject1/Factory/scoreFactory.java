package org.example.webproject1.Factory;

import org.example.webproject1.Entity.score;

public class scoreFactory extends AbstractScoreFactory{

    @Override
    public score createScoreEntity(int input_ID, String input_s_name, int input_s_score) {
        return score.builder().ID(input_ID).s_name(input_s_name).s_score(input_s_score).build();
    }
    public score createDefaultScoreEntity() {
        return score.builder().s_name("default").s_score(0).build();
    }
}
