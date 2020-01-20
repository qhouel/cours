<?php
    require_once("controleur/controleur.php");
    $controller = new Controleur("localhost", "xyz_db", "root", "");
    $client = $controller->select("client", "NOM", $_POST['nom']);
    echo $_POST['nom'] . $client['nom'] . $_POST['mdp'] . $client['MDP'];
    if($_POST['nom'] == $client['NOM'] && $_POST['mdp'] == $client['MDP']) {
        $_SESSION['username'] = $client['NOM'];
        header('Location: index.php');
    } else {
      header('Location: connexion.php?erreur=1'); // utilisateur ou mot de passe incorrect
   }
