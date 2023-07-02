package Day5;

import java.util.Stack;

public class PostFixEvaluation {

	public static int solvePostFix(String post) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < post.length(); i++) {
			char sym = post.charAt(i);// get each element one by one

			if (Character.isDigit(sym)) {
				String string = Character.toString(sym);// character to string
				s.push(Integer.parseInt(string));// string to int
			} else {
				int b = s.pop();// get 1st element from stack
				int a = s.pop();// get 2nd element from stack
				int c = calculate(a, b, sym);
				s.push(c);
			}
		}
		return s.pop();
	}

	public static int calculate(int a, int b, char sym) {
		switch (sym) {
		case '*':
			return a * b;
		case '/':
			return a / b;
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '$':
			return (int) Math.pow(a, b);
		case '%':
			return a % b;

		}
		return 0;
	}

	public static void main(String[] args) {
		String postfix = "59+4862/-*-173-$+";
		int result = solvePostFix(postfix);
		System.out.println(result);
	}

}
