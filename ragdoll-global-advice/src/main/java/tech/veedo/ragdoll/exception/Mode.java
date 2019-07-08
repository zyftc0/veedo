package tech.veedo.ragdoll.exception;

import lombok.Getter;

import java.util.Arrays;

public enum Mode {

    LOG("log"),
    STACK("stack"),
    ;

    @Getter
    private String str;

    Mode(String str) {
        this.str = str;
    }

    public static Mode getMode(String str) {
        return Arrays.stream(Mode.values())
                .filter(mode -> mode.getStr().equals(str)).findAny()
                .orElse(null);
    }

}
