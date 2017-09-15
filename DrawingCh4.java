/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JFrame; 
/**
 *
 * @author sam
 */
public class DrawingCh4 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        DrawCh4 panel = new DrawCh4(); 
        
        JFrame application = new JFrame(); 
        
        application .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel); 
        application.setSize(1000 , 1000);
        application.setVisible(true);
           
    }
    
}
