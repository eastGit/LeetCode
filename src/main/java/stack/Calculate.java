package stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:  227. 基本计算器 II
 * Created by ldc on 2021/3/22 下午3:15.
 *
 * @author ldc
 */
public class Calculate {

    public int calculate(String s) {
        Deque<Integer> num = new LinkedList<Integer>();
        Deque<Character> ops = new LinkedList<Character>();
        s += "@";
        for (int i=0, n = 0; i< s.length(); i++){
            if(s.charAt(i) == ' '){
                continue;
            }
            
            if (level(s.charAt(i)) == 0){
                n  = n*10 + s.charAt(i)-'0';
                continue;
            }
            num.push(n);
            n = 0;
            while (!ops.isEmpty() && level(s.charAt(i)) <= level(ops.peek()) ){
                int b = num.peek(); num.pop();
                int a = num.peek(); num.pop();
                num.push(cacl(a, ops.peek(), b));
                ops.pop();
            }
            ops.push(s.charAt(i));
        }
        

        return num.peek();
    }

    private int cacl(int a, Character op, int b) {
        switch (op){
            case '+':
                return a +b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
        }
        return 0;
    }

    private int level(char c) {
        switch (c){
            case '@':
                return -1;
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;

        }
        return 0;
    }

    public static void main(String[] args) {
        Calculate c = new Calculate();
        int calculate = c.calculate("3+2*2");
        System.out.println(calculate);


    }
}
