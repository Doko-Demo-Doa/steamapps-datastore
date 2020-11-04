package com.clipsub.steamapps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

// Source: http://api.steampowered.com/ISteamApps/GetAppList/v0001/
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
