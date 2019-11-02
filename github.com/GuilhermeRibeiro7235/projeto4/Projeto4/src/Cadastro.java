import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodigo;
	private JTextField txtNome;
	private JTextField txtDescricao;
	private JTextField txtUnidades;
	private JLabel lblValor;
	private JTextField txtValor;
	private JLabel lblDataAtualizao;
	private JTextField txtDataAtualizao;
	private JLabel lblAtivo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastro frame = new Cadastro();
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
	public Cadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 589, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(22, 29, 46, 14);
		contentPane.add(lblCodigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(146, 26, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(22, 61, 46, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(146, 57, 86, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o");
		lblDescricao.setBounds(22, 92, 71, 14);
		contentPane.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(146, 88, 118, 20);
		contentPane.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		JLabel lblUnidades = new JLabel("Unidade(s)");
		lblUnidades.setBounds(22, 123, 71, 14);
		contentPane.add(lblUnidades);
		
		txtUnidades = new JTextField();
		txtUnidades.setBounds(146, 120, 86, 20);
		contentPane.add(txtUnidades);
		txtUnidades.setColumns(10);
		
		lblValor = new JLabel("Valor");
		lblValor.setBounds(22, 150, 46, 14);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setBounds(146, 151, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		lblDataAtualizao = new JLabel("Data Atualiza\u00E7\u00E3o");
		lblDataAtualizao.setBounds(22, 187, 104, 14);
		contentPane.add(lblDataAtualizao);
		
		txtDataAtualizao = new JTextField();
		txtDataAtualizao.setBounds(146, 178, 86, 20);
		contentPane.add(txtDataAtualizao);
		txtDataAtualizao.setColumns(10);
		
		lblAtivo = new JLabel("Ativo");
		lblAtivo.setBounds(22, 219, 46, 14);
		contentPane.add(lblAtivo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(156, 216, 28, 20);
		contentPane.add(comboBox);
	}
}
