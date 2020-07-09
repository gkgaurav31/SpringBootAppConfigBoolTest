package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "config")
public class MessageProperties {
    private String message;
    private Boolean myboolean;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

	public Boolean getMyboolean() {
		return myboolean;
	}

	public void setMyboolean(Boolean myboolean) {
		this.myboolean = myboolean;
	}

}