
package st10468539_prog6112_exam_q2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/* Fetched code from Geeks for Geeks for creating and designing JFrame GUIs 
https://www.geeksforgeeks.org/java/introduction-to-java-swing/ */

public class ST10468539_PROG6112_exam_Q2 {

    public static void main(String[] args) {
        ST10468539_PROG6112_exam_Q2 inst = new ST10468539_PROG6112_exam_Q2(); 
        inst.Gui(); 
    }
    
    void Gui(){ // main function 
        
        /* Fetched code from Geeks for Geeks for creating new JFrame object 
        https://www.geeksforgeeks.org/java/java-jframe/ */
        
        // Frame object Created
        JFrame f = new JFrame(); 
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Load Button  created
        Button loadButt = new Button("Load Product Data");
        loadButt.setBounds(100, 50, 50, 50);
        
        // Save Button created
        Button saveButt = new Button("Save Product Data");
        saveButt.setBounds(100, 50, 50, 50);
        
        /* Fetched code from Oracle for implementing JTextAreas 
        https://docs.oracle.com/javase/tutorial/uiswing/components/textarea.html */ 
        
        // text area created 
        JTextArea textArea = new JTextArea(
            "This is an editable JTextArea. " +
            "A text area is a \"plain\" text component, " +
            "which means that although it can display text " +
            "in any font, all of the text is in the same font."
        );
        textArea.setPreferredSize(new Dimension(250, 250));
        
        /* Fetched code from Geeks for Geeks for implementing Jlabel  
        https://www.geeksforgeeks.org/java/java-jframe/ */ 
        
        // Create label
        JLabel label = new JLabel("Geeks Premier League 2023");
        
        /* Fetched code from Geeks for Geeks for implementing panels
        https://www.geeksforgeeks.org/java/java-swing-jpanel-with-examples/ 
        
        Fetched code from TutorialsPoint for implementing FlowLayout 
        https://www.tutorialspoint.com/what-is-a-layoutmanager-and-types-of-layoutmanager-in-java */
        
        // Creating the panel 
        JPanel p = new JPanel();
        // set panel layout to FlowLayout 
        p.setLayout(new FlowLayout(FlowLayout.CENTER)); 
        // adding components 
        p.add(loadButt);
        p.add(saveButt);
        p.add(textArea);
        p.add(label);
        // setbackground of panel
        p.setBackground(Color.red);
        // Adding panel to frame
        f.add(p);
        
        // customise frame 
        f.setSize(300, 500);
        f.setVisible(true);
    }
}

//=====================================================================
// END-OF-FILE 
//=====================================================================