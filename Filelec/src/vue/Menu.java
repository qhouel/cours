package vue;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controleur.Magasin;
import controleur.User;

public class Menu extends JFrame implements ActionListener
{
	private static JButton btProduits = new JButton("Les Produits");
	private static JButton btUsers = new JButton("Les Users");
	private static JButton btCommandes = new JButton("Les Commandes");
	private static JButton btFournisseurs = new JButton("Les Fournisseurs");
	private static JButton btQuitter = new JButton("Quitter");
	
	private JTextArea txtArea = new JTextArea();
	
	public Menu (User unUser)
	{
		this.setTitle("Gestion des stocks");
		this.setBounds(150, 150, 800, 400);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		
		this.btProduits.setBounds(50, 50, 200, 80);
		this.add(btProduits);
		
		this.btUsers.setBounds(300, 50, 200, 80);
		this.add(btUsers);

		this.btCommandes.setBounds(50, 180, 200, 80);
		this.add(btCommandes);
		
		this.btFournisseurs.setBounds(300, 180, 200, 80);
		this.add(btFournisseurs);
		
		this.btQuitter.setBounds(50, 280, 450, 40);
		this.add(btQuitter);
		
		
		this.txtArea.setBounds(540, 200, 200, 80);
		this.add(this.txtArea);
		this.txtArea.setText("Informations User Connect\n" 
		+ "Nom de l'user : "+ unUser.getNom() + "\n" 
		+ "Prenom de l'user : " + unUser.getPrenom() + "\n"
		);
		
		this.btCommandes.addActionListener(this);
		this.btFournisseurs.addActionListener(this);
		this.btProduits.addActionListener(this);
		this.btUsers.addActionListener(this);
		this.btQuitter.addActionListener(this);
		
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btProduits)
		{
			Magasin.instancerGenerale();
			this.setVisible(false);
		}
		else if (e.getSource() == this.btQuitter)
		{
			this.dispose();
			Magasin.getUneConnexion().setVisible(true);
		}
		
	}
	
}
