<%-- 
    Document   : inscription
    Created on : 6 mars 2012, 23:23:28
    Author     : Firdaousse
--%>


<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Page</title>
        </head>
        <body>
            <h1><h:outputText value="Inscription"/></h1>

            <h:form>

                <table border="0">
                    <tr>
                        <td> <h:outputText value="Nom :"/></td>
                        <td> <h:inputText value="#{user.name}"/>   <br/></td>
                    </tr>
                    <tr>
                        <td> <h:outputText value="Login :"/></td>
                        <td> <h:inputText id="login" value="#{user.login}" required="true" /></td>
                    </tr>
                    <tr>
                        <td> <h:outputText value="Passeword:"/></td>
                        <td> <h:inputSecret id="pass" value="#{user.passeword}" required="true" /></td>
                    </tr>
                    <tr>

                        <td colspan="2"> <h:commandButton action="#{register.AjouterUser}" value="S'inscrire" /></td>

                    </tr>
                    <tr>
                      <!--  <td colspan="2" align="right" ><h:commandLink action="Login" value="S'authentifier?" /></td>-->
                    </tr>

                </table>
                <h:messages showDetail="true" layout="table" style="color:red;" showSummary="true"/>
                <h:message id="msg" for="login , pass" />
                <br/>
                <!-- <h3><h:outputText value="Liste valeurs enregistrées:" /></h3>-->
                <h:dataTable value="#{register.users}" var="u" border="1" width="227">
                    <h:column>
                        <h:outputText value="#{u.name}" />
                    </h:column>
                    <h:column>
                        <h:outputText value="#{u.login}" />
                    </h:column>
                    <h:column>
                        <h:outputText value="#{u.passeword}" />
                    </h:column>
                </h:dataTable>

            </h:form>

        </body>
    </html>
</f:view>