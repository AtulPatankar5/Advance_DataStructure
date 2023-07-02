package Day5;

import java.util.Stack;

public class InfixToPostFix {

	public static String infixToPostfix(String infix) {
		Stack<Character> s = new Stack<Character>();
		StringBuilder post = new StringBuilder();
		for (int i = 0; i < infix.length(); i++) {

			char sym = infix.charAt(i);
			if (Character.isDigit(sym)) {
				post.append(sym);
			} else if (sym == '(') {
				s.push(sym);
			} else if (sym == ')') {
				while (s.peek() != '(')
					post.append(s.pop());

				s.pop();

			} else {
				while (!s.isEmpty() && pri(s.peek()) >= pri(sym)) {
					post.append(s.pop());
				}
				s.push(sym);
			}
		}
		while (!s.isEmpty())
			post.append(s.pop());
		return post.toString();
	}

	public static int pri(char op) {
		switch (op) {
		case '$':
			return 3;
		case '*':
			return 2;
		case '/':
			return 2;
		case '%':
			return 2;
		case '+':
			return 1;
		case '-':
			return 1;

		}
		return 0;
	}

	public static void main(String[] args) {
		String infix = "5+9-4*(8-6/2)+1$(7-3)";
		String postfix = "";
		String prefix = "";
		postfix = infixToPostfix(infix);
		System.out.println(postfix);
	}

}
