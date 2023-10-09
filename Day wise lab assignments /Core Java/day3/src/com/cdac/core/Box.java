package com.cdac.core;

public class Box {
//data members : state of the object(instance vars) / fields /props/attributes
 private double width;
 private double depth;
 private double height;
  //add a parameterized ctor to init COMPLETE state of the Box
 public Box(double w,double d,double height)
  {
	   width=w;
	   depth=d;
	   this.height=height;
  }
//add overloaded ctor to init a cube (using ctor chaining)
  public Box(double side)
 {
  //  width=depth=height=side;
       this(side,side,side);//matching ctor of the SAME class will be invoked.
 }
 //add overloaded ctor to init a dummy box
  public Box()
{
   //width=depth=height=-1;
   this(-1);
}



  //add an instance method to ret box details(all dims) in a string
  public String getBoxDetails() {
	  
	  //impl arg : this
	  //using "this" keyword : OPTIONAL
	  System.out.println("this from instance method "+this);
	  return "Box dims are "+this.width+" "+this.depth+" "+this.height;
  }
  //add an instance method to ret  computed vol of the Box
  public double getBoxVolume() {
	  return width*depth*height;
  }
//add a non static method to chk equality of 2 boxes
  public boolean isEqual(Box anotherBox)
  {
    //b1.isEqual(b2) => this=b1,     anotherBox=b2
    System.out.println("this from method "+this +" arg "+anotherBox);
    return this.width==anotherBox.width && this.depth==anotherBox.depth &&       this.height==anotherBox.height;
 }
  

}