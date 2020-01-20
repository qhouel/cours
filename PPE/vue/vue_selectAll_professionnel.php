	<table border = 1 >
		<tr><td> Idcli </td> <td>Raison sociale</td> <td>Siret</td>
			<td> Nom </td> <td> Prénom  </td> <td> Adresse </td> <td> Ville </td><td> Code postal </td><td> Email </td><td> Téléphone </td>
			</tr>
			<?php
			foreach ($lesProfessionnels as $unProfessionnel)
			{
				echo "<tr>	<td> ".$unProfessionnel['IDCLI']."</td>
				<td> ".$unProfessionnel['RAISON_SOCIALE']."</td>
				<td> ".$unProfessionnel['SIRET']."</td>	
				<td> ".$unProfessionnel['NOM']."</td>
				<td> ".$unProfessionnel['PRENOM']."</td>
				<td> ".$unProfessionnel['ADRESSE']."</td>
				<td> ".$unProfessionnel['VILLE']."</td>
				<td> ".$unProfessionnel['CODE_POSTAL']."</td>
				<td> ".$unProfessionnel['EMAIL']."</td>
				<td> ".$unProfessionnel['TELEPHONE']."</td> </tr>" ;
			}
			?>
	</table>