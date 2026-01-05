package loopsL7;
import java.util.*;

public class SE {

    static int WIDTH = 3, HEIGHT = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] digitsLines = new String[3];
        for (int i = 0; i < 3; i++) digitsLines[i] = sc.nextLine();
        String[] opsLines = new String[3];
        for (int i = 0; i < 3; i++) opsLines[i] = sc.nextLine();
        String[] exprLines = new String[3];
        for (int i = 0; i < 3; i++) exprLines[i] = sc.nextLine();

        Map<String, String> map = new HashMap<>();

        // normalize spacing by padding each line to same length
        normalizeLines(digitsLines);
        normalizeLines(opsLines);
        normalizeLines(exprLines);

        // Extract patterns for digits 0–9
        extractPatterns(map, digitsLines, "0123456789");

        // Extract operators in given order
        String[] opsSymbols = {"||", "&&", "!", "(", ")"};
        extractPatterns(map, opsLines, opsSymbols);

        // Decode expression
        String expr = decodeExpression(exprLines, map);

        // Print decoded expression (for debugging)
        // System.out.println("Decoded Expression: " + expr);

        // Evaluate
        int result = evaluateExpression(expr);

        System.out.println(result);
    }

    // ✅ Normalizes all lines to the same width by padding with spaces
    static void normalizeLines(String[] lines) {
        int maxLen = 0;
        for (String line : lines)
            maxLen = Math.max(maxLen, line.length());
        for (int i = 0; i < lines.length; i++)
            lines[i] = String.format("%-" + maxLen + "s", lines[i]);
    }

    static void extractPatterns(Map<String, String> map, String[] lines, String symbols) {
        int len = lines[0].length();
        int total = (len + 1) / (WIDTH + 1);
        for (int s = 0; s < total && s < symbols.length(); s++) {
            String pattern = getPattern(lines, s);
            if (!pattern.isEmpty()) map.put(pattern, String.valueOf(symbols.charAt(s)));
        }
    }

    static void extractPatterns(Map<String, String> map, String[] lines, String[] symbols) {
        int len = lines[0].length();
        int total = (len + 1) / (WIDTH + 1);
        for (int s = 0; s < total && s < symbols.length; s++) {
            String pattern = getPattern(lines, s);
            if (!pattern.isEmpty()) map.put(pattern, symbols[s]);
        }
    }

    static String getPattern(String[] lines, int index) {
        StringBuilder bin = new StringBuilder();
        int start = index * (WIDTH + 1);
        for (int r = 0; r < HEIGHT; r++) {
            for (int c = 0; c < WIDTH; c++) {
                int pos = start + c;
                if (pos >= lines[r].length()) continue; // ✅ skip if beyond line length
                char ch = lines[r].charAt(pos);
                bin.append(ch == ' ' ? '0' : '1');
            }
        }
        return bin.toString();
    }

    static String decodeExpression(String[] lines, Map<String, String> map) {
        int len = lines[0].length();
        int total = (len + 1) / (WIDTH + 1);
        StringBuilder sb = new StringBuilder();
        for (int s = 0; s < total; s++) {
            String pattern = getPattern(lines, s);
            sb.append(map.getOrDefault(pattern, ""));
        }
        return sb.toString();
    }

    static int evaluateExpression(String expr) {
        return eval(expr.replaceAll("\\s+", ""), new int[]{0});
    }

    static int eval(String expr, int[] i) {
        Stack<Integer> vals = new Stack<>();
        Stack<Character> ops = new Stack<>();

        while (i[0] < expr.length()) {
            char ch = expr.charAt(i[0]);
            if (Character.isDigit(ch)) {
                int num = 0;
                while (i[0] < expr.length() && Character.isDigit(expr.charAt(i[0]))) {
                    num = num * 10 + (expr.charAt(i[0]) - '0');
                    i[0]++;
                }
                vals.push(num);
                continue;
            } else if (ch == '(') {
                i[0]++;
                vals.push(eval(expr, i));
            } else if (ch == ')') {
                i[0]++;
                break;
            } else if (ch == '!') {
                i[0]++;
                int val = eval(expr, i);
                return ~val;
            } else if (i[0] + 1 < expr.length()) {
                String op2 = expr.substring(i[0], i[0] + 2);
                if (op2.equals("||") || op2.equals("&&")) {
                    i[0] += 2;
                    while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(op2.charAt(0))) {
                        vals.push(applyOp(ops.pop(), vals.pop(), vals.pop()));
                    }
                    ops.push(op2.charAt(0));
                    continue;
                }
            }
            i[0]++;
        }

        while (!ops.isEmpty()) {
            vals.push(applyOp(ops.pop(), vals.pop(), vals.pop()));
        }
        return vals.isEmpty() ? 0 : vals.pop();
    }

    static int precedence(char op) {
        if (op == '|') return 1;
        if (op == '&') return 2;
        return 0;
    }

    static int applyOp(char op, int b, int a) {
        if (op == '|') return a | b;
        if (op == '&') return a & b;
        return 0;
    }
}