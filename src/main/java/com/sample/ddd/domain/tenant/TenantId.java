package com.sample.ddd.domain.tenant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TenantId {

    private String id;

    public TenantId(String tenantId) {
    }
}
