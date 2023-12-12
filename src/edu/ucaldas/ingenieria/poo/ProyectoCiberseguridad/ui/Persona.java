package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.ui;


import edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.controller.Administrador;
import edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.controller.usuario;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

//import fintech.businesslogic.Cliente;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class Persona extends JFrame {

	private JPanel contentPane;
	private JTextField txtApellido;
	private JTextField txtCedula;
	private JTextField txtemail;
	private JTextField txtContrasena;
	
	
	Connection con = null;
	PreparedStatement pst = null;
	private JTextField txtNombre;
	private JTextField txtDepartamento;
	private JPasswordField passwordField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Persona frame = new Persona();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Persona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 620);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel studentDetails = new JLabel("Creacion de Usuarios");
		studentDetails.setForeground(Color.BLACK);
		studentDetails.setFont(new Font("Perpetua Titling MT", Font.BOLD, 22));
		
		JLabel lblNombre = new JLabel("Nombres");
		lblNombre.setForeground(Color.BLACK);
		lblNombre.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JLabel lblCedula = new JLabel("Cedula");
		lblCedula.setForeground(Color.BLACK);
		lblCedula.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.BLACK);
		lblEmail.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contrasena");
		lblContrasena.setForeground(Color.BLACK);
		lblContrasena.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JCheckBox chcEsAdmin = new JCheckBox("EsAdministrador");
		
		
		//Inicio del boton registrar
		JButton submit = new JButton("Registrar");
		submit.setForeground(Color.BLACK);
		submit.addActionListener(
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String nombre = txtNombre.getText() + txtApellido.getText();
			String cedula = txtCedula.getText();
			String contrasena = txtContrasena.getText();
			String email = txtemail.getText();
			String departamento = txtDepartamento.getText();
			
			String esAdministrador = chcEsAdmin.getLabel();
		
			if (esAdministrador.equals("1"))
			{
				Administrador admin = new Administrador(cedula, nombre, departamento, esAdministrador);
			}
			else
			{
				usuario user = new usuario(cedula, nombre, email,departamento);
			}
			
		
			
			JOptionPane.showConfirmDialog(submit, esAdministrador.equals("1") ? " El admin Fue ingresado correctamente" : " El usuario Fue ingresado correctamente " );
			
		}
		}
			);
		submit.setFont(new Font("Tahoma", Font.BOLD, 14));
		//Fin de boton de registar
		
		
		txtContrasena = new JTextField();
		txtContrasena.setColumns(10);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Menu menu = new Menu();
				//menu.show();
				dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(Color.GRAY);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBackground(Color.GRAY);
		
		JDesktopPane desktopPane_3 = new JDesktopPane();
		desktopPane_3.setBackground(Color.GRAY);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setForeground(Color.BLACK);
		lblApellidos.setFont(new Font("Dialog", Font.BOLD, 14));
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		JLabel lblArea = new JLabel("Area/Departamento");
		lblArea.setFont(new Font("Dialog", Font.BOLD, 14));
		
		txtDepartamento = new JTextField();
		txtDepartamento.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		
		//JCheckBox chcEsAdmin = new JCheckBox("EsAdministrador");
		
		passwordField = new JPasswordField();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(desktopPane, GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 563, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(41)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblCedula)
												.addComponent(lblEmail)
												.addComponent(lblContrasena)
												.addComponent(lblArea))
											.addGap(50))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))))
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
									.addGap(12)
									.addComponent(submit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
										.addGap(128))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(txtApellido, Alignment.LEADING)
											.addComponent(txtemail, Alignment.LEADING, 247, 247, Short.MAX_VALUE)
											.addComponent(txtCedula, Alignment.LEADING)
											.addComponent(txtNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
											.addComponent(txtContrasena, Alignment.LEADING)
											.addComponent(txtDepartamento, Alignment.LEADING)
											.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(passwordField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE))
										.addGap(171)))
								.addComponent(chcEsAdmin)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(182)
							.addComponent(studentDetails)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(desktopPane_3, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(studentDetails)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNombre, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(29)
									.addComponent(lblCedula))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(32)
									.addComponent(txtCedula, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtemail, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblEmail))
							.addGap(30)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblContrasena)
								.addComponent(txtContrasena, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(2)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtDepartamento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblArea))
							.addGap(18)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(24)
							.addComponent(chcEsAdmin)
							.addGap(36)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(submit, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
						.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(desktopPane_3, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(13)
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(130)
					.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
