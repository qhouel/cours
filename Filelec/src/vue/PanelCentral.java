package vue;

import java.awt.Color;

import javax.swing.JPanel;

public abstract class PanelCentral extends JPanel
{
	public PanelCentral(Color uneCouleur)
	{
		//caract�ristiques communes pour les panneaux
		
		this.setBackground(uneCouleur);
		this.setBounds(220, 20, 500, 320);
		this.setLayout(null);
		
		this.setVisible(false);
	}
	
}
