<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="assets/index.css" type="text/css">
    <title>Page CRUD</title>
</head>
<body>
<h1>Liste des utilisateurs</h1>

<table>
    <thead>
    <tr>
        <th>id</th>
        <th>Nom</th>
        <th>Prenom</th>
        <th>Action</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>1</td>
        <td>Rahajarison</td>
        <td>Rianala</td>
        <td>
            <a href="frontServlet/modif">Modifier</a>
            <a href="frontServlet/suppr">Supprimer</a>
        </td>
    </tr>
    <tr>
        <td>2</td>
        <td>Rahajarison</td>
        <td>Rianala Fitiavana</td>
        <td>
            <a href="frontServlet/modif">Modifier</a>
            <a href="frontServlet/suppr">Supprimer</a>
        </td>
    </tr>
    </tbody>
</table>

<form action="frontServlet/ajouter" method="post">
    <h2>Ajouter un utilisateur</h2>
    <label for="nom">Nom :</label>
    <input type="text" id="nom" name="nom">
    <label for="prenom">Prenom :</label>
    <input type="text" id="prenom" name="prenom">
    <button type="submit">Ajouter</button>
</form>
</body>
</html>
