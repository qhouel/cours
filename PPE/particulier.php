<h3>Liste des particuliers </h3>

		<?php
			//instanciation du controleur


			$unControleur->setTable ("particulier");

			include ("vue/vue_insert_particulier.php");
			if (isset($_POST['Valider']))
			{
				$tab = array(
					"PRENOM"=>$_POST['PRENOM'],
					"NOM"=>$_POST['NOM'], 
					"ADRESSE"=>$_POST['ADRESSE'],
					"VILLE"=>$_POST['VILLE'],
					"CODE_POSTAL"=>$_POST['CODE_POSTAL'],
					"EMAIL"=>$_POST['EMAIL'],
					"TELEPHONE"=>$_POST['TELEPHONE'], 
					"MDP"=>$_POST['MDP'],
					);
				$unControleur->insert ($tab);
			}

			$lesParticuliers = $unControleur->select_All();
			//var_dump($lesEtudiants);
			include ("vue/vue_selectAll_particulier.php");
 		?>
