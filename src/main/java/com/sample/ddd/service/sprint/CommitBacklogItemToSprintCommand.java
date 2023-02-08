package com.sample.ddd.service.sprint;

import lombok.Value;

@Value
public class CommitBacklogItemToSprintCommand {

    private String backlogItemId;
    private String sprintId;
    private String tenantId;

}
