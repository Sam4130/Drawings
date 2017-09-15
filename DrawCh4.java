/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics; 
import javax.swing.JPanel; 
/**
 *
 * @author sam
 */
public class DrawCh4 extends JPanel
{
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g); 
        
        int width = getWidth(); 
        int height = getHeight(); 
        
        g.drawLine(0, 0, height, width);
        g.drawLine(100, 0, height, width);
        g.drawLine(200, 0, height, width); 
        g.drawLine(300, 0, height, width);
        g.drawLine(400, 0, height, width);
        g.drawLine(500, 0, height, width);
        g.drawLine(600, 0, height, width);
        g.drawLine(700, 0, height, width);
        g.drawLine(800, 0, height, width);
        g.drawLine(900, 0, height, width);
                
        g.drawLine(0, 900, height, height);
        
       
    }
   
    
}
