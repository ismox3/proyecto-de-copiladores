package Principal;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTree;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class lexico extends JPanel {
	private JTextField en_blanco;
	private JTextField caracteres;
	private JTextField saltos;
	private JTextField tabuladores;
	JTextArea sincomentarios = new JTextArea();
	JTextArea sinespacios = new JTextArea();
	JTextArea comentarios = new JTextArea();
	
	int espacios_en_blanco;
	int tab;
	/**
	 * Create the panel.
	 */
	public lexico() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(-11, 0, 731, 561);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 5, 243, 200);
		panel_1.setBorder(new TitledBorder(null, "Comentarios", TitledBorder.LEADING, TitledBorder.TOP, new java.awt.Font(null, 1, 14),null));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		
		comentarios.setEditable(false);
		comentarios.setBounds(7, 18, 228, 175);
		panel_1.add(comentarios);
		comentarios.setToolTipText("");
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setForeground(SystemColor.textText);
		panel_2.setBounds(287, 10, 423, 200);
		panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Fuente Sin Comentarios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		
		sincomentarios.setEditable(false);
		sincomentarios.setBackground(SystemColor.menu);
		sincomentarios.setBounds(10, 21, 403, 170);
		panel_2.add(sincomentarios);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setForeground(Color.BLACK);
		panel_2_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Fuente Sin Espacios", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2_1.setBackground(Color.WHITE);
		panel_2_1.setBounds(287, 236, 423, 134);
		panel.add(panel_2_1);
		
		
		sinespacios.setEditable(false);
		sinespacios.setBackground(SystemColor.menu);
		sinespacios.setBounds(10, 21, 403, 103);
		panel_2_1.add(sinespacios);
		
		JLabel lblNewLabel = new JLabel("Espacios en blanco");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(20, 236, 106, 16);
		panel.add(lblNewLabel);
		
		JLabel lblCaracteres = new JLabel("Caracteres");
		lblCaracteres.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCaracteres.setBounds(20, 272, 58, 16);
		panel.add(lblCaracteres);
		
		JLabel lblRetornosYSaltos = new JLabel("Retornos y Saltos");
		lblRetornosYSaltos.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRetornosYSaltos.setBounds(20, 305, 98, 16);
		panel.add(lblRetornosYSaltos);
		
		JLabel lblTabuladores = new JLabel("Tabuladores");
		lblTabuladores.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTabuladores.setBounds(20, 338, 106, 16);
		panel.add(lblTabuladores);
		
		en_blanco= new JTextField();
		en_blanco.setEditable(false);
		en_blanco.setBackground(SystemColor.menu);
		en_blanco.setBounds(133, 236, 50, 19);
		panel.add(en_blanco);
		en_blanco.setColumns(10);
		
		caracteres = new JTextField();
		caracteres.setEditable(false);
		caracteres.setColumns(10);
		caracteres.setBackground(SystemColor.menu);
		caracteres.setBounds(133, 272, 50, 19);
		panel.add(caracteres);
		
		saltos = new JTextField();
		saltos.setEditable(false);
		saltos.setColumns(10);
		saltos.setBackground(SystemColor.menu);
		saltos.setBounds(133, 305, 50, 19);
		panel.add(saltos);
		
		tabuladores = new JTextField();
		tabuladores.setEditable(false);
		tabuladores.setColumns(10);
		tabuladores.setBackground(SystemColor.menu);
		tabuladores.setBounds(133, 338, 50, 19);
		panel.add(tabuladores);
		
		JLabel lblLetras = new JLabel("Letras");
		lblLetras.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblLetras.setBounds(30, 421, 34, 16);
		panel.add(lblLetras);
		
		JLabel lblNumeros = new JLabel("Numeros");
		lblNumeros.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNumeros.setBounds(30, 457, 51, 16);
		panel.add(lblNumeros);
		
		JLabel lblErrores = new JLabel("Errores");
		lblErrores.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblErrores.setBounds(30, 493, 41, 16);
		panel.add(lblErrores);
		
		JLabel lblOperadores = new JLabel("Operadores");
		lblOperadores.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblOperadores.setBounds(349, 424, 66, 16);
		panel.add(lblOperadores);
		
		JLabel lblSeparadores = new JLabel("Separadores");
		lblSeparadores.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSeparadores.setBounds(349, 460, 70, 16);
		panel.add(lblSeparadores);
		
		JLabel lblEspeciales = new JLabel("Especiales");
		lblEspeciales.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblEspeciales.setBounds(349, 496, 57, 16);
		panel.add(lblEspeciales);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(104, 420, 195, 21);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(104, 456, 195, 21);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(104, 492, 195, 21);
		panel.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(425, 420, 195, 21);
		panel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(425, 456, 195, 21);
		panel.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(425, 492, 195, 21);
		panel.add(comboBox_5);

		
	}
	public void sinespacios(String frase) {
		String frase_sin_espacios;
		
		frase_sin_espacios= frase.replaceAll(" ","");
		frase_sin_espacios= frase.replaceAll("\t","");
		sinespacios.setText(frase_sin_espacios);
		
		
	}
	
	public void contadores(String frase,int lineas) {
		espacios_en_blanco=0;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				espacios_en_blanco++;
			}
		en_blanco.setText(String.valueOf(espacios_en_blanco));
		
		}
		int carac=frase.length()-espacios_en_blanco;
		caracteres.setText(String.valueOf(carac));
		
		saltos.setText(String.valueOf(lineas));
		
		tab=0;
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)=='\t') {
				tab++;
			}
		tabuladores.setText(String.valueOf(tab));
		
		}
		
		
	}
	public void sincomentarios (String[] frase,int x) {
		String sinco="";
		
		for(int i=0; i<x;i++) {
		if (frase[i].contains("//")) {
			 sinco+=frase[i].substring(0,frase[i].indexOf("//"));
			 sinco+="\n";
		} 
		else {
			sinco+=frase[i];
			 sinco+="\n";
		}
		}
		sincomentarios.setText(sinco);
		}
		
	public void comentarios (String[] frase,int x) {
		String comentario="";
		
		for(int i=0; i<x;i++) {
			if (frase[i].contains("//")) {
				
				 comentario+=frase[i].substring(frase[i].indexOf("//"));
				 comentario+="\n";
			} 
			
			}
			comentarios.setText(comentario);
	}
			
		
	}
			
			
			
			
			
		
	
	
	

