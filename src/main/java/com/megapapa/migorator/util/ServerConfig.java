package com.megapapa.migorator.util;

import org.apache.cayenne.configuration.server.ServerRuntime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServerConfig {

    @Bean(name = "runtime")
    public ServerRuntime getServerRuntime() {
        return ServerRuntime.builder()
                .addConfig("cayenne-project.xml")
                .build();
    }

}
