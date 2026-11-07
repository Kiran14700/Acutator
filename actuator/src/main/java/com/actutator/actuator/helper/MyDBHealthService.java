package com.actutator.actuator.helper;

import org.springframework.boot.health.contributor.Health;
import org.springframework.boot.health.contributor.HealthIndicator;
import org.springframework.stereotype.Component;
//step 3: we are checking  databse health

@Component
public class MyDBHealthService implements HealthIndicator {

    private static final String DB_SERVICE = "Database Service";

    public boolean isHealthGood() {
        // Custom logic
        return true;
    }

    @Override
    public Health health() {

        if (isHealthGood()) {
            return Health.up()
                    .withDetail(DB_SERVICE, "Database service is running")
                    .build();
        }

        return Health.down()
                .withDetail(DB_SERVICE, "Database service is not running")
                .build();
    }
}