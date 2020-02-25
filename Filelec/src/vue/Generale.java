package vue;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controleur.Magasin;

public class Generale extends JFrame implements ActionListener
{

	private JPanel panelMenu = new JPanel();
	private JButton btAjouter = new JButton("Ajouter");
	private JButton btLister = new JButton("Lister");
	private JButton btSupprimer = new JButton("Supprimer");
	private JButton btRechercher = new JButton("Rechercher");
	private JButton btQuitter = new JButton("Retour");
	
	/****************Liste des panels *************/
	private static PanelAjouter unPanelAjouter = new PanelAjouter();
	private static PanelLister unPanelLister = new PanelLister();
	private static PanelSupprimer unPanelSupprimer = new PanelSupprimer();
	private static PanelRechercher unPanelRechercher = new PanelRechercher();
	/*********************************************/
	
	public Generale()
	{
		this.setTitle("Application Gestion de Strock");
		this.setResizable(false);
		this.getContentPane().setBackground(Color.gray);
		this.setBounds(250, 250, 800, 400);
		this.setLayout(null);
		
		//construction du panelMenu
		this.panelMenu.setLayout(new GridLayout(5,1));
		this.panelMenu.setBounds(20, 20, 120, 320);
		this.panelMenu.add(this.btAjouter);
		this.panelMenu.add(this.btLister);
		this.panelMenu.add(this.btSupprimer);
		this.panelMenu.add(this.btRechercher);
		this.panelMenu.add(this.btQuitter);
		
		this.add(this.panelMenu);
		
		
		//rendre les boutons cliquables
		this.btAjouter.addActionListener(this);
		this.btLister.addActionListener(this);
		this.btSupprimer.addActionListener(this);
		this.btRechercher.addActionListener(this);
		this.btQuitter.addActionListener(this);
		
		//ajouter les panels dans la fenetre
		this.add(unPanelAjouter);
		this.add(unPanelLister);
		this.add(unPanelRechercher);
		this.add(unPanelSupprimer);
		
		
		this.setVisible(true);
		
	}
	public static void effacerEcran()
	{
		unPanelAjouter.setVisible(false);
		unPanelLister.setVisible(false);
		unPanelRechercher.setVisible(false);
		unPanelSupprimer.setVisible(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.btQuitter)
		{
			int retour = JOptionPane.showConfirmDialog(this, "Voulez-vous quitter l'application ?", "Quitter Application", JOptionPane.YES_NO_OPTION);
			if (retour == 0)
			{
				Magasin.fin();
			}
		}else if (e.getSource() == this.btAjouter)
		{
			effacerEcran();
			unPanelAjouter.setVisible(true);
		}else if (e.getSource() == this.btLister)
		{
			effacerEcran();
			unPanelLister.setVisible(true);
		}else if (e.getSource() == this.btRechercher)
		{
			effacerEcran();
			unPanelRechercher.setVisible(true);
		}else if (e.getSource() == this.btSupprimer)
		{
			effacerEcran();
			unPanelSupprimer.remplirCBX();
			unPanelSupprimer.setVisible(true);
		}
	}
	public static PanelAjouter getUnPanelAjouter() {
		return unPanelAjouter;
	}
	public static void setUnPanelAjouter(PanelAjouter unPanelAjouter) {
		Generale.unPanelAjouter = unPanelAjouter;
	}
	public static PanelLister getUnPanelLister() {
		return unPanelLister;
	}
	public static void setUnPanelLister(PanelLister unPanelLister) {
		Generale.unPanelLister = unPanelLister;
	}
	public static PanelSupprimer getUnPanelSupprimer() {
		return unPanelSupprimer;
	}
	public static void setUnPanelSupprimer(PanelSupprimer unPanelSupprimer) {
		Generale.unPanelSupprimer = unPanelSupprimer;
	}
	public static PanelRechercher getUnPanelRechercher() {
		return unPanelRechercher;
	}
	public static void setUnPanelRechercher(PanelRechercher unPanelRechercher) {
		Generale.unPanelRechercher = unPanelRechercher;
	}
	
}
