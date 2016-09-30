import java.awt.Color;

import gpdraw.*;

public class KochCurve
{
	//	DrawingTool draw = new DrawingTool();
	DrawingTool draw = new DrawingTool(new SketchPad(1000, 1000));

	public KochCurve()
	{
		draw.up();
		draw.setDirection(0);
		draw.move(-300, 280);
		draw.setDirection(0);
		draw.down();
	}

	public void DrawKochCurve(int level, int len)
	{
		//		draw.setColor(new Color(Math.random()));
		if (level < 1)
		{
			draw.forward(len);
		}
		else
		{
			DrawKochCurve(level - 1, len / 3);
			draw.turnLeft(60);
			DrawKochCurve(level - 1, len / 3);
			draw.turnRight(120);
			DrawKochCurve(level - 1, len / 3);
			draw.turnLeft(60);
			DrawKochCurve(level - 1, len / 3);
		}
	}

	public void DrawKochSnowflake(int level, int len)
	{
		draw.up();
		draw.setDirection(0);
		draw.move(-300, 100);
		draw.setDirection(0);
		draw.down();

		DrawKochCurve(level, len);
		draw.turnRight(120);
		DrawKochCurve(level, len);
		draw.turnRight(120);
		DrawKochCurve(level, len);
		draw.turnRight(120);
	}

}
