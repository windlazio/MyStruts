package com.windlazio.development.actionforms;

import org.apache.struts.action.ActionForm;

public class LoginActionForm extends ActionForm {
    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        LoginActionForm.username = username;
    }

    private static String username;

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        LoginActionForm.password = password;
    }

    private static String password;
}
