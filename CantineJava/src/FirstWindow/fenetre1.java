package FirstWindow;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

import BDD.BDD;
import Page.Info;


public class fenetre1 {
	
	String login;
	String mdp;
	
	BDD MaBDD = new BDD();
	
	

	protected Shell shell;
	private Text text;
	private Text text_1;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			fenetre1 window = new fenetre1();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(480, 337);
		shell.setText("SWT Application");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(166, 87, 173, 31);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(166, 141, 173, 31);
		
		
		Label lblInscription = new Label(shell, SWT.NONE);
		lblInscription.setBounds(76, 90, 50, 25);
		lblInscription.setText("Login");
		
		Label lblMdp = new Label(shell, SWT.NONE);
		lblMdp.setBounds(76, 144, 50, 25);
		lblMdp.setText("Mdp");
		
		Label lblConnexion = new Label(shell, SWT.NONE);
		lblConnexion.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblConnexion.setBounds(150, 29, 152, 52);
		lblConnexion.setText("Connexion");
		
		
		Button connexion = new Button(shell, SWT.NONE);
		connexion.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		connexion.setBounds(177, 212, 105, 35);
		connexion.setText("connexion");
		
		connexion.addListener(SWT.Selection, new Listener()
		{
	
			@Override
			public void handleEvent(Event arg0) {
				
				login = text.getText();
				mdp = text_1.getText();
				
				ResultSet tab;
				
				System.out.println(login);
				System.out.println(mdp);
				
				tab = MaBDD.connexion(login, mdp);
				
				try {
					while(tab.next()) {
						try {
							if (tab.getString("login").equals(login) && tab.getString("Mdp").equals(mdp))
							{
								shell.dispose();
								try {
									Info window = new Info();
									window.open();
								} catch (Exception e) {
									e.printStackTrace();
								}
								System.out.println("yes");
							}else {
								System.out.println("no");
							}
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
		
		});

	}
	

}
