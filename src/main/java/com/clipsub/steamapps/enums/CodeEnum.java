package com.clipsub.steamapps.enums;


import com.fasterxml.jackson.annotation.JsonValue;

public interface CodeEnum {
    @JsonValue
    String getType();

    String getDescription();
}
