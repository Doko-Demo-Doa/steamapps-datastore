package com.clipsub.steamapps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

// Source: https://api.steampowered.com/ISteamApps/GetAppList/v0001/
// Source V2: https://api.steampowered.com/ISteamApps/GetAppList/v2/
// For individual package: https://store.steampowered.com/api/packagedetails?packageids=32848
// Interesting things: https://wiki.teamfortress.com/wiki/User:RJackson/StorefrontAPI
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "steam_app")
public class SteamApp implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "app_id")
    @NotNull
    private int appId;

    @Column(name = "app_name")
    private String name;
}
