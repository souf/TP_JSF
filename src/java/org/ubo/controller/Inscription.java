/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubo.controller;

import java.util.Map;
import java.util.Vector;
import javax.faces.application.FacesMessage;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.ubo.model.User;

/**
 *
 * @author Firdaousse
 */
public class Inscription {

    Vector<User> users = new Vector<User>();
    FacesMessage message = new FacesMessage();

    public void setUsers(Vector users) {
        this.users = users;
    }

    public Vector<User> getUsers() {
        return users;
    }

    public String AjouterUser() {

        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> map = context.getRequestMap();
        User user = (User) map.get("user");
        String retour = null;
        message.setSeverity(FacesMessage.SEVERITY_ERROR);
        message.setSummary("Error:");
        message.setDetail("Utiilsateur déja existant");


        if (user == null) users = new Vector<User>();
        
         boolean trouve = false;
         System.out.println("1");
        for (int i = 0; i < users.size(); i++) {
        System.out.println("2");
            User us = (User) users.get(i);

            if (user.getLogin().equals(us.getLogin())) {
                System.out.println("3");
                trouve = true;
                FacesContext.getCurrentInstance().addMessage("msg", message);
               // user= null;
            }
          //  else   users.add(user);

        }
        
        if(!trouve){
            System.out.println("4");
        users.add(user);
        retour = "Home";
        }
        
        return retour ;

    }
}
