package com.campaign;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
class CustomHealthIndicator implements HealthIndicator {

//    @Value("${spring.helth-check-status}")
    boolean isHealthy = true;


    @Override
    public Health health() {
        if (isHealthy) {
            return Health.up().build(); // Healthy status
        } else {
            return Health.down().withDetail("Reason", "Simulated unhealthy condition").build(); // Unhealthy status
        }
    }

    // Method to make the instance unhealthy
    public void makeUnhealthy() {
        isHealthy = false;
    }

    // Method to make the instance healthy
    public void makeHealthy() {
        isHealthy = true;
    }
}