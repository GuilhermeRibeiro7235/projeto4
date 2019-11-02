import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Vendas extends JFrame {

	private JPanel contentPane;
	private JTable tableVendaPedidos;
	private JTextField txtTotal;
	private JTextField txtSubTotal;
	private JTextField txtTroco;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vendas frame = new Vendas();
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
	public Vendas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 808, 490);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		tableVendaPedidos = new JTable();
		tableVendaPedidos.setBounds(167, 56, 441, 233);
		contentPane.add(tableVendaPedidos);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(310, 368, 46, 14);
		contentPane.add(lblTotal);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(366, 352, 156, 46);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setBounds(292, 315, 64, 14);
		contentPane.add(lblSubTotal);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setBounds(366, 303, 156, 38);
		contentPane.add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		JLabel lblTroco = new JLabel("Troco");
		lblTroco.setBounds(567, 352, 46, 14);
		contentPane.add(lblTroco);
		
		txtTroco = new JTextField();
		txtTroco.setBounds(623, 333, 132, 38);
		contentPane.add(txtTroco);
		txtTroco.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\cancelar.gif"));
		lblNewLabel.setBounds(88, 396, 105, 44);
		contentPane.add(lblNewLabel);
		
		JLabel lblCancelar = new JLabel("Cancelar");
		lblCancelar.setBounds(116, 368, 64, 14);
		contentPane.add(lblCancelar);
	}

}
