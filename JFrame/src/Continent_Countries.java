import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;

public class Continent_Countries extends Frame implements ItemListener{

	String[] continent = {"Asia", "Europe", "Africa", "America"};
	String[][] countries = {
			{"Korea", "China", "India", "Singapore", "Thailand"},
			{"Spain", "Portugal", "Greece", "Germany", "Italia"},
			{"Nigeria", "Tanzania", "Cameroon", "Madagascar"},
			{"Canada", "Mexico", "Peru", "Colombia", "Argentina", "Chile"}
	};

	Choice ch1, ch2;
	Label lb2;

	Continent_Countries() {
		setTitle("Country choice");

		Panel p1 = new Panel();
		Panel p2 = new Panel();
		Panel p3 = new Panel();

		p1.setBackground(Color.cyan);
		p2.setBackground(Color.PINK);
		p3.setBackground(Color.yellow);
		super.add(p1, BorderLayout.NORTH);
		this.add(p2, BorderLayout.CENTER);
		//add("South", p3);

		Label lb1 = new Label("Select Continent and Country.");
		p1.add(lb1);

		lb2 = new Label();
		p3.add(lb2);
		add("South", lb2);
		lb2.setAlignment(Label.CENTER);
		lb2.setBackground(Color.yellow);

		ch1 = new Choice();
		ch2 = new Choice();
		p2.add(ch1);
		p2.add(ch2);

		ch1.addItemListener(this);
		ch2.addItemListener(this);

		for(int i=0; i<continent.length; i++) {
			ch1.add(continent[i]);
		}

		ch2.add("                   ");
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Continent_Countries();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		//System.out.println("Here");
		String str = "You selected: ";
		Object obj = e.getSource();
		if(obj == ch1) {
			ch2.removeAll();
			int index = ch1.getSelectedIndex();
			//System.out.println(index);
			for(int i=0; i<countries[index].length; i++) {
				ch2.add(countries[index][i]);
			}
		}
		else { //ch2
			str += ch1.getSelectedItem();
			str += " and " + ch2.getSelectedItem();
			lb2.setText(str);

		}
	}

}
