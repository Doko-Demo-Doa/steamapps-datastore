package com.clipsub.steamapps.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ControllerSupportEnum implements CodeEnum {
    FULL("full", "Full controller support"),
    PARTIAL("partial", "Partial controller support");

    private final String type;
    private final String description;
}
