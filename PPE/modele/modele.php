<?php
class Modele
{
	private $pdo; //attribut de classe
	private $table;

	public function __construct ($serveur, $bdd, $user, $mdp)
	{
		$this->pdo = null;
		try
			{
				$this->pdo = new PDO ("mysql:host=".$serveur.";dbname=".$bdd,$user,$mdp);
			}
			catch (PDOException $exp)
			{
				echo "Erreur de connexion à la bdd";
				echo $exp->getMessage ();
			}
	}

	public function getTable()
	{
		return $this->table;
	}

	public function setTable($uneTable)
	{
		$this->table = $uneTable;
	}
	public function select_All ()
	{
		if ($this->pdo == null)
		{
			return null;
		}
		else {
			$requete = "select * from ".$this->table.";";
			//preparation de la requete
			$select =$this->pdo->prepare($requete);
			//execution de la requete
			$select->execute ();
			//extraction des données
			return $select->fetchAll ();
		}
	}
	public function select_search ($mot, $tab)
	{
		if ($this->pdo == null)
		{
			return null;
		}
		else {
			$donnees = array(":mot"=>'%$mot%');
			foreach ($tab as $cle)
			{
				 $tabWhere[]=$cle."like :mot";
			}
			$chaineWhere = implode ("or", $tabWhere);
			$requete = "select * from ".$this->table." where ".$chaineWhere.";" ;
			//preparation de la requete
			$select =$this->pdo->prepare($requete);
			//execution de la requete
			$select->execute ($donnees);
			//extraction des données
			return $select->fetchAll ();
		}
	}
	public function insert ($tab)
	{
		if ($this->pdo == null)
		{
			return null;
		}
		else {
			$donnees = array();
			$tabChamps = array();
			foreach ($tab as $cle => $valeur)
			{
				$tabChamps[] = ":".$cle;
				$donnees[":".$cle] = $valeur;
			}
			$chaineChamps = implode (", ", $tabChamps);
			$requete ="insert into ".$this->table." values (null, ".$chaineChamps.");";

			$select = $this->pdo->prepare ($requete);
			$select->execute ($donnees);
		}
	}/*
	public function delete ($tab, $operateur)
	{
		if ($this->pdo == null)
		{
			return null;
		}
		else
		{
			$donnees = array ();
			$tabWhere = array();
			foreach ($tab as $cle => $valeur) {
				$tabWhere[] = $cle ." = :".$cle;
				$donnees[":".$cle] = $valeur;
			}
			$chaineWhere = implode ($operateur, $tabWhere);
			$requete = "delete from ".$this->table. " where ".$chaineWhere.";";
			$delete = $this->pdo->prepare($requete);
			$delete->execute ($donnees);
		}
	}*/
}
?>
