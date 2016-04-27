package shape.view;

import shape.controller.DrawingController;

public class DrawingFrame 
{
    private DrawingPanel basePanel;
    
    public DrawingFrame(DrawingController baseController)
    {
	basePanel = new DrawingPanel(baseController);
	
    }
    
}
