package shape.controller;

import shape.view.DrawingFrame;

public class DrawingController 
{
    private DrawingFrame baseFrame;
    
    public void start()
    {
	
    }
    
    public DrawingController()
    {
	setBaseFrame(new DrawingFrame(this));
	
    }

    public DrawingFrame getBaseFrame() 
    {
	return baseFrame;
    }

    public void setBaseFrame(DrawingFrame baseFrame) 
    {
	this.baseFrame = baseFrame;
    }
}
