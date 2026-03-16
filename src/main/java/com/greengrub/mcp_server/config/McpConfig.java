package com.greengrub.mcp_server.config;

import com.greengrub.mcp_server.service.HungerReliefMcpTools;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class McpConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public ToolCallbackProvider tools(HungerReliefMcpTools hungerReliefMcpTools) {
        return MethodToolCallbackProvider.builder()
                .toolObjects(hungerReliefMcpTools)
                .build();
    }
}
