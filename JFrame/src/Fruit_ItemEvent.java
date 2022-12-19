import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Fruit_ItemEvent extends JFrame{

	Container contentPane;
	String[] text = {"Apple", "Pineapple", "Cherry"};

	JRadioButton[] radio = new JRadioButton[3];

	ImageIcon[] image = {
			new ImageIcon("images/apple.png"),
			new ImageIcon("images/pineapple.png"),
			new ImageIcon("images/cherry.png")
	};

	JLabel imageLabel = new JLabel();

	Fruit_ItemEvent() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();

		JPanel radioPanel = new JPanel();
		Font font = new Font("sanSerif", Font.BOLD, 20);

		ButtonGroup group = new ButtonGroup();

		for(int i=0; i<text.length; i++) {
			radio[i] = new JRadioButton(text[i]);
			radio[i].setFont(font);
			radioPanel.add(radio[i]);
			group.add(radio[i]);
			radio[i].addItemListener(new MyItemListener());

		}
		radio[0].setSelected(true);

		radioPanel.setBackground(Color.GRAY);
		contentPane.add(radioPanel, BorderLayout.NORTH);
		contentPane.add(imageLabel, BorderLayout.CENTER);
		imageLabel.setHorizontalAlignment(SwingConstants.CENTER);

		setSize(750,700);
		setVisible(true);

	} //Constructor

	class MyItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println("here");

			//Object obj = e.getSource();
			if(radio[0].isSelected()) {
				imageLabel.setIcon(image[0]);
			}
			else if(radio[1].isSelected()) {
				imageLabel.setIcon(image[1]);
			} 
			else {
				imageLabel.setIcon(image[2]);
			}
		}
	}

	public static void main(String[] args) {
		new Fruit_ItemEvent();
	}

}
