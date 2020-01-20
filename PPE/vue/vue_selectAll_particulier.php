	<table border = 1 >
		<tr><td> Idcli </td><td> Prénom  </td>
			<td> Nom </td> <td> Adresse </td> <td> Ville </td><td> Code postal </td><td> Email </td><td> Téléphone </td>
			</tr>
			<?php
			foreach ($lesParticuliers as $unParticulier)
			{
				echo "<tr>	<td> ".$unParticulier['IDCLI']."</td>
					<td> ".$unParticulier['PRENOM']."</td>
				<td> ".$unParticulier['NOM']."</td>
				<td> ".$unParticulier['ADRESSE']."</td>
				<td> ".$unParticulier['VILLE']."</td>
				<td> ".$unParticulier['CODE_POSTAL']."</td>
				<td> ".$unParticulier['EMAIL']."</td>
				<td> ".$unParticulier['TELEPHONE']."</td> </tr>" ;
			}
			?>
	</table>