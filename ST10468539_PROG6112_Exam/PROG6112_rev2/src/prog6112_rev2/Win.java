/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog6112_rev2;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class Win extends JFrame implements ItemListener { 
    
    public JComboBox c1; 
    public JLabel l1; 
    
    public void drop() {
        JFrame win = new JFrame("testGUI"); 
        win.setSize(300, 200); 
        win.setLayout(new FlowLayout()); 
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        JButton button = new JButton("click me"); 
        win.add(button); 
        
        //======================objects================================
        JTextField header = new JTextField("print button"); 
        JTextArea subHeader = new JTextArea("click this button, "
                + "and text will be printed"); 
        win.add(header); 
        win.add(subHeader); 
        
        
        String[] options = {"option 1", "option 2", "option 3"}; 
        c1 = new JComboBox(options); 
        
        c1.setSelectedIndex(3);
        
        Win s = new Win();
        c1.addItemListener(s);

        c1.setEditable(true);
        
        win.add(c1); 
        
        
        
        
        
        JCheckBox check = new JCheckBox("accept terms"); 
        win.add(check); 
        
        if(check.isSelected()) System.out.println("box ticked");
        
        //=====================Make it visible========================
        win.setVisible(true); 
    }
    
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource() == c1) {
            l1.setText(c1.getSelectedItem() + " selected");
        }
    }
}