package com.windlazio.development.actions;


import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.windlazio.development.actionforms.LoginActionForm;

public class LoginAction extends Action {
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String path = "ERROR";
        LoginActionForm loginActionForm = (LoginActionForm)form;
        String userName = loginActionForm.getUsername();
        String passWord = loginActionForm.getPassword();

        if("admin".equals(userName) && "admin".equals(passWord)) {
            path = "OK";
            request.setAttribute("name", userName);
        } else {
            path = "ERROR";
        }
        return mapping.findForward(path);
        //return super.execute(mapping, form, request, response);
    }
}
