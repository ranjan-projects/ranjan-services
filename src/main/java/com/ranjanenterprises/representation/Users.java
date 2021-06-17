package com.ranjanenterprises.representation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Users {

    private String name;
    private String username;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static final class UsersBuilder {
        private String name;
        private String username;
        private String email;

        private UsersBuilder() {
        }

        public static UsersBuilder anUsers() {
            return new UsersBuilder();
        }

        public UsersBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UsersBuilder withUsername(String username) {
            this.username = username;
            return this;
        }

        public UsersBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Users build() {
            Users users = new Users();
            users.setName(name);
            users.setUsername(username);
            users.setEmail(email);
            return users;
        }
    }
}
