<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index page</title>
</head>
<body>
</h1>
<br>
<form method="post" action="insert">
    <input type="text" name="idEtudiant" value="1">
    <input type="text" name="nom" value="Rahajarison">
    <input type="text" name="prenom" value="Rianala">
    <input type="date" name="dtn">
    <label>Male</label><input type="checkbox" value="1" name="sexe[]">
    <label>Femelle</label><input type="checkbox"  value="0" name="sexe[]">
    <input type="submit" value="Valider">
</form>
<a href="login.jsp"><h4>Login</h4></a>
<a href="all">Voir tous</a>
</body>
</html>
