/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day11;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author viest
 */
public class Day11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(new Runnable(){
        @Override
            public void run(){
                    JFrame frame = new JFrame();
                    frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    frame.getContentPane().add(new Kalkulators());                             //Panelis - klases nosaukums
                    frame.pack();
                    frame.setVisible(true);
                }
            });
    }
    
}
