package com.sample.ddd.domain.sprint;

import com.sample.ddd.domain.backlogitem.BacklogItemId;
import com.sample.ddd.domain.tenant.TenantId;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommittedBacklogItem {

    private BacklogItemId backlogItemId;
    private int ordering;
    private SprintId sprintId;
    private TenantId tenantId;

    public CommittedBacklogItem(TenantId tenantId, SprintId sprintId, BacklogItemId backlogItemId, int ordering) {
    }
}
