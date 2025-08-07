package org.example.webproject1.Factory;

import org.example.webproject1.Entity.score;

public abstract class AbstractScoreFactory {
    abstract score createScoreEntity(int input_ID, String input_s_name, int input_s_score);
}
