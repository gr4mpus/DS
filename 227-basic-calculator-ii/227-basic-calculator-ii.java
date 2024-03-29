// class Solution {
//     public int getPrecedence(char ch) {
//         if(ch == '-' || ch == '+') {
//             return 1;
//         }else if (ch == '*' || ch == '/') {
//             return 2;
//         }
//         return 0;
//     }
//     public void calculateTopTwo (Stack<Integer> operand, Stack<Character> operator) {
//         int val2 = operand.pop();
//         int val1 = operand.pop();
//         char op = operator.pop();
//         int res = 0;
//         if(op == '-') {
//             res = val1-val2;
//         } else if (op == '+') {
//             res = val1+val2;
//         } else if (op == '*') {
//             res = val1*val2;
//         } else if (op == '/') {
//             res = val1/val2;
//         }
//         operand.push(res);
        
//     }
//     public int calculate(String s) {
//         String str = s.trim();
//         int strLen = str.length();
//         int index = 0;
//         Stack<Integer> operand = new Stack<>();
//         Stack<Character> operator = new Stack<>();
//         while(index < strLen) {
//             if(Character.isDigit(str.charAt(index))) {
//                 String num = "";
//                 while(index<strLen && Character.isDigit(str.charAt(index))) {
//                     System.out.println("num"+num);
//                     num = num + str.charAt(index);
//                     index++;
//                 }
//                 if(num.length() > 0) {
//                     operand.push(Integer.parseInt(num));
//                 }
//             }
//             if(index<strLen && (str.charAt(index) == '-' || str.charAt(index) == '+' || str.charAt(index) == '*' || str.charAt(index) == '/')) {
//                 if(!operator.empty() && getPrecedence(operator.peek()) >= getPrecedence(str.charAt(index))) {
//                     while(!operator.empty() && getPrecedence(operator.peek()) >= getPrecedence(str.charAt(index))) {
//                         calculateTopTwo(operand, operator);
//                     }
//                 }
//                 operator.push(str.charAt(index));
//             }
//             index++;
//         }
//         while(!operator.empty()) {
//             calculateTopTwo(operand, operator);
//         }
//         return operand.peek();
//     }
// }

class Solution {
    public int calculate(String s) {
        if (s == null || s.isEmpty()) return 0;
        int length = s.length();
        int currentNumber = 0, lastNumber = 0, result = 0;
        char operation = '+';
        for (int i = 0; i < length; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == length - 1) {
                if (operation == '+' || operation == '-') {
                    result += lastNumber;
                    lastNumber = (operation == '+') ? currentNumber : -currentNumber;
                } else if (operation == '*') {
                    lastNumber = lastNumber * currentNumber;
                } else if (operation == '/') {
                    lastNumber = lastNumber / currentNumber;
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        result += lastNumber;
        return result;
    }
}