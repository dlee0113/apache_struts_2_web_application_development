package com.packt.s2wad.ch09.examples.exceptions;

import com.packt.s2wad.ch09.models.User;

public class UserAccessException extends RuntimeException {

    public enum Reason {
        NO_ROLE("does not have role"),
        NO_ACCESS("does not have access");
        private String message;
        private Reason(String message) {
            this.message = message;
        }
        public String getMessage() { return message; }
    };

    private User user;
    private Reason reason;

    public UserAccessException(User user, Reason reason) {
        this.user = user;
        this.reason = reason;
    }

    @Override
    public String getMessage() {
        return String.format("User %d %s.", user.getId(), reason.getMessage());
    }

    //~ Utils

    public static UserAccessException userHasNoRole(User user) {
        return new UserAccessException(user, Reason.NO_ROLE);
    }

    public static UserAccessException userHasNoAccess(User user) {
        return new UserAccessException(user, Reason.NO_ACCESS);
    }

    //~ Accessors

    public Reason getReason() {
        return reason;
    }

    public void setReason(Reason reason) {
        this.reason = reason;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
