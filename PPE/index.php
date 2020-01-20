  <body style='background:#fff;'>
        <div id="content">
            <br><br><br>
            <a class="deco" href='index.php?deconnexion=true'><span><h6>Déconnexion</h6></span></a>
            
            <!-- tester si l'utilisateur est connecté -->
            <?php
                session_start();
                if(isset($_GET['deconnexion']))
                { 
                   if($_GET['deconnexion']==true)
                   {  
                      session_unset();
                      header("location:connexion.php");
                   }
                }
                else if($_SESSION['username'] !== ""){
                    $user = $_SESSION['username'];
                    // afficher un message
                    echo "<h5>Bonjour"." ".$user.", vous êtes connecté</h5>";
                }
            ?>
<?php
require('nav.php');
include("controleur/controleur.php");
$unControleur = new Controleur ("localhost","xyz_db","root","");
?>
<html>
<head>
	<title>FILELEC</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, user-scalable=no">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body>
	<center>
		<h1> FILELEC pièces automobiles </h1>
		
<?php
			if (isset($_GET['page']))
				$page = $_GET['page'];
			else $page = 0;
			switch($page)
			{
				case 1 : include("particulier.php"); break;
				case 2 : include("professionnel.php"); break;
				case 3 : include("produit.php"); break;
				default :
				echo "<br><br><br>
				<h2>L'activité de FILELEC</h2>
			
				<p><b>Filelec est une entreprise fabriquant des équipements électriques d'automobiles. Elle emploie directement ou
				indirectement 300 personnes. Les clients de FILELEC sont des grands constructeurs, mais aussi des garages automobiles. 
				Le siège social de Filelec est situé à Lyon.</b></p>";
				break;
			}
		?>
		
	</center>
</body>
</html>

