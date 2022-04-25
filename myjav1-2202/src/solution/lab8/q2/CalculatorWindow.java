package solution.lab8.q2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorWindow extends JFrame {

	private Calculator calc;
	private JPanel contentPane;
	private JTextField txtNum1;
	private JTextField txtNum2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorWindow frame = new CalculatorWindow();
					frame.setLocationRelativeTo(null);
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
	public CalculatorWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 262);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MY CALCULATOR");
		lblNewLabel.setBounds(15, 13, 392, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Number 1:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(25, 55, 138, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Number 2:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(25, 91, 138, 27);
		contentPane.add(lblNewLabel_2);
		
		txtNum1 = new JTextField();
		txtNum1.setBounds(86, 55, 426, 27);
		contentPane.add(txtNum1);
		txtNum1.setColumns(10);
		
		txtNum2 = new JTextField();
		txtNum2.setBounds(86, 91, 426, 27);
		contentPane.add(txtNum2);
		txtNum2.setColumns(10);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc = new Calculator( 
						Long.parseLong(txtNum1.getText()),
						Long.parseLong(txtNum2.getText())
						);
				JOptionPane.showMessageDialog(contentPane, String.valueOf(calc.add()));
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(86, 129, 67, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBTRACT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc = new Calculator( 
						Long.parseLong(txtNum1.getText()),
						Long.parseLong(txtNum2.getText())
						);
				JOptionPane.showMessageDialog(contentPane, String.valueOf(calc.sub()));
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(163, 129, 112, 47);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MULTIPLY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc = new Calculator( 
						Long.parseLong(txtNum1.getText()),
						Long.parseLong(txtNum2.getText())
						);
				JOptionPane.showMessageDialog(contentPane, String.valueOf(calc.mul()));
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(284, 129, 123, 47);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DIVIDE");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc = new Calculator( 
						Long.parseLong(txtNum1.getText()),
						Long.parseLong(txtNum2.getText())
						);
				JOptionPane.showMessageDialog(contentPane, String.valueOf(calc.div()));
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_3.setBounds(419, 129, 93, 47);
		contentPane.add(btnNewButton_3);
	}
}
