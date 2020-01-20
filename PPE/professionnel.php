<h3>Liste des professionnel </h3>

		<?php
			//instanciation du controleur


			$unControleur->setTable ("professionnel");

			include ("vue/vue_insert_professionnel.php");
			if (isset($_POST['Valider']))
			{
				$tab = array(
					"RAISON_SOCIALE"=>$_POST['RAISON_SOCIALE'],
					"SIRET"=>$_POST['SIRET'],
					"NOM"=>$_POST['NOM'], 
					"PRENOM"=>$_POST['PRENOM'],
					"ADRESSE"=>$_POST['ADRESSE'],
					"VILLE"=>$_POST['VILLE'],
					"CODE_POSTAL"=>$_POST['CODE_POSTAL'],
					"EMAIL"=>$_POST['EMAIL'],
					"TELEPHONE"=>$_POST['TELEPHONE'], 
					"MDP"=>$_POST['MDP'],
					);
				$unControleur->insert ($tab);
			}

			$lesProfessionnels = $unControleur->select_All();
			//var_dump($lesEtudiants);
			include ("vue/vue_selectAll_professionnel.php");
 		?>
