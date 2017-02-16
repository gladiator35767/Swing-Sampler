import java.awt.*;
import java.util.Scanner;

import javax.swing.*;
//COMMENT CMOMENT COMMENT CMOMENT

public class MyCanvas extends Canvas 
	{
	private static final long	serialVersionUID	= 1L;
 
    	public static void main(String[] args) 
    		{
	        MyCanvas canvas = new MyCanvas();
	        JFrame frame = new JFrame();
	        frame.setSize(1000, 1000);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.getContentPane().add(canvas).setBackground(Color.white);
	        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
	        frame.setResizable(true);
	        frame.setVisible(true);
    		}
 
    	public void paint(Graphics graphics) 
    		{
    			        
//          graphics.setColor(Color.black);
//	        graphics.drawLine(500, 0, 0, 500);
//	        
//	        graphics.setColor(Color.black);
//	        graphics.drawLine(0, 0, 500, 500);
//	        
//	        graphics.setColor(Color.black);
//	        graphics.fillRect(0, 0, 800, 800);
// 		
//    		graphics.setColor(Color.red);
//    		graphics.drawRect(10, 10, 950, 950);
//    			
//    		graphics.setColor(Color.blue);	
//    		graphics.drawRect(700, 700, 100, 100);
//    		
//    		graphics.setColor(Color.yellow);
//    		graphics.fillRect(701, 701, 99, 99);
//    			
//    		graphics.setColor(Color.yellow);
//    		graphics.fillOval(1, 2, 800, 800);
//    		
//    		graphics.setColor(Color.black);
//    		graphics.fillRect(150, 151, 200, 200);
//    		
//    		graphics.setColor(Color.black);
//    		graphics.fillRect(450, 151, 200, 200);
//    		
//    		graphics.setColor(Color.white);
//    		graphics.fillOval(200, 450, 400, 100);
//    		
//    		}
    		
    		
    		
    			
	        
	        for (int i = 0; i < 350; i++)
	        	{
		        graphics.setColor(Color.green);
		        graphics.fillRect(300, i, 50, 50);
		        
		        delay();
		        
		        graphics.setColor(Color.white);
		        graphics.fillRect(300, i, 50, 50);
	        	}
    		}
    	
    		public void delay()
    			{
    	        try
    					{
    					Thread.sleep(50);
    					} catch (InterruptedException e)
    					{
    					e.printStackTrace();
    					}
    			}
    	}
	