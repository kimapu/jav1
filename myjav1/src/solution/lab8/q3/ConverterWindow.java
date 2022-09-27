package solution.lab8.q3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConverterWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtMile;
	private JTextField txtKilo;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConverterWindow frame = new ConverterWindow();
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
	public ConverterWindow() {
		setTitle("CONVERTER WINDOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 291);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MILES");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 14, 397, 28);
		contentPane.add(lblNewLabel);
		
		txtMile = new JTextField();
		txtMile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtKilo.setText(
							String.valueOf( Distance.toKilo( Long.parseLong(txtMile.getText()) ) )
						);
			}
		});
		txtMile.setBounds(10, 44, 397, 28);
		contentPane.add(txtMile);
		txtMile.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("KILOMETRE");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 79, 138, 39);
		contentPane.add(lblNewLabel_1);
		
		txtKilo = new JTextField();
		txtKilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMile.setText(
							String.valueOf( Distance.toMile( Long.parseLong( txtKilo.getText() ) ) )
						);
			}
		});
		txtKilo.setBounds(10, 120, 397, 28);
		contentPane.add(txtKilo);
		txtKilo.setColumns(10);
		
		lblNewLabel_2 = new JLabel("*1 mile = 1.60934 kilometre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(10, 185, 358, 39);
		contentPane.add(lblNewLabel_2);
	}

}
