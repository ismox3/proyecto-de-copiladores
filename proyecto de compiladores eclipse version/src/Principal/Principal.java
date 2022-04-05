package Principal;
import java.awt.EventQueue;
import java.awt.FileDialog;

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
import java.awt.geom.Area;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;

import javax.swing.JTextArea;
import javax.swing.Spring;

 

public class Principal extends JPanel {
	File file;
	lexico le= new lexico();
	String frase="";
	
	
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
					window.frame.setTitle("Proyecto Compiladores");
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
		frame.setBounds(100, 100, 754, 698);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jpanel = new JPanel();
		frame.getContentPane().add(jpanel, BorderLayout.CENTER);
		jpanel.setLayout(null);
		
		JPanel content = new JPanel();
		content.setBackground(Color.WHITE);
		content.setBounds(10, 96, 720, 561);
		jpanel.add(content);
		content.setLayout(null);
		
		JTextArea Area_de_trabajo = new JTextArea();
		Area_de_trabajo.setBounds(0, 0, 720, 561);
		content.add(Area_de_trabajo);
		
		JButton btnNewButton = new JButton("Lexico");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				le.setSize(720, 561);
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
				si.setSize(720, 561);
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
				
				Area_de_trabajo.setSize(720, 561);
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
		menuBar.setBounds(0, 0, 740, 22);
		jpanel.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Guardar como");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				file = null;
				FileDialog savedia;

			
			
			savedia = new FileDialog (frame, "Guardar", FileDialog.SAVE);
			    frame.setVisible(true);
			    
			
			
				if(file==null){
			        savedia.setVisible(true);
			        String dirPath=savedia.getDirectory();
			        String fileName=savedia.getFile();
			        if(dirPath==null||fileName==null)
			            return ;
			        file=new File(dirPath,fileName);
			        try{
			            BufferedWriter bfwt=new BufferedWriter(new FileWriter(file));
			            String t= Area_de_trabajo.getText();
			            bfwt.write(t);
			            bfwt.close();
			            Area_de_trabajo.setText("");
			        }
			        catch (IOException ex){
			            throw new RuntimeException();
			        }
			        file = null;
			}
				
				
				
				
				
				
			
			}
			
				
				
			
		});
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Guardar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(file==null) {
					
				}
				else {
					
				
				try{
		            BufferedWriter bfwt=new BufferedWriter(new FileWriter(file));
		            String t= Area_de_trabajo.getText();
		            bfwt.write(t);
		            bfwt.close();
		            Area_de_trabajo.setText("");
		        }
		        catch (IOException ex){
		            throw new RuntimeException();
		        }
				}
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(Area_de_trabajo.isDisplayable()) {
					file = null;
					FileDialog opendia;

				
				
				opendia = new FileDialog (frame, "abrir", FileDialog.LOAD);
				    frame.setVisible(true);
				    
				
				
					if(file==null){
				        opendia.setVisible(true);
				        String dirPath=opendia.getDirectory();
				        String fileName=opendia.getFile();
				        
				        file=new File(dirPath,fileName);
				        try{
				            BufferedReader bfwt=new BufferedReader(new FileReader(file));
				            String texto="";
				            String linea;
				            do {
					        	   linea=bfwt.readLine();
					            	if (linea == null) {
					            		
					            	}
					            	else {
					            	
									texto+=linea+"\n";
					            	}
								} while( linea != null );
				            Area_de_trabajo.setText(texto);
				        }
				        catch (IOException ex){
				            throw new RuntimeException();
				        }
				}
				}
				
				else if(le.isDisplayable()) {
					file = null;
					frase="";
					FileDialog opendia;

				
				
				opendia = new FileDialog (frame, "abrir", FileDialog.LOAD);
				    frame.setVisible(true);
				    
				
				
					if(file==null){
				        opendia.setVisible(true);
				        String dirPath=opendia.getDirectory();
				        String fileName=opendia.getFile();
				        
				        file=new File(dirPath,fileName);
				        try{
				            BufferedReader bfwt=new BufferedReader(new FileReader(file));
				           String linea;
				           String[] frase2 = new String[10];
				           int contlinea=0;
				           int x;
				            x=0;
				           do {
				        	   linea=bfwt.readLine();
				            	if (linea == null) {
				            		
				            	}
				            	else {
				            	frase2[x]=linea;
								frase+=linea;
								
								
								contlinea++;
								x++;
							    
				            	}
							} while( linea != null );
				      
				                le.sinespacios(frase);
				                le.contadores(frase,contlinea);
				                le.sincomentarios(frase2,x);
				                le.comentarios(frase2, x);
				           
				            
				            
				            
				        }
				        catch (IOException ex){
				            throw new RuntimeException();
				        }
				}
					
				}
				
				
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		
		
	}
}


