package shape.view;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;

import javax.swing.JPanel;


public class ShapePanel extends JPanel
{
    private ArrayList<Rectangle> rectangleList;
    private ArrayList<Rectangle> squareList;
    private ArrayList<Ellipse2D> ellipseList;
    private ArrayList<Ellipse2D> circleList;
    private ArrayList<Polygon> triangleList;
    private ArrayList<Polygon> polygonList;


    {
	rectangleList = new ArrayList<Rectangle>();
	squareList = new ArrayList<Rectangle>();
	triangleList = new ArrayList<Polygon>();
	polygonList = new ArrayList<Polygon>();
	ellipseList = new ArrayList<Ellipse2D>();
	circleList = new ArrayList<Ellipse2D>();
    }

    public void addRectangle()
    {
	
    }
    
    public void addSquare()
    {
	
    }
    
    public void addEllipse()
    {
	int width = (int) (Math.random() * 1000);
	int height = (int) (Math.random() * 1000);
	int diameter = (int) (Math.random() * 100);
	
	Ellipse2D ellipseList = new Ellipse2D.Double(width, height, diameter, diameter);
	circleList.add(ellipseList);
    }
    
    public void addCircle()
    {
	int xPoint = (int) (Math.random() * 1000);
	int yPoint = (int) (Math.random() * 1000);
	int diameter = (int) (Math.random() * 100);
	
	Ellipse2D circle = new Ellipse2D.Double(xPoint, yPoint, diameter, diameter);
	circleList.add(circle);
    }
    
    public void addTriangle()
    {
	int [] xPoints = new int [3];
	int [] yPoints = new int [3];
	xPoints[0] = (int)(Math.random() * 250);
	yPoints[0] = (int)(Math.random() * 250);
    
	Polygon triangle = new Polygon(xPoints, yPoints, 3);
    }

    public void addPolygon()
    {
	int numberOfSides = (int)(Math.random() * 10) + 3;
	int [] xPoints = new int [numberOfSides];
	int [] yPoints = new int [numberOfSides];
	
		for (int sides = 0; sides < numberOfSides; sides++)
		{
		    xPoints[sides] = (int)(Math.random() * 300);
		    yPoints[sides] = (int)(Math.random()* 300);
		}
		
		Polygon myPolygon = new Polygon(xPoints, yPoints, numberOfSides);
		polygonList.add(myPolygon);
		repaint();
    }
    
    @Override   
    protected void paintComponent(Graphics currentGraphics)
	{
	    super.paintComponent(currentGraphics);
	    
	    Graphics2D mainGraphics = (Graphics2D) currentGraphics;
		
		drawShape(mainGraphics, circleList);
		drawShape(mainGraphics, squareList);
		drawShape(mainGraphics, rectangleList);
		drawShape(mainGraphics, ellipseList);
		drawShape(mainGraphics, triangleList);
		drawShape(mainGraphics, polygonList);
	}
    
    private void drawShape(Graphics2D mainGraphics, ArrayList shapeList)
    {
	for(Object currentShape : shapeList)
	{
	 int red = (int) (Math.random() * 256);
	 int green = (int) (Math.random() * 256);
	int blue = (int) (Math.random() * 256);
	int pencilSize = (int) (Math.random() * 10) + 3;
		    
	 mainGraphics.setColor(new Color(red, blue, green));
	 mainGraphics.setStroke(new BasicStroke(pencilSize));
	if(currentShape instanceof Polygon)
	{
	mainGraphics.draw((Shape)currentShape);
	}
	else
	{
	    mainGraphics.fill((Shape)currentShape);
	}
	}
    }
}