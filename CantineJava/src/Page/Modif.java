package Page;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;

public class Modif {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Modif window = new Modif();
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
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Canvas canvas_3 = new Canvas(shell, SWT.NONE);
		canvas_3.setLocation(0, 0);
		canvas_3.setSize(434, 261);
		
		Label lblModifierUser = new Label(canvas_3, SWT.NONE);
		lblModifierUser.setText("Modifier User");
		lblModifierUser.setFont(SWTResourceManager.getFont("Segoe UI", 10, SWT.BOLD | SWT.ITALIC));
		lblModifierUser.setBounds(173, 10, 87, 15);
		
		Label lblNom = new Label(canvas_3, SWT.NONE);
		lblNom.setText("Nom : ");
		lblNom.setBounds(26, 60, 36, 15);
		
		Label lblPrenom = new Label(canvas_3, SWT.NONE);
		lblPrenom.setText("Prenom : ");
		lblPrenom.setBounds(26, 96, 55, 15);
		
		Label lblAge = new Label(canvas_3, SWT.NONE);
		lblAge.setText("Age : ");
		lblAge.setBounds(26, 132, 36, 15);
		
		Label lblClasse_1 = new Label(canvas_3, SWT.NONE);
		lblClasse_1.setText("Classe : ");
		lblClasse_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TEXT_DISABLED_BACKGROUND));
		lblClasse_1.setBounds(185, 60, 42, 15);
		
		Label lblRegime_1 = new Label(canvas_3, SWT.NONE);
		lblRegime_1.setText("Regime : ");
		lblRegime_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TEXT_DISABLED_BACKGROUND));
		lblRegime_1.setBounds(186, 96, 47, 15);
		
		Label lblExterne_1 = new Label(canvas_3, SWT.NONE);
		lblExterne_1.setText("Externe : ");
		lblExterne_1.setForeground(SWTResourceManager.getColor(SWT.COLOR_INFO_FOREGROUND));
		lblExterne_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_TEXT_DISABLED_BACKGROUND));
		lblExterne_1.setBounds(186, 132, 47, 15);
		
		Label lblAutre_1 = new Label(canvas_3, SWT.NONE);
		lblAutre_1.setText("Autre : ");
		lblAutre_1.setBounds(191, 168, 42, 15);
		
		text = new Text(canvas_3, SWT.BORDER);
		text.setBounds(66, 57, 76, 21);
		
		text_1 = new Text(canvas_3, SWT.BORDER);
		text_1.setBounds(87, 90, 76, 21);
		
		text_2 = new Text(canvas_3, SWT.BORDER);
		text_2.setBounds(234, 165, 91, 21);
		
		Spinner spinner = new Spinner(canvas_3, SWT.BORDER);
		spinner.setMaximum(26);
		spinner.setMinimum(15);
		spinner.setBounds(66, 129, 47, 22);
		
		Button btnModifier = new Button(canvas_3, SWT.NONE);
		btnModifier.setText("Modifier");
		btnModifier.setBounds(129, 224, 87, 33);
		
		Combo combo_1 = new Combo(canvas_3, SWT.NONE);
		combo_1.setBounds(234, 57, 91, 23);
		
		Combo combo_2 = new Combo(canvas_3, SWT.NONE);
		combo_2.setBounds(234, 93, 91, 23);
		
		Combo combo_3 = new Combo(canvas_3, SWT.NONE);
		combo_3.setBounds(234, 129, 91, 23);

	}
}
