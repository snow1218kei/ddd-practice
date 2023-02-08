package com.sample.ddd.domain.backlogitem;

import com.sample.ddd.domain.product.ProductId;
import com.sample.ddd.domain.sprint.SprintId;
import com.sample.ddd.domain.tenant.TenantId;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class BacklogItem {

    private String associatedIssueId;
    private BacklogItemId backlogItemId;
    private String category;
    private String discussionInitiationId;
    private ProductId productId;
    private SprintId sprintId;
    private String story;
    private String summary;
    private TenantId tenantId;

}
