package com.learning.webservice.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
	/*
	 * { "token":
	 * "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhbWl0IiwiZXhwIjoxNjAyMDQyNjE2LCJpYXQiOjE2MDE0Mzc4MTZ9.4YqsiUgQ29uwugplSKVcJf5NVjkdjDLQFpvxkP_2ZteVkMuFzZIWReGleY3eOH3CHsa7uihtwCTDAYfqSy59dw"
	 * }
	 */

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

