package com.sample.ddd.repository.sprint;

import com.sample.ddd.domain.backlogitem.BacklogItem;
import com.sample.ddd.domain.backlogitem.BacklogItemId;
import com.sample.ddd.domain.backlogitem.BacklogItemRepository;
import com.sample.ddd.domain.tenant.TenantId;

public class RdsBacklogItemRepository implements BacklogItemRepository {


    @Override
    public void save(BacklogItem aBacklogItem) {

    }

    @Override
    public BacklogItem backlogItemOfId(TenantId aTenantId, BacklogItemId aBacklogItemId) {
        return null;
    }
}
