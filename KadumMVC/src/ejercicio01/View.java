package ejercicio01;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

public class View extends JFrame {

	/**************** ATRIBUTOS ***************************/
	// CONTENEDOR PRINCIPAL
	private JPanel contenedor;

	// DEFINICI�N DE LAS ETIQUETAS
	private JLabel lblsocioID;
	private JLabel lblNombre;
	private JLabel lblEstatura;
	private JLabel lblEdad;
	private JLabel lblLocalidad;

	// DEFINICI�N DE LOS CUADROS DE TEXTO
	protected JTextField txtsocioID;
	protected JTextField txtNombre;
	protected JTextField txtEstatura;
	protected JTextField txtEdad;
	protected JTextField txtLocalidad;

	// DEFINICI�N DE LOS BOTONES
	protected JButton btnAdd;
	protected JButton btnDel;
	protected JButton btnUpd;

	// DEFINICI�N DE LOS OBJETOS PARA LA TABLA
	private JScrollPane scroll; // Panel de scroll que contiene la tabla
	protected Object[][] datos; // Cuerpo de la tabla
	protected String[] cabecera; // Cabecera de la tabla
	protected DefaultTableModel dtm;// Uni�n de la cabecera y la tabla
	protected JTable tabla; // Tabla propiamente dicha

	/**************** M�TODOS ***************************/
	// CONSTRUCTOR
	View() {
		// M�todos de la JFrame
		setBounds(100, 100, 450, 300);// Definir las dimensiones de la ventana
		setTitle("GESTI�N DE CLIENTES - KADUM"); // Barra de t�tulo
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Acci�n al pulsar salir

		// CREAR EL CONTENEDOR PRINCIPAL Y A�ADIRLO A LA VENTANA
		contenedor = new JPanel();
		getContentPane().add(contenedor);

		// INDICAR QUE SE QUIERE USAR SPRINGLAYOUT
		SpringLayout sp = new SpringLayout();
		contenedor.setLayout(sp);

		// Vamos al l�o
		/**************** BOF ETIQUETAS vvvvvvvvvvvvvvvv **/
		// ETIQUETA NOMBRE
		lblsocioID = new JLabel("SocioID: "); // Crear el objeto
		contenedor.add(lblsocioID); // A�adirlo al contenedor
		sp.putConstraint(SpringLayout.NORTH, lblsocioID, 10, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, lblsocioID, 10, SpringLayout.WEST, contenedor);
		// ETIQUETA APELLIDOS
		lblNombre = new JLabel("Nombre: ");
		contenedor.add(lblNombre);
		sp.putConstraint(SpringLayout.NORTH, lblNombre, 50, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, lblNombre, 10, SpringLayout.WEST, contenedor);
		// ETIQUETA NIF
		lblEstatura = new JLabel("Estatura: ");
		contenedor.add(lblEstatura);
		sp.putConstraint(SpringLayout.NORTH, lblEstatura, 90, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, lblEstatura, 10, SpringLayout.WEST, contenedor);
		/**************** EOF ETIQUETAS ^^^^^^^^^^^^^^^^ **/

		/**************** BOF CUADROS DE TEXTO vvvvvvvvv **/
		// CUADRO DE TEXTO PARA EL NOMBRE
		txtsocioID = new JTextField();
		contenedor.add(txtsocioID);
		sp.putConstraint(SpringLayout.NORTH, txtsocioID, 10, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, txtsocioID, 100, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, txtsocioID, 300, SpringLayout.WEST, contenedor);
		// CUADRO DE TEXTO PARA EL NIF
		txtNombre = new JTextField();
		contenedor.add(txtNombre); // a�adir al contenedor
		sp.putConstraint(SpringLayout.NORTH, txtNombre, 50, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, txtNombre, 100, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, txtNombre, 300, SpringLayout.WEST, contenedor);
		// CUADRO DE TEXTO PARA LOS APELLIDOS
		txtEstatura = new JTextField();
		contenedor.add(txtEstatura);
		sp.putConstraint(SpringLayout.NORTH, txtEstatura, 90, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, txtEstatura, 100, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, txtEstatura, 300, SpringLayout.WEST, contenedor);
		/**************** EOF CUADROS DE TEXTO ^^^^^^^^^ **/

		/**************** BOF TABLA vvvvvvvvvvvvvvvvvvvv **/
		scroll = new JScrollPane();
		cabecera = new String[] { "socioID", "NOMBRE", "ESTATURA", "EDAD", "LOCALIDAD" };
		dtm = new DefaultTableModel(datos, cabecera);
		tabla = new JTable(dtm);
		scroll.setViewportView(tabla);
		// y ahora se coloca el scrollpane...
		contenedor.add(scroll); // a�adir al contenedor
		sp.putConstraint(SpringLayout.NORTH, scroll, 120, SpringLayout.NORTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, scroll, 10, SpringLayout.WEST, contenedor);
		sp.putConstraint(SpringLayout.EAST, scroll, -10, SpringLayout.EAST, contenedor);
		sp.putConstraint(SpringLayout.SOUTH, scroll, -50, SpringLayout.SOUTH, contenedor);
		/**************** EOF TABLA ^^^^^^^^^^^^^^^^^^^^ **/

		/**************** BOF BOTONES vvvvvvvvvvvvvvvvvv **/
		// BOT�N A�ADIR
		btnAdd = new JButton("A�adir");
		contenedor.add(btnAdd);
		sp.putConstraint(SpringLayout.SOUTH, btnAdd, -10, SpringLayout.SOUTH, contenedor);// colocarlo
		sp.putConstraint(SpringLayout.WEST, btnAdd, 60, SpringLayout.WEST, contenedor);
		// BOT�N BORRAR
		btnDel = new JButton("Borrar");
		contenedor.add(btnDel);
		sp.putConstraint(SpringLayout.SOUTH, btnDel, -10, SpringLayout.SOUTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, btnDel, 190, SpringLayout.WEST, contenedor);
		// BOT�N MODIFICAR
		btnUpd = new JButton("Editar");
		contenedor.add(btnUpd);
		sp.putConstraint(SpringLayout.SOUTH, btnUpd, -10, SpringLayout.SOUTH, contenedor);
		sp.putConstraint(SpringLayout.WEST, btnUpd, 310, SpringLayout.WEST, contenedor);
		/**************** EOF BOTONES ^^^^^^^^^^^^^^^^^^^^ **/

		// Se hace visible la ventana
		setVisible(true);

	}

	public void conectaControlador(Controller c) {

		btnAdd.addActionListener(c);
		btnAdd.setActionCommand("INSERTAR");

		btnDel.addActionListener(c);
		btnDel.setActionCommand("BORRAR");

		btnUpd.addActionListener(c);
		btnUpd.setActionCommand("MODIFICAR");

		tabla.addMouseListener(c);
		// s�lo se permite pulsar una fila a la vez.
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
	}
}