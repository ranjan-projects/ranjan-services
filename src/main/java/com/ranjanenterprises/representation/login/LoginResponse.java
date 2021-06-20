package com.ranjanenterprises.representation.login;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class LoginResponse {

    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static final class LoginResponseBuilder {
        private String status;

        private LoginResponseBuilder() {
        }

        public static LoginResponseBuilder aLoginResponse() {
            return new LoginResponseBuilder();
        }

        public LoginResponseBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public LoginResponse build() {
            LoginResponse loginResponse = new LoginResponse();
            loginResponse.setStatus(status);
            return loginResponse;
        }
    }
}
