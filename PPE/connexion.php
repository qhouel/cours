<html>
    <head>
       <meta charset="utf-8">
       <link rel="stylesheet" type="text/css" href="style.css">
       </head>
    <body>
        <div id="container">            
            <form class="form" action="verification.php" method="POST">
                <h1>Connexion</h1>
                
                <label><b>Nom d'utilisateur</b></label>
                <input class="user" type="text" placeholder="Entrer le nom d'utilisateur" name="nom" required>

                <label><b>Mot de passe</b></label>
                <input class="user" type="password" placeholder="Entrer le mot de passe" name="mdp" required>

                <input class="connexion" type="submit" id='submit' value='LOGIN' >
                <?php
                if(isset($_GET['erreur'])){
                    $err = $_GET['erreur'];
                    if($err==1 || $err==2)
                        echo "<p style='color:red'>Utilisateur ou mot de passe incorrect</p>";
                }
                ?>
            </form>
        </div>
    </body>
</html>