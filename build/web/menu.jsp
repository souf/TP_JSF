<%-- 
    Document   : fichier
    Created on : 9 mars 2012, 00:16:48
    Author     : Firdaousse
--%>
<h:panelGrid columns="1" cellspacing="3" >
    <h:commandLink value="Accueil" action="Home"/>
    <h:panelGroup rendered="#{login.loggedIn}">
        <h:commandLink value="Mes Fichiers" action="self"/>
        <br/>
        <h:commandLink value="Logout" action="#{login.logout}"/>
    </h:panelGroup>
    <h:panelGroup rendered="#{!login.loggedIn}">
        <h:commandLink value="Login" action="Login"/>
        <br/>
        <h:commandLink value="S'inscrire" action="Subscribe"/>
    </h:panelGroup>
    <br/>
    <h:outputText value="Changer la langue:" />
    <h:panelGroup>
        <h:commandLink id="fr" value="#{AppMessages.french}"
                       action="self" actionListener="#{locale.updateLocale}" />
        <br/>
        <h:commandLink id="ar" value="#{AppMessages.arabic}"
                       action="self" actionListener="#{locale.updateLocale}" />
    </h:panelGroup>
    
</h:panelGrid>

