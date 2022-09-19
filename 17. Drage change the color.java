import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Drag extends JFrame{
    JPanel contentPane = new JPanel();
    
    Drag(){
        this.setTitle("µå·¡±ë µ¿¾È YELLOW");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setContentPane(contentPane);
        contentPane.setBackground(Color.GREEN);
        contentPane.addMouseMotionListener(new MouseMotionListener(){
        	
            public void mouseDragged(MouseEvent e) {
                contentPane.setBackground(Color.YELLOW);
            }


            public void mouseMoved(MouseEvent e) {
                contentPane.setBackground(Color.GREEN);
            }
            
        });
        
        this.setSize(300,200);
        this.setVisible(true);
        
        contentPane.requestFocus();
    }
}

public class event1 {

    public static void main(String[] args) {
        new Drag();
    }
    
}


