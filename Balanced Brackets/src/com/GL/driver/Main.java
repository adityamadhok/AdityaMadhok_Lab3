package com.GL.driver;

import com.GL.operations.CheckBalance;

public class Main {

	public static void main(String[] args) {

		boolean check;
		String exp1 = "{2*(a+b)/3}+{(c-b)/[a/f]}";
		String exp2 = "( [ [ { } ] ] )";
		String exp3 = "( ((([]{{))}}}]]]";
		String exp4 = "( [ [ { } ] ] ) )";

		CheckBalance obj = new CheckBalance();

		System.out.println("----------------Welcome-------------------");
		System.out.println("for the expression {2*(a+b)/3}+{(c-b)/[a/f]}");
		check = obj.check(exp1);
		if (check) {
			System.out.println("the given expression is balanced !");

		} else {
			System.out.println("the given expression is not balanced !");
		}
		System.out.println("for the expression ( [ [ { } ] ] )");
		check = obj.check(exp2);
		if (check) {
			System.out.println("the given expression is balanced !");

		} else {
			System.out.println("the given expression is not balanced !");
		}
		System.out.println("for the expression ( ((([]{{))}}}]]]");
		check = obj.check(exp3);
		if (check) {
			System.out.println("the given expression is balanced !");

		} else {
			System.out.println("the given expression is not balanced !");
		}
		System.out.println("for the expression ( [ [ { } ] ] ) )");
		check = obj.check(exp4);
		if (check) {
			System.out.println("the given expression is balanced !");

		} else {
			System.out.println("the given expression is not balanced !");
		}

	}

}
