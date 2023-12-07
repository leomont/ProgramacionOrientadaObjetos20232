package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.ui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Modulnformativo extends JFrame{

	public Modulnformativo() {
		getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(6, 6, 210, 182);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Phising");
		lblNewLabel.setBounds(27, 39, 61, 16);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("El phising es un tipo...");
		lblNewLabel_1.setBounds(27, 69, 89, 16);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Reportar");
		btnNewButton.setBounds(75, 135, 117, 29);
		panel_1.add(btnNewButton);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(234, 6, 210, 182);
		panel.add(panel_1_1);
		
		JLabel lblRamsoware = new JLabel("Ramsoware");
		lblRamsoware.setBounds(27, 39, 61, 16);
		panel_1_1.add(lblRamsoware);
		
		JLabel lblNewLabel_1_1 = new JLabel("El ramsowware ...");
		lblNewLabel_1_1.setBounds(27, 69, 89, 16);
		panel_1_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton_1 = new JButton("Reportar");
		btnNewButton_1.setBounds(75, 135, 117, 29);
		panel_1_1.add(btnNewButton_1);
		// TODO Auto-generated constructor stub
	}
}
