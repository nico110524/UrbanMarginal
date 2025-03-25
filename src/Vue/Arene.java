package Vue;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

public class Arene extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtSaisie;

	/**
	 * Create the frame.
	 */
	public Arene() {
		setTitle("Arene");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 821, 858);
		this.getContentPane().setPreferredSize(new Dimension(797, 790));
		this.pack();
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Projets éclipse\\UrbanMarginal\\média\\fonds\\fondarene.jpg"));
		lblNewLabel.setBounds(10, 10, 797, 612);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 618, 787, 178);
		contentPane.add(scrollPane);
		
		JTextArea txtAffichage = new JTextArea();
		txtAffichage.setRows(8);
		scrollPane.setViewportView(txtAffichage);
		
		txtSaisie = new JTextField();
		scrollPane.setColumnHeaderView(txtSaisie);
		txtSaisie.setColumns(10);
	}
}
