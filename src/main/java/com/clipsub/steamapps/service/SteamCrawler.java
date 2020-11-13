package com.clipsub.steamapps.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@EnableAsync
public class SteamCrawler {
    @Scheduled(fixedDelay = 1500)
    public void placeholderFunc() {
        System.out.println("Test test");
    }
}
