import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JSplitPane;
import java.awt.Font;

public class Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoDeBarra;
	private JTextField txtValorUnitario;
	private JTextField txtDescricaoDoPedido;
	private JTextField txtTotalDePedidos;
	private JLabel lblCancelar;
	private JLabel Cancelar;
	private JLabel lblAvancar;
	private JTable tablePedidos;
	private JLabel lblNewLabel_1;
	private JLabel lblMaisOpes;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
					frame.setVisible(true);
					
					Pedido frame2 = new MaisProdutos();
					frame2.setVisible(true);	
					

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public Pedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(10, 42, 46, 14);
		contentPane.add(lblData);
		
		JLabel lblValorUnitario = new JLabel("Valor Unitario");
		lblValorUnitario.setBounds(10, 174, 81, 14);
		contentPane.add(lblValorUnitario);
		
		JLabel lblTotalDePedidos = new JLabel("Total do Pedido");
		lblTotalDePedidos.setBounds(10, 342, 93, 14);
		contentPane.add(lblTotalDePedidos);
		
		txtCodigoDeBarra = new JTextField();
		txtCodigoDeBarra.setBounds(39, 75, 146, 41);
		contentPane.add(txtCodigoDeBarra);
		txtCodigoDeBarra.setColumns(10);
		
		txtValorUnitario = new JTextField();
		txtValorUnitario.setBounds(101, 164, 86, 34);
		contentPane.add(txtValorUnitario);
		txtValorUnitario.setColumns(10);
		
		txtDescricaoDoPedido = new JTextField();
		txtDescricaoDoPedido.setBounds(195, 76, 376, 38);
		contentPane.add(txtDescricaoDoPedido);
		txtDescricaoDoPedido.setColumns(10);
		
		txtTotalDePedidos = new JTextField();
		txtTotalDePedidos.setBounds(99, 321, 138, 56);
		contentPane.add(txtTotalDePedidos);
		txtTotalDePedidos.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o do Produto");
		lblDescricao.setBounds(193, 54, 138, 14);
		contentPane.add(lblDescricao);
		
		lblCancelar = new JLabel("");
		lblCancelar.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\cancelar.gif"));
		lblCancelar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancelar.setBounds(242, 430, 109, 50);
		contentPane.add(lblCancelar);
		
		Cancelar = new JLabel("Cancelar");
		Cancelar.setBounds(258, 405, 73, 14);
		contentPane.add(Cancelar);
		
		lblAvancar = new JLabel("Avan\u00E7ar");
		lblAvancar.setBounds(51, 405, 81, 14);
		contentPane.add(lblAvancar);
		
		tablePedidos = new JTable();
		tablePedidos.setBounds(195, 145, 365, 142);
		contentPane.add(tablePedidos);
		
		lblNewLabel_1 = new JLabel("12/12/2019");
		lblNewLabel_1.setBounds(51, 37, 93, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\avancar.gif"));
		lblNewLabel_2.setBounds(51, 430, 95, 50);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\maisopcoes.gif"));
		lblNewLabel.setBounds(476, 430, 95, 50);
		contentPane.add(lblNewLabel);
		
		lblMaisOpes = new JLabel("Mais Op\u00E7\u00F5es");
		lblMaisOpes.setBounds(476, 405, 73, 14);
		contentPane.add(lblMaisOpes);

		
	}
}
