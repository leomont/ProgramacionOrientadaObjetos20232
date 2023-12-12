package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.ui;
import edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.controller.amenaza;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modulnformativo extends JFrame{

	public Modulnformativo() {
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 84, 216, 182);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phising");
		lblNewLabel.setBounds(26, 24, 61, 16);
		panel_1.add(lblNewLabel);
		
		
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(129, 49, 1, 16);
		panel_1.add(textPane);
		
		JTextPane txtpnDescripcinSoftwareMalicioso = new JTextPane();
		txtpnDescripcinSoftwareMalicioso.setText("Descripción: Software malicioso que cifra los archivos de la víctima y exige un rescate para restaurar el acceso");
		txtpnDescripcinSoftwareMalicioso.setBounds(26, 52, 166, 80);
		panel_1.add(txtpnDescripcinSoftwareMalicioso);
		
		JLabel lblAtaquesPhising = new JLabel("0");
		lblAtaquesPhising.setBounds(99, 24, 61, 16);
		panel_1.add(lblAtaquesPhising);
		
		JButton btnReporteRamsoware = new JButton("Reportar");
		btnReporteRamsoware.setBounds(46, 144, 117, 29);
		panel_1.add(btnReporteRamsoware);
		
		btnReporteRamsoware.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//numeros de amenzas
				String[] amenazas = new String[12];	
				amenazas[0] = "Ramsoware";
				amenazas[1] = "Phising";
				
				
				amenaza phising = new amenaza("RAM01", "Ramsoware", "Software malicioso que cifra los archivos de la víctima y exige un rescate para restaurar el acceso.", 1);
				
				
				int numeroAtaques = phising.getNumeroAtaques() + 1;
				
				
			
				lblAtaquesPhising.setText(Integer.toString(numeroAtaques + 1));
				
			}
		});
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(234, 84, 210, 182);
		panel_1_1.setLayout(null);
		panel.add(panel_1_1);
		
		JLabel lblRamsoware = new JLabel("Ramsoware");
		lblRamsoware.setBounds(27, 26, 117, 16);
		panel_1_1.add(lblRamsoware);
		
		JButton btnNewButton_1 = new JButton("Reportar");
		btnNewButton_1.setBounds(75, 135, 117, 29);
		panel_1_1.add(btnNewButton_1);
		
		JTextPane txtpnDescripcinSoftwareMalicioso_1 = new JTextPane();
		txtpnDescripcinSoftwareMalicioso_1.setText("Descripción: Software malicioso que cifra los archivos de la víctima y exige un rescate para restaurar el acceso");
		txtpnDescripcinSoftwareMalicioso_1.setBounds(27, 54, 154, 69);
		panel_1_1.add(txtpnDescripcinSoftwareMalicioso_1);
		
		JLabel lblAgregarUnNuevo = new JLabel("Agregar un nuevo incicente informatico");
		lblAgregarUnNuevo.setForeground(Color.BLACK);
		lblAgregarUnNuevo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAgregarUnNuevo.setBounds(42, 30, 438, 27);
		panel.add(lblAgregarUnNuevo);
		// TODO Auto-generated constructor stub
	}
}
