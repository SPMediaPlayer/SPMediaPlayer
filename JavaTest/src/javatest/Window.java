/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javatest;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Markus
 */
public class Window extends Frame{

    Button buttonCopy = null;
    Button buttonExit =  null;
    TextField text1 = null;
    TextField text2 = null;
    
    Window() {
        super("Title");
        
        setSize(500, 200);
        setupUI();        
        
        addWindowListener(new WindowListener() {

            @Override
            public void windowClosing(WindowEvent e) {
                setVisible(false);
                System.exit(0);
            }

            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });
        
    }
    
    final void setupUI() {
        
        List list = new List(10);
        list.add("First");
        list.add("Second");
        list.add("Third");
        
        buttonCopy = new Button("Press me!");
        buttonCopy.addActionListener(new onButtonCopyClick());
        buttonExit = new Button("Exit");
        buttonExit.addActionListener(new onButtonExitClick());
        
        text1 = new TextField("First field");
        text2 = new TextField("Second field");
        
        
        setLayout(new FlowLayout());
        
        add(buttonCopy);
        add(buttonExit);
        add(text1);
        add(text2);
        
        
    }
    
    
    class onButtonCopyClick implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            text2.setText(text1.getText());
        }
        
    }
    
    class onButtonExitClick implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            System.exit(0);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(0xFF, 0x00, 0x00));
        g.drawLine(0, 100, 500, 100);
    }
    
    
}
