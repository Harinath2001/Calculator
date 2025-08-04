package com.elavatelabs;

import java.util.Scanner;

public class CalculateBasic {
	public static void main(String[] args) {
	int opr;
	System.out.println("choose the operator");
    System.out.println(" 1.additon\n 2.substraction\n 3.multiplication\n 4.div");
	Scanner sc =new Scanner(System.in);
	opr=sc.nextInt();
	System.out.println("enter the number");
	Double n1=sc.nextDouble();
	System.out.println("enter the number");
	Double n2=sc.nextDouble();
	double res=0;
	switch(opr) {
	case 1 :
	   res=n1+n2;
	   break;
	case 2 :
		res=n1-n2;
		break;
	case 3 :
		res=n1*n2;
		break;
	case 4 :
		res= n1/n2;
		break;
	default :
		System.out.println("enterd invalid number");
	}
	   System.out.println("resut is:"+res);
	}
}
