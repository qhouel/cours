

<h3> Liste des produits </h3>
 		<?php


			$unControleur->setTable ("produit");
			echo "<br>";

			$lesProduits = $unControleur->select_All();
			include ("vue/vue_selectAll_produit.php");
 		?>
