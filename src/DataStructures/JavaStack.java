package DataStructures;

import java.util.*;

public class JavaStack {
    static HashMap<Character, Character> parentheses = new HashMap<>() {{
       put('{', '}');
       put('(', ')');
       put('[', ']');
    }};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            Stack<Character> stack = new Stack<>();
            String input = scanner.next();
            try {
                for (char c : input.toCharArray()) {
                    if (parentheses.containsKey(c)) {
                        stack.push(c);
                    }
                    if (parentheses.containsValue(c)) {
                        char popped = stack.pop();
                        if (c != parentheses.get(popped)) {
                            throw new Exception();
                        }
                    }
                }
                if (!stack.empty()) {
                    throw new Exception();
                }
            } catch (Exception ex) {
                System.out.println(false);
                continue;
            }
            System.out.println(true);
        }
    }
}
