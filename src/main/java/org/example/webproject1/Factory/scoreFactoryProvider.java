package org.example.webproject1.Factory;

public class scoreFactoryProvider {
    public AbstractScoreFactory getScoreFactory() {
        return new scoreFactory();
    }
}
