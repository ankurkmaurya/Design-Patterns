package com.ankurmaurya.structural.flyweight;

import java.util.HashMap;
import java.util.Map;


//Flyweight Implementation - Data Caching 
public class PenFactory {

	private static final Map<String, Pen> pensMap = new HashMap<>();
	
	public static Pen getPen(BrushSize brushSize, String color) 
	  {
	    String key = brushSize + "-" + color;
	    Pen pen = pensMap.get(key);
	     
	    if(pen != null) {
	      return pen;
	    } else {
	    	switch(brushSize) {
	    	case THICK:
	    		pen = new ThickPen(color);
	    		pen.setBrushSize(brushSize);
	    		pensMap.put(key, pen);
	    		break;
			case MEDIUM:
				pen = new MediumPen(color);
	    		pen.setBrushSize(brushSize);
	    		pensMap.put(key, pen);
				break;
			case THIN:
				pen = new ThinPen(color);
	    		pen.setBrushSize(brushSize);
	    		pensMap.put(key, pen);
				break;
			default:
				break;
	    	}
	    }
	     
	    return pen;
	  }
	
	private PenFactory() {}
	
}
