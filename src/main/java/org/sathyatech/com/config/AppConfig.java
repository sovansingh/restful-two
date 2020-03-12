package org.sathyatech.com.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/rest")
public class AppConfig extends ResourceConfig{

	public AppConfig() {
		packages("org.sathyatech.com.provider");
	}
}
