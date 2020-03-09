<h3> Liste des produits </h3>
	<br>
 		<?php
			$unControleur->setTable ("produit");
			$lesProduits = $unControleur->select_All();
			include ("vue/vue_selectAll_produit.php");
 		?>
