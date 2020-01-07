package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> names = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton ("Add Name");
	JButton view = new JButton ("View Names");
	void setup() {
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		add.addActionListener(this);
		view.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(add)) {String x = JOptionPane.showInputDialog("Enter a name.");
		names.add(x);
		}
		else {for (int y = 0; y < names.size(); y++)
				{JOptionPane.showMessageDialog(null, "Guest "+(y+1)+": "+names.get(y)+"\n");}}
	}
}
