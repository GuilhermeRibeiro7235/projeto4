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

public class Pedido extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigoDeBarra;
	private JTextField txtValorUnitario;
	private JTextField txtDescricaoDoPedido;
	private JTextField txtTotalDePedidos;
	private JLabel lblNewLabel;
	private JLabel lblCancelar;
	private JLabel lblMais;
	private JLabel lblFinalizar;
	private JLabel Cancelar;
	private JLabel lblAvancar;
	private JLabel lblMaisProdutos;
	private JLabel lblCoxinha;
	private JLabel lblCaf;
	private JLabel lblPoDeQueijo;
	private JTable tablePedidos;
	private JLabel label_2;
	private JLabel lblMaisOpes;
	private JLabel label;
	private JLabel label_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pedido frame = new Pedido();
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
	public Pedido() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 815, 530);
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
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\coxinha.png"));
		lblNewLabel.setBounds(589, 68, 187, 48);
		contentPane.add(lblNewLabel);
		
		lblCancelar = new JLabel("");
		lblCancelar.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\cancelar.gif"));
		lblCancelar.setHorizontalAlignment(SwingConstants.CENTER);
		lblCancelar.setBounds(136, 413, 109, 50);
		contentPane.add(lblCancelar);
		
		lblMais = new JLabel("");
		lblMais.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\codabar.jpg"));
		lblMais.setHorizontalAlignment(SwingConstants.CENTER);
		lblMais.setBounds(626, 346, 120, 34);
		contentPane.add(lblMais);
		
		lblFinalizar = new JLabel("");
		lblFinalizar.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\codabar.jpg"));
		lblFinalizar.setHorizontalAlignment(SwingConstants.CENTER);
		lblFinalizar.setBounds(295, 413, 150, 50);
		contentPane.add(lblFinalizar);
		
		Cancelar = new JLabel("Cancelar");
		Cancelar.setBounds(172, 388, 73, 14);
		contentPane.add(Cancelar);
		
		lblAvancar = new JLabel("Avan\u00E7ar");
		lblAvancar.setBounds(352, 388, 81, 14);
		contentPane.add(lblAvancar);
		
		lblMaisProdutos = new JLabel("Mais Produtos");
		lblMaisProdutos.setBounds(651, 321, 95, 14);
		contentPane.add(lblMaisProdutos);
		
		lblCoxinha = new JLabel("Coxinha");
		lblCoxinha.setBounds(589, 54, 46, 14);
		contentPane.add(lblCoxinha);
		
		lblCaf = new JLabel("Caf\u00E9");
		lblCaf.setBounds(589, 131, 46, 14);
		contentPane.add(lblCaf);
		
		lblPoDeQueijo = new JLabel("P\u00E3o de Queijo");
		lblPoDeQueijo.setBounds(589, 216, 102, 14);
		contentPane.add(lblPoDeQueijo);
		
		tablePedidos = new JTable();
		tablePedidos.setBounds(195, 145, 365, 142);
		contentPane.add(tablePedidos);
		
		label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\codabar.jpg"));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(516, 413, 150, 50);
		contentPane.add(label_2);
		
		lblMaisOpes = new JLabel("Mais Op\u00E7\u00F5es");
		lblMaisOpes.setBounds(533, 388, 81, 14);
		contentPane.add(lblMaisOpes);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\cafe.gif"));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(589, 156, 187, 48);
		contentPane.add(label);
		
		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\paodequeijo.gif"));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(589, 241, 187, 48);
		contentPane.add(label_1);
		
		lblNewLabel_1 = new JLabel("12/12/2019");
		lblNewLabel_1.setBounds(51, 37, 93, 25);
		contentPane.add(lblNewLabel_1);
	}
}
