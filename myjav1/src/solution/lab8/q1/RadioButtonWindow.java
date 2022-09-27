package solution.lab8.q1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class RadioButtonWindow extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButtonWindow frame = new RadioButtonWindow();
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
	public RadioButtonWindow() {
		setTitle("Radion Button Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 588, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtNRed = new JRadioButton("RED");
		rdbtNRed.setOpaque(false);
		rdbtNRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleChangeBackground( e.getActionCommand() );
			}
		});
		buttonGroup.add(rdbtNRed);
		rdbtNRed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtNRed.setBounds(64, 67, 297, 47);
		contentPane.add(rdbtNRed);
		
		JRadioButton rdbtnYellow = new JRadioButton("YELLOW");
		rdbtnYellow.setOpaque(false);
		rdbtnYellow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleChangeBackground( e.getActionCommand() );
			}
		});
		buttonGroup.add(rdbtnYellow);
		rdbtnYellow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnYellow.setBounds(64, 124, 297, 47);
		contentPane.add(rdbtnYellow);
		
		JRadioButton rdbtnWhite = new JRadioButton("WHITE");
		buttonGroup.add(rdbtnWhite);
		rdbtnWhite.setOpaque(false);
		rdbtnWhite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleChangeBackground( e.getActionCommand() );
			}
		});
		rdbtnWhite.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnWhite.setBounds(64, 184, 297, 47);
		contentPane.add(rdbtnWhite);
		
		JRadioButton rdbtnGray = new JRadioButton("GRAY");
		buttonGroup.add(rdbtnGray);
		rdbtnGray.setOpaque(false);
		rdbtnGray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleChangeBackground( e.getActionCommand() );
			}
		});
		rdbtnGray.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnGray.setBounds(64, 242, 297, 47);
		contentPane.add(rdbtnGray);
		
		JRadioButton rdbtnGreen = new JRadioButton("GREEN");
		buttonGroup.add(rdbtnGreen);
		rdbtnGreen.setOpaque(false);
		rdbtnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				handleChangeBackground( e.getActionCommand() );
			}
		});
		rdbtnGreen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnGreen.setBounds(64, 302, 297, 47);
		contentPane.add(rdbtnGreen);
		
		JLabel lblNewLabel = new JLabel("SELECT TO CHANGE BACKGROUND:");
		lblNewLabel.setBounds(16, 20, 630, 39);
		contentPane.add(lblNewLabel);
	}
	
	/**
	 * handle action event to change background
	 */
	void handleChangeBackground( String button )
	{
		int confirm = JOptionPane.showConfirmDialog(contentPane, "Are you sure to change window background?");
		if( confirm == 0) {
			switch ( button.toLowerCase() ) {
				case "red":
					this.getContentPane().setBackground(Color.RED);
					break;
				case "yellow":
					this.getContentPane().setBackground(Color.YELLOW);
					break;
				case "white":
					this.getContentPane().setBackground(Color.WHITE);
					break;
				case "gray":
					this.getContentPane().setBackground(Color.GRAY);
					break;
				case "green":
					this.getContentPane().setBackground(Color.GREEN);
					break;
				default:
					JOptionPane.showMessageDialog(contentPane, "Invalid option!");
					break;
			}
		}//if
		
	}
}
