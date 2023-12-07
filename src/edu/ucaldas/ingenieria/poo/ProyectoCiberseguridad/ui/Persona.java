package edu.ucaldas.ingenieria.poo.ProyectoCiberseguridad.ui;

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

public class Persona extends JFrame {

	private JPanel contentPane;
	private JTextField txtApellido;
	private JTextField txtCedual;
	private JTextField txtemail;
	private JTextField txtContrasena;
	
	
	Connection con = null;
	PreparedStatement pst = null;
	private JTextField txtNombre;
	private JTextField textField;
	private JTextField textField_1;


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
		
		JLabel studentDetails = new JLabel("Detalles Persona");
		studentDetails.setForeground(Color.BLACK);
		studentDetails.setFont(new Font("Perpetua Titling MT", Font.BOLD, 22));
		
		JLabel studentName = new JLabel("Nombres");
		studentName.setForeground(Color.BLACK);
		studentName.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JLabel entryNumber = new JLabel("Cedula");
		entryNumber.setForeground(Color.BLACK);
		entryNumber.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JLabel emailAddress = new JLabel("Email");
		emailAddress.setForeground(Color.BLACK);
		emailAddress.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		
		txtCedual = new JTextField();
		txtCedual.setColumns(10);
		
		txtemail = new JTextField();
		txtemail.setColumns(10);
		
		JLabel homeCity = new JLabel("Contrasena");
		homeCity.setForeground(Color.BLACK);
		homeCity.setFont(new Font("Perpetua Titling MT", Font.BOLD, 14));
		
		JButton submit = new JButton("Submit");
		submit.setForeground(Color.BLACK);
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			//opcion 1 estructura de datos	
			String cedula = txtCedual.getText();
			String nombre = txtNombre.getText();
			String apelliddo= txtApellido.getText();
			String email = txtemail.getText();
			//String direccion=  txtDireccionC.getText();
			String contrasena = txtContrasena.getText(); 	
				/*
				 * Cliente nuevoCliente = new Cliente(); nuevoCliente.registrarUsuario(cedula,
				 * nombre, apelliddo, email, direccion, contrasena);
				 * 
				 * JOptionPane.showConfirmDialog(submit,
				 * "Ingreso correctamente usuario con nombre: " + nombre + " " +apelliddo);
				 * 
				 * ArrayList<Cliente> listadoCliente = new ArrayList<Cliente>();
				 * listadoCliente.add(nuevoCliente);
				 */	
				
				
				//Opcion 2: base de datos
			/*
				try {
					String query = "INSERT INTO `student`(`name`, `entrynumber`, `email`, `contactnumber`, `homecity`) VALUES (?, ?, ?, ?, ?)";
					con = DriverManager.getConnection("jdbc:mysql://localhost/studentmanagementsystem", "root", "");
					pst=con.prepareStatement(query);
					pst.setString(1, txtApellido.getText());
					pst.setString(2, txtCedual.getText());
					pst.setString(3, txtemail.getText());
					pst.setString(4, txtDireccionC.getText());
					pst.setString(5, txtContrasena.getText());
					if(txtApellido.getText().equals("") || txtCedual.getText().equals("") || txtemail.getText().equals("") || txtDireccionC.getText().equals("") || txtContrasena.getText().equals("")) {
						JOptionPane.showMessageDialog(null, "Fill all the details :(");
					}
					else {
						pst.executeUpdate();
						JOptionPane.showMessageDialog(null, "Student added Successfully :)");
						dispose();
						Menu menu = new Menu();
						menu.show();
					}
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, ex);
				}
				*/
			}
		});
		submit.setFont(new Font("Tahoma", Font.BOLD, 14));
		
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
		
		JLabel lblNewLabel = new JLabel("Area/Departamento");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
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
									.addGap(12)
									.addComponent(submit, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(41)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(entryNumber)
												.addComponent(emailAddress)
												.addComponent(homeCity))
											.addGap(111))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(studentName, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel)))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(txtemail, 247, 247, 247)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(txtCedual, Alignment.LEADING)
												.addComponent(txtApellido, Alignment.LEADING)
												.addComponent(txtNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
											.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGap(171))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(textField, Alignment.LEADING)
										.addComponent(txtContrasena, Alignment.LEADING, 247, 247, Short.MAX_VALUE)
										.addComponent(comboBox, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 178, GroupLayout.PREFERRED_SIZE)
									.addGap(128))))
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
								.addComponent(studentName, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblApellidos, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(29)
									.addComponent(entryNumber))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(32)
									.addComponent(txtCedual, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtemail, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
								.addComponent(emailAddress))
							.addGap(18)
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(17)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(76)
									.addComponent(lblNewLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(txtContrasena, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
										.addComponent(homeCity))
									.addGap(18)
									.addComponent(textField)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addComponent(submit, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)))
						.addComponent(desktopPane_2, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(desktopPane_3, GroupLayout.PREFERRED_SIZE, 506, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGap(13)
					.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(6))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
