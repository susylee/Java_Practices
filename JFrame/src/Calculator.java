import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator extends JFrame {

	Calculator(String title) {
		super(title);
		setSize(400,200);

		Container contentPane = getContentPane();

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		//p1.setBackground(Color.cyan);
		p2.setBackground(Color.yellow);
		contentPane.add(p1, BorderLayout.CENTER);
		contentPane.add(p2, BorderLayout.SOUTH);

		JTextField text1 = new JTextField(5); //5 size
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);

		p1.add(text1);
		p1.add(new JLabel("+"));
		p1.add(text2);
		p1.add(new JLabel("="));
		p1.add(text3);		

		Button bt1 = new Button("Check");
		Button bt2 = new Button("Reset");

		p2.add(bt1);
		p2.add(bt2);

		bt1.addActionListener(new OKButton(text1, text2, text3));
		bt2.addActionListener(new resetButton(text1, text2, text3));

		pack(); //fit size (setSize X)
		setVisible(true);

	}

	public static void main(String[] args) {
		new Calculator("Calculator");
	}
}

class OKButton implements ActionListener{

	JTextField text1, text2, text3;

	OKButton(JTextField text1, JTextField text2, JTextField text3) {
		this.text1 = text1;
		this.text2=text2;
		this.text3=text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Check clicked");
		try {
			int num1 = Integer.parseInt(text1.getText());
			int num2 = Integer.parseInt(text2.getText());
			int sum = num1+num2;

			text3.setText(String.valueOf(sum)); //num => String

		} catch (NumberFormatException e1) {
			System.out.println("Only enter numbers.");
			JOptionPane.showMessageDialog(null,"Enter only numbers.");
		}
	}
}

class resetButton implements ActionListener{

	JTextField text1, text2, text3;

	resetButton(JTextField text1, JTextField text2, JTextField text3) {
		this.text1 = text1;
		this.text2=text2;
		this.text3=text3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Reset clicked");
		text1.setText("");
		text2.setText("");
		text3.setText("");
	}

}
