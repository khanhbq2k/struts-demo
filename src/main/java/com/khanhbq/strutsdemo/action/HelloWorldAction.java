package com.khanhbq.strutsdemo.action;

import com.khanhbq.strutsdemo.form.HelloWorldForm;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldAction extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {

        HelloWorldForm helloWorldForm = (HelloWorldForm) form;
        helloWorldForm.setGreeting("Hello World using Struts 1.3!");

        return mapping.findForward("success");
    }
}
