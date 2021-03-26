package todaytest;

import org.omg.PortableInterceptor.INACTIVE;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Description:
 * Created by ldc on 2021/3/22 下午5:20.
 *
 * @author ldc
 */
public class MyStack {

    public static void main(String[] args) throws Exception{
        LinkedList<Integer> result = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        File file = new File("/Users/lindongcan/kkb17/算法课程/【第三课】递归与栈彩蛋数据.txt");
        if (file.exists()){
            FileInputStream in = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String lineTxt;
            while ((lineTxt = reader.readLine()) != null) {
                if (lineTxt.equals("pop")){
                    result.addLast(stack.pop());
                }else {
                    stack.push(Integer.valueOf(lineTxt.split(" ")[1]));
                }
            }

        }

        Long num = 0L;
        int num2 = 0;
        for (int i = 0; i < result.size(); i++) {
            num += result.get(i)* (i+1);
            num2 += result.get(i);
        }
//        for (int i=0; i<stack.size(); i++){
//            num2 += stack.pop() * (i +1);
//        }

        System.out.println("====" + num);
        System.out.println("====" + num2);

    }
}
