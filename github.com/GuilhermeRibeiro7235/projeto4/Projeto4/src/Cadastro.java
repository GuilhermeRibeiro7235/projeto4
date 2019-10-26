import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Cadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblValor;
	private JTextField textField_4;
	private JLabel lblDataAtualizao;
	private JTextField textField_5;
	private JLabel lblAtivo;
	private JTextField textField_6;

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
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(22, 29, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(98, 26, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(22, 61, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 58, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Descri\u00E7\u00E3o");
		lblNewLabel_2.setBounds(22, 92, 57, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(99, 89, 227, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblUnidades = new JLabel("Unidade(s)");
		lblUnidades.setBounds(22, 123, 71, 14);
		contentPane.add(lblUnidades);
		
		textField_3 = new JTextField();
		textField_3.setBounds(98, 120, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		lblValor = new JLabel("Valor");
		lblValor.setBounds(22, 150, 46, 14);
		contentPane.add(lblValor);
		
		textField_4 = new JTextField();
		textField_4.setBounds(98, 151, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		lblDataAtualizao = new JLabel("Data Atualiza\u00E7\u00E3o");
		lblDataAtualizao.setBounds(22, 187, 91, 14);
		contentPane.add(lblDataAtualizao);
		
		textField_5 = new JTextField();
		textField_5.setBounds(123, 184, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		lblAtivo = new JLabel("Ativo");
		lblAtivo.setBounds(22, 219, 46, 14);
		contentPane.add(lblAtivo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(98, 216, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
	}
}
