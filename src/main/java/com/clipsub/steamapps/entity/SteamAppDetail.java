package com.clipsub.steamapps.entity;

import com.clipsub.steamapps.enums.AppTypeEnum;
import com.clipsub.steamapps.enums.ControllerSupportEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * A Steam App can be a game, music, or DLC. Check the "type" field.
 * https://store.steampowered.com/api/appdetails?appids=282900&l=japanese
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "steam_app_detail")
public class SteamAppDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    private boolean isFree;

    private String[] developers;

    private String[] publishers;

    @Column(name = "type")
    private AppTypeEnum type;

    @Column(name = "controller_support")
    private ControllerSupportEnum controllerSupport;
}
