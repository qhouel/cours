package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controleur.Magasin;
import controleur.Tableau;

public class PanelRechercher extends PanelCentral implements ActionListener
{
	private JLabel lbTitre = new JLabel("Recherche par mots clés ");
	private JButton btOk = new JButton("Rechercher");
	private JTextField txtMot = new JTextField();
	private Tableau unTableau = null;
	private JTable uneTable = null;
	private String entetes[] = {"Référence", "Désignation", "Prix", "Quantité"};
	
	public PanelRechercher()
	{
		super(Color.lightGray);
		
		this.lbTitre.setBounds(100, 30, 200, 20);
		this.add(this.lbTitre);

		this.txtMot.setBounds(40, 60, 200, 20);
		this.add(this.txtMot);
		
		this.btOk.setBounds(250, 60, 200, 20);
		this.add(this.btOk);
		
		this.btOk.addActionListener(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == this.btOk)
		{
			String mot = this.txtMot.getText();
			unTableau = new Tableau (entetes, Magasin.getDonnees(Magasin.findAllProduits(mot)));
			this.uneTable = new JTable(unTableau);
			JScrollPane uneScroll= new JScrollPane(this.uneTable);
			uneScroll.setBounds(40, 100, 400, 180);
			this.add(uneScroll);
		}
	}
	
	
}
