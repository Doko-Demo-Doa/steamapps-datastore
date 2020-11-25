package com.clipsub.steamapps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "steam_achievement")
public class SteamAchievement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "is_hidden")
    private boolean isHidden;

    @Column(name = "icon")
    private String icon;

    @Column(name = "icon_gray")
    private String iconGray;

    @Column(name = "description")
    private String description;
}
