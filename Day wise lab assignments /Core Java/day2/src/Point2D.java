/*Create a  class Point2D   for representing a point in x-y co-ordinate system.

4.1 Create a parameterized constructor to accept x & y co-ords.

4.2 Add  show() method  --to return point's x & y co-ords
eg : public String show() {.....}*/

import java.util.*;
import java.lang.Math;
class Point2D{
	double x;
	double y;
	Point2D(double xo,double yo){
	this.x=xo;
	this.y=yo;
		
	}
	public String show(){
		return "Cordinator are X Cordinator:"+this.x+" Y cordinator :"+this.y;
		
	}
	public boolean isEqual(Point2D point){
		if(this.x==point.x && this.y==point.y){
				return true;
			}
			else {
				return false;
	}}
	public double calculateDistance(Point2D point){
		return Math.sqrt((point.x - this.x)*(point.x - this.x) + (point.y - this.y)*(point.y - this.y));
	}
	
}
