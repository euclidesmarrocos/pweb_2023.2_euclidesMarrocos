package com.javainfinite.Health;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health.Builder;
import org.springframework.stereotype.Component;

@Component
public class HealthIndicator extends AbstractHealthIndicator {

	@Override
	protected void doHealthCheck(Builder builder) throws Exception {
		int i = 0; // implement the required logic, here i am using sample check to make it down
		if (i != 0) {
			builder.up();
		} else {
			builder.down();

		}

	}

}