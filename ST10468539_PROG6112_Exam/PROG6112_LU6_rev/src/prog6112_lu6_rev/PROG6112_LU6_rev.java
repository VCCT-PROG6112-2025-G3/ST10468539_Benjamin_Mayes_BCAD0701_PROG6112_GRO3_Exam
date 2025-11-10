
package prog6112_lu6_rev;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PROG6112_LU6_rev {

    public static void main(String[] args) {
        // Create a window (JFrame)
        JFrame win = new JFrame("My First GUI");
        win.setSize(700, 300);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a panel to hold components
        JPanel panel = new JPanel();
        win.add(panel);
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.RED);
        
        JLabel label = new JLabel("you can't enter text here"); 
        label.setToolTipText("icon description"); 
        panel.add(label); 
                
        //======================objects================================
        JTextField header = new JTextField("print button"); 
        
        JTextArea subHeader = new JTextArea(""); 
        
        JScrollPane scrollPane = new JScrollPane(subHeader);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(100, 100)); 

        panel.add(header); 
        //panel.add(subHeader); 
        panel.add(scrollPane); 
        
        //=====================Create a button=========================
        JButton button = new JButton("Click to print");
        panel.add(button);
        
        // Add an event listener to the button
        button.addActionListener( new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                //String strInput= inputBar.getText(); 
                //output.setText(strInput);
            } 
        } );
        
        /*
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked at: " + e.getX() + ", " + e.getY());
            }
        });
        */
        
        //=====================Make it visible========================
        win.pack(); // Adjusts the frame size to fit its contents
        win.setVisible(true); 
    }
    
}
