
<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view  locale="#{locale.current}">

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <title>JSP Accueil</title>
        </head>
        <body>
            <h1><h:outputText value="DosiBox" /></h1>
            <h3><h:outputText value="Langue courante :#{AppMessages.login_title}" /></h3>

            <h:form>

                 <%@ include file="menu.jsp" %>
                                
            </h:form>
        </body>
    </html>
</f:view>
