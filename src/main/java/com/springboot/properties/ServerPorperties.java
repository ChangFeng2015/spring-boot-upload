package com.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Dave on 2017/3/1.
 */
@Component
@ConfigurationProperties(prefix = "server")
public class ServerPorperties
{
    private String port;
    private String contextPath;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    @Override
    public String toString() {
        return "ServerPorperties{" +
                "port='" + port + '\'' +
                ", contextPath='" + contextPath + '\'' +
                '}';
    }
}
