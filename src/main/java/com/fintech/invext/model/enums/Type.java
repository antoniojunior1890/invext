package com.fintech.invext.model.enums;

public enum Type {
    CARD(0), LOAN(1), OTHER(2);

    private final Integer value;

    Type(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
