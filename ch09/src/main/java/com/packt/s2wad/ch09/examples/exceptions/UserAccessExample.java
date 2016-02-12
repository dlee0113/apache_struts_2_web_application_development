package com.packt.s2wad.ch09.examples.exceptions;

import com.opensymphony.xwork2.ActionSupport;
import com.packt.s2wad.ch09.models.User;

public class UserAccessExample extends ActionSupport {

    public String noAccess() {
        User user = new User(1, "wtf@over.com", "Smelly", "Fishsalts");

        // Without the static helper:
        //throw new UserAccessException(user, UserAccessException.Reason.NO_ACCESS);

        // Static helpers make things marginally cleaner and more fluent.
        throw UserAccessException.userHasNoAccess(user);
    }

}
