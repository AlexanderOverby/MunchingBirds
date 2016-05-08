package munchingPackage;

import java.awt.Color;

import objectdraw.ActiveObject;
import objectdraw.DrawingCanvas;
import objectdraw.FilledOval;
import objectdraw.FilledRect;

public class Cat extends ActiveObject
{

	public int speedX,speedY;
	public double CatCubeX,CatCubeY;
	public int CatCubeColor;
	public DrawingCanvas canvas;
	public FilledRect cube;
	
	
	
	public Cat(DrawingCanvas c)
	{
		Color CatCubeColor=new Color(64,64,64);
		canvas=c;
		CatCubeX=canvas.getWidth()*.1;
		CatCubeY=420;
		
		
		
		cube=new FilledRect(CatCubeX,CatCubeY,CatCubeX, CatCubeX, canvas);
		cube.setColor(CatCubeColor);
		start();
	}
	
	public void run()
	
	{
		
	}
	
}
