package com.packt.s2wad.ch06.sanity;

/**
 * TODO Document.
 */
public class UserAccessException extends RuntimeException {

    public enum Reason {
        NO_ROLE("does not have role"),
        NO_ACCESS("does not have access");

        private String message;
        private Reason(String message) {
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
    }

    private User user;
    private Reason reason;
    
    public UserAccessException(User user, Reason reason) {
        this.user = user;
        this.reason = reason;
    }

    public String getMessage() {
        return String.format("User %d %s.", user.getId(), reason.getMessage());
    }

}
