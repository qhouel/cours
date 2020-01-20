<?php
	//appel du modele
include ("modele/modele.php");
class Controleur
{
		//attribut de classe : une instance du modèle
	private $unModele;

	public function __construct($serveur, $bdd, $user, $mdp)
	{
			//instanciation de la classe Modele
		$this->unModele = new Modele ($serveur, $bdd, $user, $mdp);
	}

	public function getTable()
	{
		return $this->unModele->getTable();
	}

	public function select ($table, $whereColumn, $whereValue) {
		return $this->unModele->select($table, $whereColumn, $whereValue);
	}

	public function setTable($uneTable)
	{
		$this->unModele->setTable($uneTable);
	}

	public function select_All()
	{
		return $this->unModele->select_All();
	}

	public function insert($tab)
	{
		$this->unModele->insert($tab);
	}
	public function delete($tab, $operateur)
	{
		$this->unModele->delete($tab, $operateur);
	}
	public function select_search ($mot, $tab)
	{
		 return $this->unModele->select_search ($mot, $tab);

	}
}
?>
