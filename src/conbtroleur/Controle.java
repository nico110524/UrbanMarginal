package conbtroleur;
import Vue.EntreeJeu;

public class Controle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Méthode de démarrage 
		 * @param args non utilisé 
		 */
		new Controle();
	}
	private EntreeJeu frmEntreeJeu;
	
	/**
	 * Constructeur 
	 */
	private Controle() {
		this.frmEntreeJeu = new EntreeJeu();
		this.frmEntreeJeu.setVisible(true);
	}}

	
