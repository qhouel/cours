package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.Magasin;
import controleur.User;

public class Connexion extends JFrame implements ActionListener, KeyListener
{

	private JTextField txtLogin = new JTextField();
	private JPasswordField txtmdp = new JPasswordField();
	private JButton btAnnuler = new JButton("Annuler");
	private JButton btSeConnecter = new JButton("Se Connecter");
	private JPanel unPanel = new JPanel();
	
	
	public Connexion()
	{
		this.setTitle("Gestion des stocks");
		this.setBounds(150, 150, 800, 300);
		this.setResizable(false);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.DARK_GRAY);
		
		//construction du panel connexion
		this.unPanel.setBounds(340, 50, 400, 200);
		this.unPanel.setLayout(new GridLayout(3, 2));
		this.unPanel.add(new JLabel("Login : "));
		this.unPanel.add(this.txtLogin);
		
		this.unPanel.add(new JLabel("MDP : "));
		this.unPanel.add(this.txtmdp);
		
		this.unPanel.add(this.btAnnuler);
		this.unPanel.add(this.btSeConnecter);
		
		this.add(unPanel);
		ImageIcon uneImage = new ImageIcon("src/images/logo.jpg");
		JLabel monLogo = new JLabel(uneImage);
		monLogo.setBounds(20, 50, 280, 200);
		this.add(monLogo);
		
		this.btAnnuler.addActionListener(this);
		this.btSeConnecter.addActionListener(this);
		
		this.txtLogin.addKeyListener(this);
		this.txtmdp.addKeyListener(this);
		
		this.setVisible(true);
	}

	public void traitement()
	{
		String nom = this.txtLogin.getText();
		String mdp = new String (this.txtmdp.getPassword());
		
		User unUser = Magasin.selectWhereUser(nom, mdp);
		if (unUser == null)
		{
			JOptionPane.showMessageDialog(this, "Veuillez vérifier vos identifiants");
		}
		else {
			JOptionPane.showMessageDialog(this, "Bienvenue M./Mme" + unUser.getNom()+ " " + unUser.getPrenom());
			this.txtLogin.setText("");
			this.txtmdp.setText("");
			
			//lancement de l'application gestion 
			//Magasin.instancerGenerale();
			Magasin.instancierMenu(unUser);
			this.setVisible(false);
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource() == this.btAnnuler)
		{
			this.txtLogin.setText("");
			this.txtmdp.setText("");
		}
	else if (e.getSource() == this.btSeConnecter)
		{
			traitement();
		}	
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_ENTER)
		{
			traitement();
		}
		
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
