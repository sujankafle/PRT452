package com.sujan.learn;

import java.util.Scanner;

public class StraightLineCalculation implements Grad, Dist, Equ {

	@Override
	public String equ(double x1, double y1, double grad) {
		// TODO Auto-generated method stub
		double output = y1 - (grad*x1);
		String res= "y -"+grad+"x =" +output;
		return res;
		}

	@Override
	public double dist(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double res = Math.sqrt((x2 - x1)*(x2 - x1)+ (y2 - y1)*(y2 - y1));
		return res;
	}

	@Override
	public double grad(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		double res= (y2 - y1)/(x2 - x1);
		return res;
	}
	public static void main(String[] args){
		double x1, x2, y1, y2;
		double dist;
		double grad;
		String equ;
		
		final StraightLineCalculation StLineCalc;
		StLineCalc= new StraightLineCalculation();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the x1 coordinate for point 1: ");
		x1 = scan.nextInt();
		System.out.println("Enter the y1 coordinate for point 1: ");
		y1 = scan.nextInt();
		System.out.println("Enter the x2 coordinate for point 2: ");
		x2 = scan.nextInt();
		System.out.println("Enter the y2 coordinate for point 2: ");
		y2 = scan.nextInt();
		
		grad = StLineCalc.grad(x1, y1, x2, y2);
		dist = StLineCalc.dist(x1, y1, x2, y2);
		equ = StLineCalc.equ(x1, y1, grad);
		
		System.out.println("The distance between two points is: "+dist+".");
		System.out.println("The gradient between two points is: "+grad+".");
		System.out.println("The equation of line between two points is: "+equ+".");
	}

}
