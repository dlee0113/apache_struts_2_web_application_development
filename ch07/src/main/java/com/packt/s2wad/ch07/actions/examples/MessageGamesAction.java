package com.packt.s2wad.ch07.actions.examples;

import com.opensymphony.xwork2.ActionSupport;
import com.packt.s2wad.ch07.actions.recipes.NewRecipeAction;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
        @Result(name = ActionSupport.INPUT,
                location = "/WEB-INF/content/examples/message-games.jsp"),
        @Result(name = ActionSupport.SUCCESS,
                type = "redirectAction",
                location = "message-games")
})
public class MessageGamesAction extends ActionSupport {

    private String name;
    private String showMinOrMax;

    private static final Log LOG = LogFactory.getLog(MessageGamesAction.class);

    @Override
    @Action(value = "message-games")
    public String input() throws Exception {
        LOG.debug("Enter.");
        return INPUT;
    }

    @Action(value = "message-games-process")
    public String process() {
        LOG.debug("Enter.");
        return SUCCESS;
    }

    @Override
    public String toString() {
        return "MessageGamesAction{" +
               "name='" + name + '\'' +
               ", showMinOrMax='" + showMinOrMax + '\'' +
               '}';
    }

    //~ Accessors

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShowMinOrMax() {
        return showMinOrMax;
    }

    public void setShowMinOrMax(String showMinOrMax) {
        this.showMinOrMax = showMinOrMax;
    }

}
