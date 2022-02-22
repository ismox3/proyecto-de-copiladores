package Principal;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class Sintactico extends JPanel {
	private JTextField txtSintactico;

	/**
	 * Create the panel.
	 */
	public Sintactico() {
		setLayout(null);
		
		txtSintactico = new JTextField();
		txtSintactico.setFont(new Font("Tahoma", Font.PLAIN, 65));
		txtSintactico.setText("sintactico");
		txtSintactico.setBounds(0, 0, 583, 356);
		add(txtSintactico);
		txtSintactico.setColumns(10);

	}

}
