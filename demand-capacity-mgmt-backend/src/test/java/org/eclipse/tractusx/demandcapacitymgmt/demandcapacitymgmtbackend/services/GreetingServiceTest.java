package org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services;

import eclipse.tractusx.demand_capacity_mgmt_specification.model.Greeting;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.entities.TestEntity;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.repositories.TestRepository;
import org.eclipse.tractusx.demandcapacitymgmt.demandcapacitymgmtbackend.services.impl.GreetingServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class GreetingServiceTest {

    @InjectMocks
    private GreetingServiceImpl greetingService;

    @Mock
    private TestRepository testRepository;

    @Captor
    private ArgumentCaptor<TestEntity> testEntityArgumentCaptor;

    private Greeting greeting = createGreeting();

    @Test
    void shouldCreateTest(){

        when(testRepository.save(any())).thenReturn(null);

        greetingService.saveGreeting(greeting);

        verify(testRepository).save(any());

    }

    private Greeting createGreeting(){
        Greeting greeting = new Greeting();
        greeting.setMessage("");
        return greeting;
    }
}
