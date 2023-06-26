package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.repositories;

import java.util.List;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities.WeekBasedCapacityGroupEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeekBasedCapacityGroupRepository extends JpaRepository<WeekBasedCapacityGroupEntity, Integer> {
    List<WeekBasedCapacityGroupEntity> getAllByViewed(Boolean viewed);
}
