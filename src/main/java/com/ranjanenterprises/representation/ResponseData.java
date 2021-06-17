package com.ranjanenterprises.representation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class ResponseData {

    private List<Users> users;

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    public static final class ResponseDataBuilder {
        private List<Users> users;

        private ResponseDataBuilder() {
        }

        public static ResponseDataBuilder aResponseData() {
            return new ResponseDataBuilder();
        }

        public ResponseDataBuilder withUsers(List<Users> users) {
            this.users = users;
            return this;
        }

        public ResponseData build() {
            ResponseData responseData = new ResponseData();
            responseData.setUsers(users);
            return responseData;
        }
    }
}
