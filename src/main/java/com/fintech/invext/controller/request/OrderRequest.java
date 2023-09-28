package com.fintech.invext.controller.request;

import com.fintech.invext.model.enums.Type;

public record OrderRequest (
    String description,
    Type type) {
}
