package com.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Dave on 2017/3/1.
 */
@Component
@ConfigurationProperties(prefix = "cup")
public class CupProperties
{
    private String maxSize;
    private String minSize;
    private String content;

    public String getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    public String getMinSize() {
        return minSize;
    }

    public void setMinSize(String minSize) {
        this.minSize = minSize;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "CupProperties{" +
                "maxSize='" + maxSize + '\'' +
                ", minSize='" + minSize + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
