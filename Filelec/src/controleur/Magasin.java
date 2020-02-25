package controleur;

import java.util.ArrayList;

import modele.Modele;
import vue.Connexion;
import vue.Generale;
import vue.Menu;

public class Magasin {

	private static Generale uneGenerale = null;
	private static Connexion uneConnexion = null;
	private static Menu unMenu = null;
	
	public static void instancierMenu(User unUser)
	{
		unMenu = new Menu(unUser);
	}
	
	public static void main(String args[])
	{
		uneConnexion = new Connexion();
	}
	/*****************Appel du modele*******************/
	public static User selectWhereUser(String nom, String mdp)
	{
		return Modele.selectWhereUser(nom, mdp);
	}
	public static void insertProduit(Produit unProduit)
	{
		Modele.insertProduit(unProduit);
	}
	public static ArrayList<Produit> selectAllProduits()
	{
		return Modele.selectAllProduits();
	}
	/***************************************************/
	public static Object [][] getDonnees (ArrayList<Produit> lesProduits)
	{
		Object [][] matrice = new Object [lesProduits.size()][4];
		int i = 0;
		for (Produit unProduit : lesProduits)
		{
			matrice [i][0] = unProduit.getRef();
			matrice [i][1] = unProduit.getDes();
			matrice [i][2] = unProduit.getPrix() + "";
			matrice [i][3] = unProduit.getQte() + "";
			i++;
		}
		return matrice;
	}
	public static void deleteProduit (String ref)
	{
		if (! ref.equals("")) {
		Modele.deleteProduit(ref);
		}
	}
	public static ArrayList<Produit> findAllProduits(String mot) {
		// TODO Auto-generated method stub
		return Modele.findAllProduits(mot);
	}
	public static void instancerGenerale() {
		uneGenerale = new Generale();
	}
	public static void fin() {
		uneGenerale.dispose();
		unMenu.setVisible(true);
		
	}

	public static Connexion getUneConnexion() {
		return uneConnexion;
	}

	public static void setUneConnexion(Connexion uneConnexion) {
		Magasin.uneConnexion = uneConnexion;
	}
	
}
