package com.clipsub.steamapps.repository;

import com.clipsub.steamapps.entity.SteamApp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SteamAppRepository extends CrudRepository<SteamApp, Long> {
    List<SteamApp> findByNameContaining(String appName);
}
