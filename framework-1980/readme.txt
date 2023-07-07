-Les classes model doivent etre dans le package « model »
-les models doivent avoir constructeur vide

-Pour specifier les Url: @Url(urlName= « urlName »)

-Les attributs de la classe doivent être des variables de types primitifs : String,double,Date

-La fonction addItem(«nomDonnée»,data) pour envoyer des données du controller vers la view

-@Scope(isSingleton=true) pour marquer si singleton ou pas

-Annoter avec Authentification et specifier les dans web.xml ( Authentification(profil="admin") 

-Annoter methode avec @RestAPI pour une fonction qui retourne transforme les objets retourné en json avec gson de GOOGLE

-Mettre isJson=true dans fonction qui retourne Modelview pour transformer en JSON



