package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controleur.Magasin;
import controleur.Produit;
import modele.Modele;

public class PanelSupprimer extends PanelCentral implements ActionListener
{
	private JComboBox cbxRef = new JComboBox();
	private JButton btOk = new JButton("Supprimer");
	private JLabel lbSupprimer = new JLabel("référence :");
	private JPanel unPanel = new JPanel();
	public PanelSupprimer()
	{
		super(Color.red);
		this.unPanel.setBounds(80, 20, 300, 100);
		this.unPanel.setLayout(new GridLayout(2,2));
		this.unPanel.add(new JLabel(" Suppression par"));
		this.unPanel.add(this.lbSupprimer);
		this.unPanel.add(cbxRef);
		this.unPanel.add(btOk);
		this.add(unPanel);
		this.remplirCBX();
		this.btOk.addActionListener(this);
	}
	public void remplirCBX()
	{
		this.cbxRef.removeAllItems();
		for (Produit unProduit : Magasin.selectAllProduits())
		{
			this.cbxRef.addItem(unProduit.getRef() + " | " + unProduit.getDes());
		}
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == this.btOk)
		{
			 String[] chaine = this.cbxRef.getSelectedItem().toString().split(" | ");
			int retour = JOptionPane.showConfirmDialog(this, "Voulez-vous supprimer ?", "Suppression", JOptionPane.YES_NO_OPTION);
					if (retour ==0)
					{
						Magasin.deleteProduit(chaine[0]);
						JOptionPane.showMessageDialog(this, "Suppression réussie");
						int ligne = this.cbxRef.getSelectedIndex();
						Generale.getUnPanelLister().getUnTableau().supprimerLigne(ligne);
						this.cbxRef.removeItem(this.cbxRef.getSelectedItem());
					}			
		}
	}
	
}
