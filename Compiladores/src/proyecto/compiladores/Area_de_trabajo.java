package proyecto.compiladores;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;

import javax.swing.DropMode;
import javax.swing.JOptionPane;

public class Area_de_trabajo  extends JPanel {
	Principal pr;
	texto tx;
	private JTextField txt;
	
	public Area_de_trabajo(JTextField txt) {
		
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 735, 429);
		add(panel);
		panel.setLayout(null);
		
		txt = new JTextField();
		txt.setBounds(0, 0, 735, 429);
		panel.add(txt);
		txt.setColumns(10);
		
		
		
	}
	
public void gettext(JTextField txt){
	String texto=txt.getText();
	tx=new texto(texto);
	
}
}



	



