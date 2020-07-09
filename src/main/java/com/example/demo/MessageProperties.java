package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "config")
public class MessageProperties {
    private String message;
    
    private boolean isEnable;
    private boolean isenabletest;

	public boolean isIsenabletest() {
		return isenabletest;
	}

	public void setIsenabletest(boolean isenabletest) {
		this.isenabletest = isenabletest;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}