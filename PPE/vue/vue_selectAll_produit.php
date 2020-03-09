	<table border = 1 >
		<tr><td> IdPro </td>
			<td> Catégorie  </td>
			<td> Nom </td>
			<td> Description </td>
			<td> Prix </td>
			<td> Poids </td>
			<td> Volume en m3</td>
			<td> Photo </td>
			<td> Qte </td>
			<td> Action</td>
			</tr>
			<?php
			foreach ($lesProduits as $unProduit)
			{
				echo "
				<tr>
					<td> ".$unProduit['IDPRO']."</td>
					<td> ".$unProduit['CATEGORIE']."</td>
					<td> ".$unProduit['NOMPRO']."</td>
					<td> ".$unProduit['DESCRIPTION']."</td>
					<td> ".$unProduit['PRIX']." €</td>
					<td> ".$unProduit['POIDS']." kg</td>
					<td> ".$unProduit['VOLUME']."</td>
					<td> <img src =".$unProduit['PHOTO']." width='100' height='100'> </td> 
					<td> <FORM> <SELECT name='QteCommande' size='1'>
						 <OPTION>1<OPTION>2<OPTION>3<OPTION>4<OPTION>5
						 <OPTION>6<OPTION>7<OPTION>8<OPTION>9<OPTION>10
						 </SELECT></FORM></td>
					<td><input type='button' class='btn btn-link' value='Acheter'></td>
				</tr>" ;

			}
			?>
			<!--
			comment faire le bouton acheter:

			1: verifier que la quantité n'est pas supérieure au stock
			2: ajouter dans le panier
			-->
	</table>

