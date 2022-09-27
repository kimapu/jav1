package solution.lab8.q4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InvestmentWindow extends JFrame {

	private InvestmentCalc calc;
	private JPanel contentPane;
	private JTextField txtAmt;
	private JTextField txtRate;
	private JTextField txtYear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InvestmentWindow frame = new InvestmentWindow();
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
	public InvestmentWindow() {
		setTitle("INVESTMENT CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 489, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INVESTMENT DETAILS:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(11, 12, 410, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("AMOUNT:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(11, 63, 101, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ANNUAL RATE (%):");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(11, 101, 123, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("NO OF YEAR:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(11, 140, 101, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		txtAmt = new JTextField();
		txtAmt.setBounds(145, 63, 276, 28);
		contentPane.add(txtAmt);
		txtAmt.setColumns(10);
		
		txtRate = new JTextField();
		txtRate.setColumns(10);
		txtRate.setBounds(145, 101, 276, 28);
		contentPane.add(txtRate);
		
		txtYear = new JTextField();
		txtYear.setColumns(10);
		txtYear.setBounds(145, 140, 276, 28);
		contentPane.add(txtYear);
		
		JLabel lblResult = new JLabel("");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblResult.setBounds(145, 244, 276, 63);
		contentPane.add(lblResult);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calc = new InvestmentCalc(
						Double.parseDouble(txtAmt.getText()),
						Double.parseDouble(txtRate.getText()),
						Integer.parseInt(txtYear.getText())
						);
				calc.compute();
				lblResult.setText( "Future value: RM"+calc.getFutureinvestmentValue() );
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(145, 183, 276, 47);
		contentPane.add(btnNewButton);
		
	}

}
