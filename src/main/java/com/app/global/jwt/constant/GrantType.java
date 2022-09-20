package com.app.global.jwt.constant;

import lombok.Getter;

@Getter
public enum GrantType {

    BEARER("bearer"),

    ;

    GrantType(String type) {
        this.type = type;
    }

    private String type;
}
