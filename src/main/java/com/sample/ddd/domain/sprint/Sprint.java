package com.sample.ddd.domain.sprint;

import com.sample.ddd.domain.backlogitem.BacklogItem;
import com.sample.ddd.domain.product.ProductId;
import com.sample.ddd.domain.tenant.TenantId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@RequiredArgsConstructor
@Getter
public class Sprint {

    private Set<CommittedBacklogItem> backlogItems;
    private String name;
    private ProductId productId;
    private SprintId sprintId;
    private TenantId tenantId;

    public void commit(BacklogItem aBacklogItem) {

        int ordering = this.getBacklogItems().size() + 1;

        CommittedBacklogItem committedBacklogItem =
                new CommittedBacklogItem(
                        this.getTenantId(),
                        this.getSprintId(),
                        aBacklogItem.getBacklogItemId(),
                        ordering);

        this.getBacklogItems().add(committedBacklogItem);

    }
}
