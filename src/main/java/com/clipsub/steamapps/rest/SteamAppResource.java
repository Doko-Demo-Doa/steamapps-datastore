package com.clipsub.steamapps.rest;

import com.clipsub.steamapps.entity.SteamApp;
import com.clipsub.steamapps.service.SteamAppService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/apps")
public class SteamAppResource {
    private final SteamAppService service;

    public SteamAppResource(SteamAppService service) {
        this.service = service;
    }

    @GetMapping
    @ResponseBody
    public Iterable<SteamApp> listByName(@RequestParam(value = "q") String name) {
        return service.findByName(name);
    }

    @GetMapping("/process")
    public String process() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode nodes = objectMapper.readTree(new File("v0001.json"))
                    .get("applist")
                    .get("apps")
                    .get("app");

            if (nodes.isArray()) {
                List<SteamApp> apps = new ArrayList<>();
                for (JsonNode node : nodes) {
                    SteamApp singleApp = new SteamApp();

                    int appId = Integer.parseInt(node.get("appid").toString());
                    String appName = node.get("name").textValue();
                    singleApp.setAppId(appId);
                    singleApp.setName(appName);

                    apps.add(singleApp);
                }

                service.save(apps);
                return "Completed";
            }

            return "Completed";
        } catch (IOException e) {
            log.error("Error", e);
            return "Oh no";
        }
    }
}
