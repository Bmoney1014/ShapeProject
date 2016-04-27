package shape.view;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.*;

import shape.controller.DrawingController;

public class DrawingPanel extends JPanel
{
    private DrawingController baseController;
    private ShapePanel shapePanel;
    private JButton addRectangButton;
    private SpringLayout baseLayout;
    private ArrayList<Rectangle> rectangleList;
    
    public DrawingPanel(DrawingController basController)
    {
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	addRectangButton = new JButton("Add a Rectangle");
	rectangleList = new ArrayList<Rectangle>();
	shapePanel = new ShapePanel();
	
	setupPanel();
	setupLayout();
	setupListeners();
    }
    
    private void setupPanel()
    {
	this.setLayout(baseLayout);
	this.setBackground(Color.DARK_GRAY);
	this.add(addRectangButton);
	this.add(shapePanel);
    }
    
    private void setupLayout()
    {
	
    }
    
    private void setupListeners()
    {
	
    }
}
