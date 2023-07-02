package Day5;

import java.util.Stack;

public class InfixToPreFix {

	public static String infixToPrefix(String infix) {
		Stack<Character> s = new Stack<Character>();
		StringBuilder pre = new StringBuilder();
		for (int i = infix.length() - 1; i >= 0; i--) {

			char sym = infix.charAt(i);
			if (Character.isDigit(sym)) {
				pre.append(sym);
			} else if (sym == ')') {
				s.push(sym);
			} else if (sym == '(') {
				while (s.peek() != ')')
					pre.append(s.pop());
				s.pop();

			} else {
				while (!s.isEmpty() && pri(s.peek()) > pri(sym)) {
					pre.append(s.pop());
				}
				s.push(sym);
			}
		}
		while (!s.isEmpty())
			pre.append(s.pop());
		return pre.reverse().toString();
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
		String prefix = "";
		prefix = infixToPrefix(infix);
		System.out.println(prefix);
	}

}
