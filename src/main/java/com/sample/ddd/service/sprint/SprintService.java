package com.sample.ddd.service.sprint;

import com.sample.ddd.domain.backlogitem.BacklogItem;
import com.sample.ddd.domain.backlogitem.BacklogItemId;
import com.sample.ddd.domain.backlogitem.BacklogItemRepository;
import com.sample.ddd.domain.sprint.Sprint;
import com.sample.ddd.domain.sprint.SprintId;
import com.sample.ddd.domain.tenant.TenantId;
import com.sample.ddd.domain.sprint.SprintRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Getter
public class SprintService {

    private BacklogItemRepository backlogItemRepository;
    private final SprintRepository sprintRepository;

    public void commitBacklogItemToSprint(CommitBacklogItemToSprintCommand aCommand) {

        TenantId tenantId = new TenantId(aCommand.getTenantId());

        Sprint sprint =
                this.getSprintRepository()
                        .sprintOfId(
                                tenantId,
                                new SprintId(aCommand.getSprintId()));

        BacklogItem backlogItem =
                this.getBacklogItemRepository()
                        .backlogItemOfId(
                                tenantId,
                                new BacklogItemId(aCommand.getBacklogItemId()));

        sprint.commit(backlogItem);

        this.getSprintRepository().save(sprint);
    }
}
