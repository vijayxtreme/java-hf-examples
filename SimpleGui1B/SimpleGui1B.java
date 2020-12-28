import javax.swing.*;
import java.awt.event.*;

public class SimpleGui1B implements ActionListener {
    JButton button;

    public static void main(String[] args){
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
    //    button = new JButton("click me");

       // button.addActionListener(this); //register your button to the listener

        MyDrawPanel drawPanel = new MyDrawPanel();

       // frame.getContentPane().add(button);
       frame.getContentPane().add(drawPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event){ //Interface actionPerformed method 
                                                    //(you must use if you implement an interface)
        button.setText("I've been clicked!");
    }
}