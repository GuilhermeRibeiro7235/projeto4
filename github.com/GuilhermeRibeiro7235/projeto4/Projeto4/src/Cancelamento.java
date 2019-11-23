import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class Cancelamento extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cancelamento frame = new Cancelamento();
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
	public Cancelamento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 665, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblQualProduto = new JLabel("Qual produto voc\u00EA quer cancelar?");
		lblQualProduto.setBounds(28, 26, 186, 14);
		contentPane.add(lblQualProduto);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\coxinha.png"));
		lblNewLabel.setBounds(28, 51, 237, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblQuantidadeASer = new JLabel("Quantidade a ser cancelada:");
		lblQuantidadeASer.setBounds(28, 111, 159, 14);
		contentPane.add(lblQuantidadeASer);
		
		JLabel label = new JLabel("1.");
		label.setBounds(28, 147, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("2.");
		label_1.setBounds(28, 202, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("3.");
		label_2.setBounds(28, 273, 46, 14);
		contentPane.add(label_2);
		
		JLabel lblTodos = new JLabel("Todos");
		lblTodos.setBounds(10, 365, 46, 14);
		contentPane.add(lblTodos);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\cancelar01.gif"));
		btnNewButton.setBounds(59, 136, 287, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\Cancelar2.gif"));
		btnNewButton_1.setBounds(59, 205, 281, 57);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\cancelar3.gif"));
		btnNewButton_2.setBounds(59, 273, 277, 60);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\819167235\\Desktop\\projeto4\\CancelarTodos.gif"));
		btnNewButton_3.setBounds(59, 365, 286, 64);
		contentPane.add(btnNewButton_3);
	}
}
