	<table border = 1 >
		<tr><td> IdPro </td><td> Catégorie  </td>
			<td> Nom </td> <td> Description </td> <td> Prix </td><td> Poids </td><td> Volume en m3</td><td> Photo </td><td> Actions </td>
			</tr>
			<?php
			foreach ($lesProduits as $unProduit)
			{
				echo "<tr>	<td> ".$unProduit['IDPRO']."</td>
					<td> ".$unProduit['CATEGORIE']."</td>
				<td> ".$unProduit['NOMPRO']."</td>
				<td> ".$unProduit['DESCRIPTION']."</td>
				<td> ".$unProduit['PRIX']." €</td>
				<td> ".$unProduit['POIDS']." kg</td>
				<td> ".$unProduit['VOLUME']."</td>
				<td> <img src =".$unProduit['PHOTO']." width='100' height='100'> </td> </tr>" ;
			}
			?>
	</table>

