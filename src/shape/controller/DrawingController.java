package shape.controller;

import shape.view.DrawingFrame;

public class DrawingController 
{
    private DrawingFrame baseFrame;
    
    public DrawingController()
    {
	baseFrame = new DrawingFrame(this);
	
    }
}
