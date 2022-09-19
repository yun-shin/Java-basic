import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Random;

public class NumberPuzzle extends JFrame {
	private Random number = new Random(); 
	private String num[] = new String [16], str;
	private int a[] = new int[16];
	private JButton[] btn = new JButton[num.length];
	private int count = 0, check = 0;

	public NumberPuzzle () {
		setTitle("4 × 4 Puzzle(201720951_신윤수)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		// 배치관리자 설정
		c.setLayout(new GridLayout(4, 4));

		for(int i=0; i<num.length; i++) {
			num[i] = String.valueOf(number.nextInt(16) + 1);
			for(int j=0; j<i; j++) {
				if(num[i].equals(num[j])) {
					i--;
					break;
				}
			}
		}
				
		for(int i = 0; i<16; i++) {
			btn[i] = new JButton(String.valueOf(num[i]));
			
			if(num[i].equals(String.valueOf(16))) {
				btn[i].setEnabled(false);			// 버튼 숨기기
				btn[i].setText("");
			}
			
			c.add(btn[i]);
			btn[i].addActionListener(new MyActionListener());
		}
		
		
		setSize(500, 300);
		setVisible(true);
	}
	
	private int[] nb = new int[4];
	private void findNeighber(int id) {
		// up
		nb[0] = id - 4;
		
		// down
		nb[1] =  id + 4;
		if(nb[1] >= 16)
			nb[1] = -1;
		
		// left
		nb[2] = id - 1;
		if(nb[2] < 0 || nb[2] % 4 == 3)
			nb[2] = -1;
		
		// right
		nb[3] = id + 1;
		if(nb[3] % 4 == 0)
			nb[3] = -1;
	}
	
	private class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			String a = e.getActionCommand();
			
			int id;
			
			for(id = 0; id<16; id++) {													// 우리가 누른 버튼이 어딧는지 체크
				if(b == btn[id])
					break;
			}
			
			findNeighber(id);
			
			for(int i=0; i<4; i++) {
				if(nb[i] >= 0 && !btn[nb[i]].isEnabled()) {								// 이웃 버튼이 음수가 아니고, 비활성화된버튼이 존재하면
					JButton act, inact;
					act = btn[id];														// 우리가 누른 버튼
					inact = btn[nb[i]];													// 기존에 비활성화된 버튼
					inact.setText(act.getText());										// 기존의 비활성화된 버튼에 기존 활성화된 버튼의 id를 넣음
					act.setText("");													// 기존의 활성화의 id를 지움
					inact.setEnabled(true);												// 기존의 비활성화는 활성화
					act.setEnabled(false);												// 기존의 활성화는 비활성화
					
					count++;															// 이동횟수
					setTitle("이동횟수 : " + count + "회(201720951_신윤수)");				// 이동횟수 체크
					if(count > 300) {
						setTitle("이동횟수 : 300회 - 실패(201720951_신윤수)");
						for(int j=0; j<16; j++) {										// 실패하면 싹다 비활성화
							btn[j].setEnabled(false);
						}
					}
					
					for(int j=0; j<16; j++) {
						str = btn[j].getText();											// 버튼의 id를 str에 넣음
						if(str.equals(String.valueOf(j + 1))){ check++; }				// str과 j+1를 비교 후 check 증가
					}
					
					if(check > 14)																			// check 가 14이상이면 성공
						setTitle("이동횟수 : " + count + "회 - 성공(201720951_신윤수)");
					check = 0;
				}			
			}
		}
	}
	
	public static void main(String[] args) {
		new NumberPuzzle ();
	}

}