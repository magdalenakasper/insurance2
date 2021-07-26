<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@ include file="../head.jspf" %>
<body>
<%@include file="../header.jspf" %>
<div class="container">
    <h4 class="display-6 text-center m-3">Składanie wniosku o ubezpieczenie Life</h4>
    <div class="col-8 m-auto">
        <form method="post">
            <fieldset>
                <div class="mb-3">
                    <input placeholder="Wpisz imię" class="form-control" type="text" name="firstName" required><br>
                </div>
                <div class="mb-3">
                    <input placeholder="Wpisz nazwisko" class="form-control" type="text" name="lastName" required>
                </div>
                <div class="mb-3">
                    <input placeholder="Podaj datę urodzin" class="form-control" class="form-control" type="date"
                           name="birthDate" required><br>
                </div>
                <div class="mb-3">
                    <input placeholder="Wpisz pesel" class="form-control" type="text" name="pesel" required><br>
                </div>
                <div class="mb-3">
                    <input placeholder="Wpisz email" class="form-control" type="email" name="email" required><br>
                </div>
            </fieldset>
            <fieldset>
                <div class="mb-3">
                    <input placeholder="Nazwa produktu" class="form-control" type="text" name="name" required><br>
                </div>
                <div class="mb-3">
                    <input placeholder="Kwota ubezpieczenia" class="form-control" type="number" name="insuranceAmount" required><br>
                </div>
            </fieldset>
            <select name="insuranceTypeId" class="form-control">
                <c:forEach var="insuranceType" items="${insuranceTypes}">
                    <option value="${insuranceType.id}">${insuranceType.name}</option>
                </c:forEach>
            </select>
            <button class="btn btn-primary" type="submit">Wyślij</button>
            <button class="btn btn-secondary" type="reset">Wyczyść</button>
        </form>
    </div>
</div>
<%@ include file="../footer.jspf" %>
</body>
</html>