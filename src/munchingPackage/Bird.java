package munchingPackage;

import java.awt.Color;

import objectdraw.ActiveObject;
import objectdraw.DrawingCanvas;
import objectdraw.FilledOval;
import objectdraw.Location;

public class Bird extends ActiveObject

{

	public int diameter,speedX,speedY;
	public double birdballX,birdballY;
	public int ballBirdColor;
	public DrawingCanvas canvas;
	public FilledOval circle;
	public boolean canMove=false;


	public Bird(DrawingCanvas c)
	{
		Color ballBirdColor=new Color(255,0,0); 
		canvas=c;
		diameter=70;
		birdballX=canvas.getWidth()*.7;
		birdballY=120;
		speedX=0;
		speedY=27;

		circle=new FilledOval(birdballX,birdballY,diameter,diameter,canvas);
		circle.setColor(ballBirdColor);
		start();
	}

	public void run()
	{
		while(true)
		{
			if(canMove==true)
			{
				circle.move(speedX,speedY);
				speedY--;
				if(circle.getY()<birdballY+10)
				{
					circle.move(0,10);
					speedY=27;
					canMove=false;
				}
				
			}
			pause(10);
		}

	}

	public void onMouseClick(Location point)
	{
		circle.move(speedX, speedY);
		canMove=true;
	}
}
