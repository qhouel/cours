package controleur;

import javax.swing.table.AbstractTableModel;

public class Tableau extends AbstractTableModel
{

	private String entetes[];
	private Object donnees[][];
	
	
	
	public Tableau(String[] entetes, Object[][] donnees) {
		super();
		this.entetes = entetes;
		this.donnees = donnees;
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return this.donnees.length;
	}

	@Override
	public int getColumnCount() {

		return this.entetes.length;
	}

	@Override
	public Object getValueAt(int ligne, int colonne) {
		// TODO Auto-generated method stub
		return this.donnees[ligne][colonne];
	}
	
	public void ajouterLigne(Object ligne[])
	{
		Object [][] matrice = new Object[this.donnees.length + 1][this.entetes.length];
		//copie de la matrice
		for (int i = 0; i<this.donnees.length; i++)
		{
			matrice[i] = this.donnees[i]; 
		}
		matrice[this.donnees.length] = ligne;
		this.donnees = matrice;
		
		//on actualise l'affichage
		this.fireTableDataChanged();
	}
	
	public void supprimerLigne(int indiceLigne)
	{
		Object [][] matrice = new Object[this.donnees.length - 1][this.entetes.length];	
		int j = 0;
		for (int i = 0; i<this.donnees.length; i++)
		{
			if (i != indiceLigne)
			{	
				matrice[j] = this.donnees[i];
				j++;
			}
		}
		this.donnees = matrice;
		this.fireTableDataChanged();
	}

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return this.entetes[column];
	}
	
	
	
}
