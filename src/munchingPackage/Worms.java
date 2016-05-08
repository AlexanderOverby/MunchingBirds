package munchingPackage;

import java.awt.Color;
import java.util.Random;

import objectdraw.ActiveObject;
import objectdraw.DrawingCanvas;
import objectdraw.FilledRect;

public class Worms extends ActiveObject

{
	// FilledRect[] = wormNumber = {wormcube1,wormcube2,wormcube3,wormcube4,wormcube5};
	public int speedX,speedY;
	public double WormCubeX,WormCubeY;
	public int WormCubeColor;
	public DrawingCanvas canvas;
	public FilledRect wormcube;
	public int width,height;
	public Random rand;
	
	
	public Worms(DrawingCanvas c)
	{
		canvas=c;
		Color WormCubeColor=new Color(153,76,0);
		WormCubeX=canvas.getWidth()*.38;
		WormCubeY=500;
		width=20;
		height=50;
		rand = new Random();
		
		
		
		wormcube=new FilledRect(WormCubeX,WormCubeY, width, height, canvas);
		wormcube.setColor(WormCubeColor);
		start();
	}
	
	public void run()
	
	{
		
		while(true)
		{
			wormcube.move(-2, 0);
			if(wormcube.getX()<0)
			{
				
				wormcube.moveTo(rand.nextInt(300)+canvas.getWidth(),500);
				
			}
			
			pause(10);
		}
		
	}
	
}
