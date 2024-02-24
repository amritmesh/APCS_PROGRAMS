package edu.wwp.apcs.pkg1;
import apcslib.DrawingTool;
import apcslib.SketchPad;
import java.awt.Color;

public class BullsEyeLoop
{
    public static void main(String[] args)
    {  
        DrawingTool marker;
        SketchPad poster;

        poster = new SketchPad(600,600);
        marker = new DrawingTool(poster);

        for (int x = 1; x<=250; x+=5)
        {
           marker.setColor(new Color(x,x,x));
            marker.drawCircle(x);
        }
    }
}
