/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ubo.model;

/**
 *
 * @author Firdaousse
 */
public class User {

    private String login;
    private String name;
    private String passeword;

    public User() {
    }
   
    public User(String login, String nom, String passeword) {
        this.login = login;
        this.name = nom;
        this.passeword = passeword;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPasseword() {
        return passeword;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setName(String nom) {
        this.name = nom;
    }

    public void setPasseword(String passeword) {
        this.passeword = passeword;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
