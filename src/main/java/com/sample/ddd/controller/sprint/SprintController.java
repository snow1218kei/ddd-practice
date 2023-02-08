package com.sample.ddd.controller.sprint;

import com.sample.ddd.domain.sprint.CommittedBacklogItem;
import com.sample.ddd.service.sprint.CommitBacklogItemToSprintCommand;
import com.sample.ddd.service.sprint.SprintService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/samples")
@RequiredArgsConstructor
public class SprintController {

    private final SprintService service;

    @PostMapping("/edit")
    public String update() {
        CommitBacklogItemToSprintCommand aCommand = CommitBacklogItemToSprintCommand();
        service.commitBacklogItemToSprint(aCommand);
    }
}
