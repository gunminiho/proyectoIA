package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConsultarCocina extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JTextField txtQuemadores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultarCocina frame = new ConsultarCocina();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConsultarCocina() {
		setResizable(false);
		setTitle("Consultar cocina");
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 26, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Precio (S/)");
		lblNewLabel_1.setBounds(10, 51, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Ancho (cm)");
		lblNewLabel_1_1.setBounds(10, 76, 103, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Alto (cm)");
		lblNewLabel_1_2.setBounds(10, 101, 103, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Fondo (cm)");
		lblNewLabel_1_3.setBounds(10, 126, 103, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Quemadores");
		lblNewLabel_1_4.setBounds(10, 151, 103, 14);
		contentPane.add(lblNewLabel_1_4);
		
		txtPrecio = new JTextField();
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(123, 48, 174, 20);
		contentPane.add(txtPrecio);
		
		txtAncho = new JTextField();
		txtAncho.setColumns(10);
		txtAncho.setBounds(123, 73, 174, 20);
		contentPane.add(txtAncho);
		
		txtAlto = new JTextField();
		txtAlto.setColumns(10);
		txtAlto.setBounds(123, 98, 174, 20);
		contentPane.add(txtAlto);
		
		txtFondo = new JTextField();
		txtFondo.setColumns(10);
		txtFondo.setBounds(123, 123, 174, 20);
		contentPane.add(txtFondo);
		
		txtQuemadores = new JTextField();
		txtQuemadores.setColumns(10);
		txtQuemadores.setBounds(123, 148, 174, 20);
		contentPane.add(txtQuemadores);
		
		JComboBox cbModelo = new JComboBox();
		cbModelo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una opcion", "Mabe EMP6120PG0", "Indurama Parma", "Sole COSOL027", "Coldex CX602", "Reco Dakota"}));
		cbModelo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				int modelo = cbModelo.getSelectedIndex();
				switch(modelo){
				case 1:
				txtPrecio.setText(String.valueOf(Main.precio0));
				txtFondo.setText(String.valueOf(Main.fondo0));
				txtAncho.setText(String.valueOf(Main.ancho0));
				txtAlto.setText(String.valueOf(Main.alto0));
				txtQuemadores.setText(String.valueOf(Main.quemadores0));
					break;
				case 2:
				txtPrecio.setText(String.valueOf(Main.precio1));
				txtFondo.setText(String.valueOf(Main.fondo1));
				txtAncho.setText(String.valueOf(Main.ancho1));
				txtAlto.setText(String.valueOf(Main.alto1));
				txtQuemadores.setText(String.valueOf(Main.quemadores1));
					break;
				case 3:
				txtPrecio.setText(String.valueOf(Main.precio2));
				txtFondo.setText(String.valueOf(Main.fondo2));
				txtAncho.setText(String.valueOf(Main.ancho2));
				txtAlto.setText(String.valueOf(Main.alto2));
				txtQuemadores.setText(String.valueOf(Main.quemadores2));
					break;
				case 4:
				txtPrecio.setText(String.valueOf(Main.precio3));
				txtFondo.setText(String.valueOf(Main.fondo3));
				txtAncho.setText(String.valueOf(Main.ancho3));
				txtAlto.setText(String.valueOf(Main.alto3));
				txtQuemadores.setText(String.valueOf(Main.quemadores3));
					break;
				case 5:
				txtPrecio.setText(String.valueOf(Main.precio4));
				txtFondo.setText(String.valueOf(Main.fondo4));
				txtAncho.setText(String.valueOf(Main.ancho4));
				txtAlto.setText(String.valueOf(Main.alto4));
				txtQuemadores.setText(String.valueOf(Main.quemadores4));
					break;
				default:
				txtPrecio.setText("");
				txtFondo.setText("");
				txtAncho.setText("");
				txtAlto.setText("");
				txtQuemadores.setText("");
					break;
				}
				
			}
		});
		cbModelo.setBounds(123, 22, 174, 22);
		contentPane.add(cbModelo);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setBounds(419, 22, 89, 23);
		contentPane.add(btnNewButton);
	}
}
