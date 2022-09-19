
import javax.swing.*;
import java.awt.*;

public class TenColorButton extends JFrame {

	public TenColorButton () {
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// 배치관리자 설정
		c.setLayout(new GridLayout());
		
		String[] num = new String[10];
		// 빨강, 오렌지, 노랑, 초록, 하늘, 파랑, 마젠타, 회색, 핑크, 실버
		Color[] btnColor = { new Color(255,0,0),  new Color(255,128,0),  new Color(255,255,0),  new Color(0,255,0),  new Color(0,255,255), 
				 			 new Color(0,0,255),  new Color(255,0,255),  new Color(128,128,128),  new Color(255,216,216),  new Color(192,192,192)};
		JButton[] btn = new JButton[num.length];
		
		for(int i=0; i<10; i++) {
			num[i] = String.valueOf(i);;
		}

		for(int i=0; i<10; i++) {
			btn[i] = new JButton(num[i]);				
			btn[i].setBackground(btnColor[i]);
			c.add(btn[i]);
		}
		
		setSize(800, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TenColorButton ();
	}

}
