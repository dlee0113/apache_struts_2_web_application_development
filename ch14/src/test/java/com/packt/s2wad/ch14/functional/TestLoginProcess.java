package com.packt.s2wad.ch14.functional;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * TODO Document TestLoginProcess.
 */
public class TestLoginProcess {

    private static Selenium selenium;

    private static final String LOGIN_INPUT_URL = "http://localhost:8080/user/login";

    @BeforeClass public static void setup() {
        selenium = new DefaultSelenium("localhost", 4444, "*firefox", LOGIN_INPUT_URL);
        selenium.start();
    }

    @AfterClass public static void teardown() {
        selenium.stop();
    }

    public void assertElementPresent(String msg, String sel) {
        assertTrue(String.format("%s: '%s'", msg, sel),
                   selenium.isElementPresent(sel));
    }

    @Test
    public void testLoginFormFieldsPresent() {
        selenium.open(LOGIN_INPUT_URL);
        assertElementPresent("login form", "id=login_process");
        assertElementPresent("email field", "id=login_process_email");
        assertElementPresent("password field", "id=login_process_password");
        assertElementPresent("Login button", "//input[@value='Login']");
    }

    @Test
    public void testEmailValidation() {
        testLoginFormFieldsPresent();

        selenium.typeKeys("id=login_process_email", " ");
        selenium.typeKeys("id=login_process_password", "ohai");

        selenium.click("//input[@value='Login']");
        selenium.waitForPageToLoad("10000");

        // Should not have moved to /home
        assertUrlEndsWith("/login-process");
        assertElementPresent("an error message span", "css=span[class~='errorMessage']");
        String text = selenium.getText("css=span[class~='errorMessage']");
        assertTrue(text.contains("Email is required"));
    }

    @Test
    public void testFailedLogin() {
        testLoginFormFieldsPresent();

        selenium.typeKeys("id=login_process_email", "nologin");
        selenium.typeKeys("id=login_process_password", "ohai");

        selenium.click("//input[@value='Login']");
        selenium.waitForPageToLoad("10000");

        // Should not have moved to /home
        assertUrlEndsWith("/login-process");
        assertElementPresent("flash div", "css=div[id=flash][class~='error']");
        String text = selenium.getText("css=div[id=flash][class~='error']");
        assertTrue(text.contains("Login failed"));
    }

    @Test
    public void testLoginOkay() {
        testLoginFormFieldsPresent();

        selenium.typeKeys("id=login_process_email", "kthxbai");
        selenium.typeKeys("id=login_process_password", "ohai");

        selenium.click("//input[@value='Login']");
        selenium.waitForPageToLoad("10000");

        // Should not have moved to /home
        assertUrlEndsWith("/home");
    }

    private void assertUrlEndsWith(String s) {
        assertTrue(selenium.getLocation().endsWith(s));
    }

}
