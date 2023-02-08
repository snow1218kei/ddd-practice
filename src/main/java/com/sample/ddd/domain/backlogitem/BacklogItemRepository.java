package com.sample.ddd.domain.backlogitem;

import com.sample.ddd.domain.tenant.TenantId;

public interface BacklogItemRepository {

    public void save(BacklogItem aBacklogItem);

    public BacklogItem backlogItemOfId(TenantId aTenantId, BacklogItemId aBacklogItemId);
}
