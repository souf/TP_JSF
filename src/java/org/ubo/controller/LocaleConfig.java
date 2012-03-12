/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubo.controller;

import javax.faces.application.Application;
import javax.faces.application.ViewHandler;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;



/**
 *
 * @author Firdaousse
 */
public class LocaleConfig {

    public String locale = "fr";

    public void updateLocale(ActionEvent event) {
        this.locale = event.getComponent().getId();
        // force la reconstruction de la page
        FacesContext context = FacesContext.getCurrentInstance();
        Application application = context.getApplication();
        ViewHandler viewHandler = application.getViewHandler();
        UIViewRoot viewRoot = viewHandler.createView(context,
                context.getViewRoot().getViewId());
        context.setViewRoot(viewRoot);
        context.renderResponse();
    }

    public String getCurrent() {
        return this.locale;
    }

   
}
