package ll;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pruba01 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNumero;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pruba01 frame = new Pruba01();
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
	public Pruba01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNumero = new JLabel("Numero");
		lblNumero.setBounds(26, 39, 46, 14);
		contentPane.add(lblNumero);
		
		textField = new JTextField();
		textField.setBounds(92, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(277, 35, 89, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setBounds(26, 98, 385, 152);
		contentPane.add(textArea);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		
		int numero = Integer.parseInt(textField.getText());
	}
}
