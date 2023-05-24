package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.controllers;

import eclipse.tractusx.demand_capacity_mgmt_specification.api.DefaultApi;
import eclipse.tractusx.demand_capacity_mgmt_specification.model.Greeting;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HelloController implements DefaultApi {
    @Override
    public ResponseEntity<Greeting> getGreeting() {
        return null;
    }
}
