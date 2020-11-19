package geco;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
class LoginServiceTest {

    @org.testng.annotations.Test
    public void testloginExists() {

        String[] newL = {"login","login2"};
        LoginService loginsExistants = new LoginService(newL);
        assertFalse(loginsExistants.loginExists("login3"), "The ArrayList must not contains \"login3\"");
    }

    @org.testng.annotations.Test
    public void testaddLogin() {

        String[] newL = {"login","login2"};
        LoginService loginsExistants = new LoginService(newL);
        String newLogin = "login3";
        loginsExistants.addLogin(newLogin);
        assertTrue(loginsExistants.loginExists("login3"), "The ArrayList must contains \"login3\"");
    }

    @org.testng.annotations.Test

    public void testfindAllLoginsStartingWith() {
        String[] newL = {"login","login2"};
        LoginService loginsExistants = new LoginService(newL);
        assertEquals(loginsExistants.findAllLoginsStartingWith("login").size(), 2);
    }

    @org.testng.annotations.Test

    public void testfindAllLogins() {
        String[] newL = {"login","login2"};
        LoginService loginsExistants = new LoginService(newL);
        assertEquals(loginsExistants.findAllLogins().size(), 2);
        assertTrue(loginsExistants.findAllLogins().contains("login2"), "The returned List must have the elem \"login2\"");
    }

    public void main(String[] args){

        testloginExists();
        testaddLogin();
        testfindAllLoginsStartingWith();
        testfindAllLogins();
    }
}