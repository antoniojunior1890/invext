package com.fintech.invext.controller.response;

import com.fintech.invext.model.enums.Status;
import com.fintech.invext.model.enums.Type;

public record OrderResponse(
    String description,
    Type type,
    Status status) {
}
