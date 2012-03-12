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
public class Login {

    private User currentUser = null;
    FacesMessage message = new FacesMessage();

    public String login() {

        ExternalContext context = FacesContext.getCurrentInstance().getExternalContext();
        //Return a mutable Map representing the request scope attributes for the current application.
        Map map = context.getRequestMap();
        User user = (User) map.get("user");
//cannot be cast to org.ubo.controller.Inscription
         Map    map2  = context.getApplicationMap();

        Inscription register = (Inscription) map2.get("register");

        Vector<User> users = (Vector) register.getUsers();

        //erreur objet vide !!!
        if (user != null) {

            for (int i = 0; i < users.size(); i++) {
                //je dois retourner la chaine HOme
                User myUser = users.get(i);
                System.out.println(myUser.getLogin());
                System.out.println(user.getLogin());
                if (user.getPasseword().equals(myUser.getPasseword()) && user.getLogin().equals(myUser.getLogin())) {
                    currentUser = user;
                    return "Home";

                } else {
                    //sinon return rien
                    currentUser = null;

                    message.setSeverity(FacesMessage.SEVERITY_ERROR);
                    message.setSummary("Error");
                    message.setDetail("Login ou passeword incorrecte");

                    FacesContext.getCurrentInstance().addMessage("msg", message);
                    return "Login ou passeword incorrecte";

                }
            }
            return null;
        } else {
            //Objet vide
            currentUser = null;
            return "Login";

        }
    }

     public String logout() {
        currentUser = null;
        return "Home";
    }
     
    public boolean isLoggedIn() {

        if (currentUser != null) {
            return true;
        }
        return false;

    }

    public User getCurrent() {
        return this.currentUser;
    }

    public void SetCurrent(User user) {
        this.currentUser = user;
    }
}
