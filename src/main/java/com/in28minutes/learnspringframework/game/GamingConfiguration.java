package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game(){
        return new PackmanGame();
    }
    @Bean
    public GameRunner game(GamingConsole game){
        return new GameRunner(game);
    }
}
