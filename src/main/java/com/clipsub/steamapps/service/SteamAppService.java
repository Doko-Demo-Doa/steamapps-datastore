package com.clipsub.steamapps.service;

import com.clipsub.steamapps.entity.SteamApp;
import com.clipsub.steamapps.repository.SteamAppRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SteamAppService {

    private SteamAppRepository repository;

    public SteamAppService(SteamAppRepository repository) {
        this.repository = repository;
    }

    public Iterable<SteamApp> listApps() {
        return repository.findAll();
    }

    public SteamApp save(SteamApp app) {
        return repository.save(app);
    }

    public Iterable<SteamApp> save(List<SteamApp> apps) {
        return repository.saveAll(apps);
    }

    public Iterable<SteamApp> findByName(String name) {
        return repository.findByNameContaining(name);
    }
}
