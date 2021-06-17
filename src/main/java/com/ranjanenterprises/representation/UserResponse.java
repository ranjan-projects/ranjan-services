package com.ranjanenterprises.representation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserResponse {

    private long id;
    private String status;
    private String message;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static final class UserResponseBuilder {
        private long id;
        private String status;
        private String message;

        private UserResponseBuilder() {
        }

        public static UserResponseBuilder anUserResponse() {
            return new UserResponseBuilder();
        }

        public UserResponseBuilder withId(long id) {
            this.id = id;
            return this;
        }

        public UserResponseBuilder withStatus(String status) {
            this.status = status;
            return this;
        }

        public UserResponseBuilder withMessage(String message) {
            this.message = message;
            return this;
        }

        public UserResponse build() {
            UserResponse userResponse = new UserResponse();
            userResponse.setId(id);
            userResponse.setStatus(status);
            userResponse.setMessage(message);
            return userResponse;
        }
    }
}
