package munchingPackage;

import objectdraw.*;

public class MunchingMain extends WindowController{

	public Bird Cheese;
	public Cat Potato;
	public Worms Cookie;

	public static void main(String[] args) 
	
	{
		new MunchingMain().startController(1280,720);
		
		
	}
	
	public void begin()
	{
		 Cheese = new Bird (canvas);
		 Cookie = new Worms (canvas);
		 Potato = new Cat (canvas);
		 
	}
	
	public void onMouseClick(Location point)
	{
		Cheese.onMouseClick(point);
	}

}
