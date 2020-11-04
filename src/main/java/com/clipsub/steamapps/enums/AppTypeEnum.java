package com.clipsub.steamapps.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Currently Software is treated as game, unless there are special tags in it.
 */
@Getter
@RequiredArgsConstructor
public enum AppTypeEnum implements CodeEnum {
    GAME("game", "App type of Game(s)"),
    DLC("dlc", "Downloadable Content"),
    MUSIC("music", "Steam music, base game ownership is not required");

    private final String type;
    private final String description;
}
