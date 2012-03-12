<%-- 
    Document   : conn
    Created on : 6 mars 2012, 23:22:51
    Author     : Firdaousse
--%>

<f:view locale="#{login.current}">
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP_Connection</title>
        </head>
        <body>

            <h1><h:outputText value="Authentification"/></h1>
            <h:form>

                <table>
                    <tr>
                        <td><h:outputText value="Login :"/></td>
                        <td><h:inputText id="login" value="#{user.login}"/></td>
                    </tr>
                    <tr>
                        <td><h:outputText value="Passeword :"/></td>
                        <td><h:inputSecret id="passeword" value="#{user.passeword}" /></td>
                    </tr>
                    <h:messages showDetail="true" layout="table" style="color:red;" showSummary="true"/>
                    <h:message id="msg" for="login , passeword" />

                    <tr>

                        <td ><h:commandButton action="#{login.login}" value="Se connecter" /></td>
                    </tr>
                </table>
            </h:form>

        </body>

    </html>
</f:view>