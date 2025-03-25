package Vue;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EntreeJeu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIp;
	private Arene frmArene;
	private ChoixJoueur frmChoixJoueur;

	/**
	 * clic sur bouton Start
	 */
	public void btnStart_clic(ActionEvent e) {
		this.frmArene = new Arene();
		this.frmArene.setVisible(true);
		this.dispose();
		
	}
	/**
	 * clis sur le bouton Connect
	 */
	public void btnConnect_clic(ActionEvent e) {
		this.frmChoixJoueur = new ChoixJoueur();
		this.frmChoixJoueur.setVisible(true);
		this.dispose();
	}
	/**
	 * clic sur le bouton exit
	 */
	public void btnExit_clic(ActionEvent e) {
		System.exit(0);
		
	}
	
	/**
	 * Create the frame.
	 */
	public EntreeJeu() {
		setTitle("UrbanMarginal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 209);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnStart = new JButton("start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnStart_clic(e);
			}
		});
		btnStart.setBounds(229, 24, 102, 28);
		contentPane.add(btnStart);
		
		JButton btnConnect = new JButton("Connect");
		btnConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnConnect_clic(e);
			}
		});
		btnConnect.setBounds(229, 95, 102, 28);
		contentPane.add(btnConnect);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnExit_clic(e);
			}
		});						
		btnExit.setBounds(229, 133, 102, 28);
		contentPane.add(btnExit);
		
		JLabel lblServeur = new JLabel("Start a server :");
		lblServeur.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblServeur.setBounds(24, 28, 135, 20);
		contentPane.add(lblServeur);
		
		JLabel lblConnect = new JLabel("Connect an existing server :");
		lblConnect.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConnect.setBounds(24, 66, 202, 28);
		contentPane.add(lblConnect);
		
		JLabel lblNumServer = new JLabel("IP server :");
		lblNumServer.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumServer.setBounds(24, 104, 76, 13);
		contentPane.add(lblNumServer);
		
		txtIp = new JTextField();
		txtIp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtIp.setText("127.0.0.1");
		txtIp.setBounds(96, 100, 123, 19);
		contentPane.add(txtIp);
		txtIp.setColumns(10);
	}
}
