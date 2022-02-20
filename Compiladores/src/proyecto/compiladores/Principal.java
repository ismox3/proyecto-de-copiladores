package proyecto.compiladores;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

import proyecto.compiladores.Area_de_trabajo;

public class Principal {
	
	Area_de_trabajo tr;
	JTextField aux;
	String texto;
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
	
		
	
	public Principal() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 749, 531);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel jpanel = new JPanel();
		jpanel.setBackground(SystemColor.window);
		frame.getContentPane().add(jpanel, BorderLayout.CENTER);
		jpanel.setLayout(null);
		
		JPanel content = new JPanel();
		content.setBackground(Color.BLUE);
		content.setBounds(0, 43, 735, 429);
		frame.getContentPane().add(content);
		content.setLayout(null);
		
		JButton Buttoncon= new JButton("Area de trabajo");
		Buttoncon.setBounds(10, 12, 160, 21);
		frame.getContentPane().add(Buttoncon);
		Buttoncon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Area_de_trabajo con = new Area_de_trabajo(aux);
				con.setSize(735, 429);
				con.setLocation(0, 0);
			
				content.removeAll();
				content.add(con,BorderLayout.CENTER);
				content.revalidate();
				content.repaint();
			}
		});
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		frame.setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		mnNewMenu.setBackground(Color.GRAY);
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Abrir");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Guardar");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				texto tx = new texto(texto);
				tx.imprimir();
				
				
				
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Salir");
		mnNewMenu.add(mntmNewMenuItem);
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	
}
