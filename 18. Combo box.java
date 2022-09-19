import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class comboBox extends JFrame {

	private JTextField tf = new JTextField(10);
	JComboBox<String> result = new JComboBox<String>();	
	
	public comboBox() {
		setTitle("콤보박스 추가");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(tf);	
		c.add(result);
				
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				result.addItem(t.getText());
			}
		});
		
		setSize(300,300);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new comboBox();
	}
}
