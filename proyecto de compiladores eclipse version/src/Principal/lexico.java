package Principal;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class lexico extends JPanel {

	/**
	 * Create the panel.
	 */
	public lexico() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 583, 356);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblPage = new JLabel("lexico");
		lblPage.setBounds(104, 71, 432, 192);
		panel.add(lblPage);
		lblPage.setFont(new Font("Tahoma", Font.PLAIN, 81));

	}

}
