package modele;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import controleur.Produit;
import controleur.User;

public class Modele {
	private static Bdd uneBdd = new Bdd("localhost","XYZ_db","root","");
	
	/********************************Gestion des users*****************************/
	public static User selectWhereUser(String nom, String mdp)
	{
		User unUser = null;
		String requete = "select * from client where nom = '"+ nom + "' and mdp = '" + mdp + "';";
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaconnexion().createStatement();
			ResultSet unRes = unStat.executeQuery(requete);
			if (unRes.next())
			{
				unUser = new User(
						unRes.getInt("idcli"), unRes.getString("nom"),
						unRes.getString("prenom"), unRes.getString("mdp"));
			}
			unRes.close();
			unStat.close();
			uneBdd.seDeconnecter();
		}
		catch (SQLException exp)
		{
			System.out.println("Erreur de requete");
		}
		return unUser;
	}
	
	/********************************Gestion des produits*****************************/
	
	public static ArrayList<Produit> selectAllProduits()
	{
		ArrayList<Produit> lesProduits = new ArrayList<Produit>();
		String requete = "select * from produit;";
		try
		{
			uneBdd.seConnecter();
			Statement unStat = uneBdd.getMaconnexion().createStatement();
			ResultSet desRes = unStat.executeQuery(requete);
			//parcours des résultats
			while (desRes.next())
			{
				Produit unProduit = new Produit(
						desRes.getString("ref"), desRes.getString("des"),
						desRes.getFloat("prix"), desRes.getInt("qte")
						);
				lesProduits.add(unProduit);
			}
			desRes.close();
			unStat.close();
			uneBdd.seDeconnecter();
		}
		catch(SQLException exp)
		{
			System.out.println("Erreur requete : "+requete);
		}
			return lesProduits;
	}

		public static void insertProduit(Produit unProduit)
		{
			String requete = "insert into produit values('" 
					+ unProduit.getRef() + "','"
					+ unProduit.getDes() + "','"
					+ unProduit.getPrix() + "','"
					+ unProduit.getQte() + "');";
			executer(requete);
		}
		public static void executer(String requete)
		{
			try
			{
				uneBdd.seConnecter();
				Statement unStat = uneBdd.getMaconnexion().createStatement();
				unStat.execute(requete);
				unStat.close();
				uneBdd.seDeconnecter();
			}
			catch(SQLException exp)
			{
				System.out.println("Erreur requete : "+requete);
			}
		}
		public static void deleteProduit (String ref)
		{
			String requete ="delete from produit where ref = '" + ref + "';";
			executer(requete);
		}

		public static ArrayList<Produit> findAllProduits(String mot) 
		{
			ArrayList<Produit> lesProduits = new ArrayList<Produit>();
			String requete = "select * from produit where ref = '" + mot + "'or des = '" + mot+"';";
			try
			{
				uneBdd.seConnecter();
				Statement unStat = uneBdd.getMaconnexion().createStatement();
				ResultSet desRes = unStat.executeQuery(requete);
				//parcours des résultats
				while (desRes.next())
				{
					Produit unProduit = new Produit(
							desRes.getString("ref"), desRes.getString("des"),
							desRes.getFloat("prix"), desRes.getInt("qte")
							);
					lesProduits.add(unProduit);
				}
				desRes.close();
				unStat.close();
				uneBdd.seDeconnecter();
			}
			catch(SQLException exp)
			{
				System.out.println("Erreur requete : "+requete);
			}
				return lesProduits;
		}
		
	
}
