import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;
 
public class My201720951One  extends JFrame implements ActionListener {
    JLabel lblDisplay, lblOutput;
    JButton btnRock, btnPaper, btnScissor;
    JPanel panel;
    final int ROCK = 0;
    final int PAPER = 1;
    final int SCISSOR = 2;
    int winHuman = 0, winCom = 0;
    
    My201720951One () {
    	setTitle("가위 바위 보 (201720951 신윤수)");
        lblDisplay = new JLabel();
        lblOutput = new JLabel();
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3));
        btnScissor = new JButton("0:가위");
        btnRock = new JButton("1:바위");
        btnPaper = new JButton("2:보");
        lblDisplay.setText("아래의 버튼 중 하나를 클릭하시오!");
        lblOutput.setText("Good Luck!");
 
        panel.add(btnScissor);
        panel.add(btnRock);
        panel.add(btnPaper);
               
        add(lblDisplay, BorderLayout.NORTH);
        add(lblOutput, BorderLayout.SOUTH);
 
        add(panel, BorderLayout.CENTER);
        
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        btnRock.addActionListener(this);
        btnPaper.addActionListener(this);
        btnScissor.addActionListener(this);        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        Random r = new Random();
        int computer = r.nextInt(3);
        
        if(e.getSource()== btnRock ) {
            if(computer == ROCK) {
            	lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 비겼음" );
            }
            else if (computer == PAPER) {
            	winCom++;
                lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 컴퓨터 승리");
            }
            else {
            	winHuman++;
                lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 인간 승리");
            }
        }
        else if(e.getSource() == btnPaper ) {
	        if(computer == ROCK) {
	        	winHuman++;
	            lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 인간 승리");
	        }
            else if (computer == PAPER) {
                lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 비겼음");
 
            }
            else {
            	winCom++;
                lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 컴퓨터 승리");
            }
        }
        else {
            if(computer == ROCK) {
            	winCom++;
                lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 컴퓨터 승리");
            }
                else if (computer == PAPER) {
                	winHuman++;
                    lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 인간 승리");
                }
                else {
                    lblOutput.setText("인간 : " + winHuman + "컴퓨터 : " + winCom + "결과 : 비겼음");
                }
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        new My201720951One ();
 
    }
}

 