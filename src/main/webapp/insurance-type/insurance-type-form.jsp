<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<%@ include file="../head.jspf" %>
<body>
<%@include file="../header.jspf" %>
<div class="container">
    <h4 class="display-6 text-center m-3">Tworzenie typu ubezpieczenia</h4>
    <div class="col-8 m-auto">
        <form method="post">
            <fieldset>
                <div class="mb-3">
                    <input placeholder="Wpisz nazwę" class="form-control" type="text" name="name" required><br>
                </div>
                <div class="mb-3">
                    <label >
                    Opis: <textarea name="description" class="form-control"></textarea>
                    </label>
                </div>
                <div class="mb-3">
                    <input placeholder="Wpisz priorytet" class="form-control" type="number" name="priority" required>
                </div>
            </fieldset>
            <button class="btn btn-primary" type="submit">Wyślij</button>
            <button class="btn btn-secondary" type="reset">Wyczyść</button>
        </form>
    </div>
</div>
<%@ include file="../footer.jspf" %>
</body>
</html>