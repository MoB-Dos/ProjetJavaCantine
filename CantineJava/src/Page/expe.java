package Page;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import BDD.BDD;

public class expe extends JFrame {
	
	//CTRL + SHIFT + O pour générer les imports
	BDD MaBDD = new BDD();
	Object[][] data ;
	JPanel bilanPanel = new JPanel();
	
	  public expe(String choixClasse, int check){
		  
	    this.setLocationRelativeTo(null);
	    this.setTitle("JTable");
	    this.setSize(700, 220);
	    
	    
	    data = MaBDD.select(choixClasse,check);
	  

	    //Les titres des colonnes
	    String  title[] = {"Nom", "Prenom","Age","Classe","Regime","Externe","Autre"};
	    JTable tableau = new JTable(data, title);
	    //Nous ajoutons notre tableau à notre contentPane dans un scroll
	    //Sinon les titres des colonnes ne s'afficheront pas !
	    bilanPanel.add(tableau);
	    this.getContentPane().add(new JScrollPane(tableau));
	    
	  }   
	  

}