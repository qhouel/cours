package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controleur.Magasin;
import controleur.Produit;
import modele.Modele;

public class PanelAjouter extends PanelCentral implements ActionListener
{
	private JTextField txtRef = new JTextField();
	private JTextField txtDes = new JTextField();
	private JTextField txtPrix = new JTextField();
	private JTextField txtQte = new JTextField();
	
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btEnregistrer = new JButton("Enregistrer");
	
	
	public PanelAjouter()
	{
		super(Color.cyan);
		this.setLayout(new GridLayout(5,2));
		
		this.add(new JLabel("Référence : "));
		this.add(this.txtRef);
		this.add(new JLabel("Désignation : "));
		this.add(this.txtDes);
		this.add(new JLabel("Prix : "));
		this.add(this.txtPrix);
		this.add(new JLabel("Quantité : "));
		this.add(this.txtQte);

		this.add(this.btAnnuler);
		this.add(this.btEnregistrer);
		
		//rendre les boutons cliquables
		this.btAnnuler.addActionListener(this);
		this.btEnregistrer.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btAnnuler)
		{
			this.txtRef.setText("");
			this.txtDes.setText("");
			this.txtPrix.setText("");
			this.txtQte.setText("");
		}else  if (e.getSource() == this.btEnregistrer)
			{
				String ref = this.txtRef.getText();
				String des = this.txtDes.getText();
				float prix = 0;
				int qte = 0;
				try 
				{
					prix = Float.parseFloat(this.txtPrix.getText());
					qte = Integer.parseUnsignedInt(this.txtQte.getText());
				}
				catch (NumberFormatException exp)
				{
					JOptionPane.showMessageDialog(this, "Erreur de saisie, saisir des nombres.");
					this.txtPrix.setText("");
					this.txtQte.setText("");
				} if (prix>0 && qte>0 && ! ref.equals("") && ! des.equals(""))
				{
				Produit unProduit = new Produit(ref, des, prix, qte);
				Magasin.insertProduit(unProduit);
				Object ligne[] = {ref, des, prix+"", qte+""};
				Generale.getUnPanelLister().getUnTableau().ajouterLigne(ligne);
				
				JOptionPane.showMessageDialog(this, "Insertion réussie");
				this.txtRef.setText("");
				this.txtDes.setText("");
				this.txtPrix.setText("");
				this.txtQte.setText("");
				this.setVisible(false);
				}
			}
		
		}
		
}
	
