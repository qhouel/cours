package vue;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controleur.Magasin;
import controleur.Tableau;

public class PanelLister extends PanelCentral implements MouseListener
{
	private JTable uneTable = null;
	private String entetes[] = {"Référence", "Désignation", "Prix", "Quantité"};
	
	private static Tableau unTableau =null;
	
	public PanelLister()
	{
		super(Color.black);
		unTableau = new Tableau (entetes, Magasin.getDonnees(Magasin.selectAllProduits()));
		
		this.uneTable = new JTable(unTableau);
		JScrollPane uneScroll= new JScrollPane(this.uneTable);
		uneScroll.setBounds(50, 100, 400, 180);
		this.add(uneScroll);
		
		this.uneTable.addMouseListener(this);
	}

	public static Tableau getUnTableau() {
		return unTableau;
	}

	public static void setUnTableau(Tableau unTableau) {
		PanelLister.unTableau = unTableau;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() >=2)
		{
			int ligne = uneTable.getSelectedRow();
			String ref = uneTable.getValueAt(ligne, 0).toString();
			int retour = JOptionPane.showConfirmDialog(this, "Voulez-vous supprimer ?", "Suppression", JOptionPane.YES_NO_OPTION);
			if (retour ==0)
			{
				Magasin.deleteProduit(ref);
				JOptionPane.showMessageDialog(this, "Suppression réussie");
				unTableau.supprimerLigne(ligne);
			}
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
