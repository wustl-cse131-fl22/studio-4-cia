package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.rectangle(.5, .5, .5, .25);
		
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledCircle(0.5, 0.5, .15);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(.5, .5, .05);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(.5, .5, .5, .4);
		
	}
}