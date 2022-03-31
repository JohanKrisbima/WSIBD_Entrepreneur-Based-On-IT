/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu_7.Tugas;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author toshiba
 */
public class DrawShapes {
    Font font;
    Color redColor;
    Color blueColor;
    Color backgroundColor;
    public void init() {
        //the font is Arial size, 18 and is iatlicized
        font = new Font ("Arial", Font.ITALIC,18);
        
        //some colors are predefined in the color class
        redColor = Color.red;
        backgroundColor = Color.orange;
        
        //colors can be created using red,green,blue values
         blueColor = new Color(0,0,122);
         
    }
    public void stop() {
        
    }
    public void paint (Graphics graph) {
        //set font
        graph.setFont(font);
        //create a tittle
        graph.drawString("Draw Shapes", 90,20);
        //set color for the first shape
        graph.setColor(blueColor);
        
        //draw a rectangle using draw (int x, y , int width, height)
       
        graph.drawRect(120, 120, 120, 120);
        
        //this will fill a rectangle
        graph.fillRect(115,115,90,90);
        
        //set the color for the next shape
        graph.setColor(redColor);
        
        //draw a circle using draw Arc(int x,y, int weidth, height,int startAngle, arcAngle
        graph.fillArc(110,110,50,50,0,360);
        
        //set color for next shape
        graph.setColor(Color.CYAN);
        
        //draw another rectangle
        graph.drawRect(50, 50, 50, 50);
        
        //this will fill a rectangle
        graph.fillRect(50, 50, 60, 60);
        
        
        
    }
}
