package com.sample.ddd.domain.sprint;

import com.sample.ddd.domain.tenant.TenantId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SprintRepository extends JpaRepository<Sprint, String> {
    void save(Sprint aSprint);

    Sprint sprintOfId(TenantId tenantId, SprintId aSprintId);
}
