package com.fintech.invext.model.enums;

public enum Status {
    OPEN(0), IN_PROGRESS(1), FINISHED(2), CANCELED(3);

    private final Integer value;

    Status(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}
