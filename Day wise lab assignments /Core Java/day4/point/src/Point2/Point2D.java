package Point2;
//import java.util.*;

public class Point2D 
{
	private int x,y;
	public Point2D(int a, int b)
	{
		x=a;
		y=b;
	}

	public String show()
	{
		return "\nThe coordinater of the plane are X:"+x+" Y:"+y+"\n";
		
	}
	public boolean isEqual(Point2D obj)
	{
		if(this.x==obj.x && this.y == obj.y)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
