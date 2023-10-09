package com.cdac.tester;
import java.util.Scanner;
import com.cdac.core.Box;


class TestBox {
	public static void main(String[] args) {
		//create scanner cls instance to wrap stdin
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of a cube");
		Box cube=new Box(sc.nextDouble());
		System.out.println(cube.getBoxDetails());
		//create dummy Box : inited with all dims -1
		Box dummy=new Box();
		System.out.println(dummy.getBoxDetails());
		System.out.println("Enter box 1 dims");
		Box box1=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
                 System.out.println("Enter box 2 dims");
		Box box2=new Box(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
                 System.out.println(box1.isEqual(box2)?"Same":"Different");

                
	
	}
}