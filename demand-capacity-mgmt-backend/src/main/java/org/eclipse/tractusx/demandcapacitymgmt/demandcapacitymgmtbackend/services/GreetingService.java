package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services;

import eclipse.tractusx.demand_capacity_mgmt_specification.model.Greeting;

public interface GreetingService {
    void saveGreeting(Greeting greeting);

    void findById(String id);
}
