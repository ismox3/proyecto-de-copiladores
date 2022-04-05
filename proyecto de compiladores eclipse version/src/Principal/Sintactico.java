package Principal;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JButton;

public class Sintactico extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Sintactico() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 720, 571);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setForeground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Palabras", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(23, 13, 404, 402);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Palabras:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(31, 40, 55, 16);
		panel_2.add(lblNewLabel);
		
		JLabel lblPalabrasSimples = new JLabel("Palabras Simples:");
		lblPalabrasSimples.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPalabrasSimples.setBounds(31, 123, 108, 16);
		panel_2.add(lblPalabrasSimples);
		
		JLabel lblPalabrasCompuestas = new JLabel("Palabras Compuestas:");
		lblPalabrasCompuestas.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPalabrasCompuestas.setBounds(31, 209, 128, 16);
		panel_2.add(lblPalabrasCompuestas);
		
		JLabel lblErroresSi = new JLabel("Errores Sint\u00E1ctico:");
		lblErroresSi.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblErroresSi.setBounds(31, 298, 108, 16);
		panel_2.add(lblErroresSi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(169, 39, 225, 21);
		panel_2.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(169, 208, 225, 21);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(169, 122, 225, 21);
		panel_2.add(comboBox_1_1);
		
		JComboBox comboBox_1_2 = new JComboBox();
		comboBox_1_2.setBounds(169, 297, 225, 21);
		panel_2.add(comboBox_1_2);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(Color.WHITE);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Expresi\u00F3n", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(23, 425, 404, 96);
		panel.add(panel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("Expresi\u00F3n Matematica");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(135, 25, 139, 16);
		panel_2_1.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.menu);
		textField.setBounds(51, 51, 305, 19);
		panel_2_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setForeground(Color.WHITE);
		panel_2_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_2.setBackground(Color.WHITE);
		panel_2_2.setBounds(459, 18, 233, 503);
		panel.add(panel_2_2);
		
		JButton btnNewButton = new JButton("Generar arbol");
		btnNewButton.setBounds(136, 531, 194, 21);
		panel.add(btnNewButton);

	}
}
