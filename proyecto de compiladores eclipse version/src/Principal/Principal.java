package Principal;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JScrollPane;
import javax.swing.JMenuBar;
import java.awt.Button;
import java.awt.Component;
import java.awt.Container;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.JTextArea;

 

public class Principal extends JPanel {
	
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal window = new Principal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Principal() {
		
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpanel = new JPanel();
		frame.getContentPane().add(jpanel, BorderLayout.CENTER);
		jpanel.setLayout(null);
		
		JPanel content = new JPanel();
		content.setBackground(Color.WHITE);
		content.setBounds(10, 96, 583, 356);
		jpanel.add(content);
		content.setLayout(null);
		
		JTextArea Area_de_trabajo = new JTextArea();
		Area_de_trabajo.setBounds(0, 0, 583, 356);
		content.add(Area_de_trabajo);
		
		JButton btnNewButton = new JButton("Lexico");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lexico le= new lexico();
				le.setSize(1178, 601);
				le.setLocation(0, 0);
			
				content.removeAll();
				content.add(le,BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
;			}
		});
		btnNewButton.setBounds(108, 65, 73, 21);
		jpanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("sintactico");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Sintactico si= new Sintactico();
				si.setSize(1178, 601);
				si.setLocation(0, 0);
			
				content.removeAll();
				content.add(si,BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
			}
		});
		btnNewButton_1.setBounds(176, 65, 92, 21);
		jpanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Area de trabajo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Area_de_trabajo.setSize(583, 356);
				Area_de_trabajo.setLocation(0, 0);
			
				content.removeAll();
				content.add(Area_de_trabajo,BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
			}
		});
		btnNewButton_2.setBounds(10, 65, 104, 21);
		jpanel.add(btnNewButton_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 593, 22);
		jpanel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Guardar");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
					
					FileWriter archivo = new FileWriter("Guardado.txt",true);
		        
		        try(BufferedWriter bw = new BufferedWriter(archivo)){
		       
		        	JOptionPane.showMessageDialog(null,"Se ha guardado con exito");
		            
		        
				
						
						bw.write(Area_de_trabajo.getText() );
						bw.newLine();
					
						Area_de_trabajo.setText("");
		          
		           
		        
		        }
		        archivo.close();
				}
		        catch(Exception ex) {}
			
			}
			
				
				
			
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					FileReader archivo = new FileReader("Guardado.txt");
					BufferedReader br = new BufferedReader(archivo);
					
					Area_de_trabajo.setText(br.readLine());
					
					
				
					archivo.close();
				}catch(Exception e1) {}
				
				try {
					File archivo= new File ("Guardado.txt");
				archivo.delete();
				}
				
				catch(Exception e1) {}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		
		
	}
}
