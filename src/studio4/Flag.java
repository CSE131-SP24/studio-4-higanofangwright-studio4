package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(0,0,0);
		StdDraw.rectangle(.5, .5, .5, .3);
		StdDraw.setPenColor(64,115,67);
		StdDraw.filledRectangle(.5,.26,.5,.06);
		StdDraw.setPenColor(39,68,156);
		StdDraw.filledRectangle(.833, .56, .167, .24);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(.833, .68, .04167);
		StdDraw.filledCircle(.925, .44, .04167);
		StdDraw.filledCircle(.75, .44, .04167);
	}
}