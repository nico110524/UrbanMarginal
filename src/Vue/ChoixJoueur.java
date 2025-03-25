package Vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Label;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JInternalFrame;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChoixJoueur extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Arene frmArene;

	/**
	 * clic sur le bouton de défilement gauche
	 * @return 
	 */
	   public void btnChoixGauche_clic(ActionEvent e) {
		   System.out.println("précedent");
	   }
	/**
	* clic sur le bouton de défilement droit 
	*/
	   public void btnChoixDroite_clic(ActionEvent e) {
		   System.out.println("Suivant");
	   }
	 /**
	  * clic sur le bouton go 
	  */
	   public void btnGo_clic(ActionEvent e) {
		   this.frmArene = new Arene();
		   this.frmArene.setVisible(true);
		   this.dispose();
	   }
	
	/**
	 * Create the frame.
	 */
	public ChoixJoueur() {
		setTitle("choix Personnage");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setPreferredSize(new Dimension(433, 300));
		this.pack();
		this.setResizable(false);
		setBounds(100, 100, 448, 348);
		contentPane = new JPanel();
		contentPane.setOpaque(false);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnGo = new JButton("");
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGo_clic(e);
			}
		});
		btnGo.setContentAreaFilled(false);
		btnGo.setBorderPainted(false);
		btnGo.setBounds(321, 213, 67, 63);
		contentPane.add(btnGo);
		
		JButton btnChoixGauche = new JButton("");
		btnChoixGauche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnChoixGauche_clic(e);
			}
		});
		btnChoixGauche.setContentAreaFilled(false);
		btnChoixGauche.setBackground(UIManager.getColor("Button.background"));
		btnChoixGauche.setBounds(81, 160, 33, 43);
		contentPane.add(btnChoixGauche);
		
		JButton btnChoixDroite = new JButton("");
		btnChoixDroite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnChoixDroite_clic(e);
			}
		});
		btnChoixDroite.setContentAreaFilled(false);
		btnChoixDroite.setBorderPainted(false);
		btnChoixDroite.setForeground(new Color(0, 0, 0));
		btnChoixDroite.setBackground(Color.WHITE);
		btnChoixDroite.setBounds(311, 160, 33, 43);
		contentPane.add(btnChoixDroite);
		
		JButton lblNewLabel = new JButton("");
		lblNewLabel.setBounds(0, 10, 433, 301);
		contentPane.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Projets éclipse\\UrbanMarginal\\média\\fonds\\fondchoix.jpg"));
	}
}
