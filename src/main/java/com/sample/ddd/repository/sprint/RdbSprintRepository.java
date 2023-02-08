package com.sample.ddd.repository.sprint;
import com.sample.ddd.domain.sprint.Sprint;
import com.sample.ddd.domain.sprint.SprintId;
import com.sample.ddd.domain.sprint.SprintRepository;
import com.sample.ddd.domain.tenant.TenantId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;

@Autowired
public class RdbSprintRepository implements SprintRepository {

    public void save(Sprint aSprint) {

    }

    @Query(value = "SELECT * FROM sprints WHERE tenantId = ?1 AND aSprintId = ?2 LIMIT 1", nativeQuery = true)
    public Sprint sprintOfId(TenantId tenantId, SprintId aSprintId) {
        return null;
    }
}
