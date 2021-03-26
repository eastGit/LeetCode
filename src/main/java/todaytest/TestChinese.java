package todaytest;

/**
 * Description:
 * Created by ldc on 2021/3/7 下午5:02.
 *
 * @author ldc
 */
public class TestChinese {

    static class Chinese {
        private static Chinese objref = new Chinese();

        private Chinese() {
        }

        public static Chinese getInstance() {
            return objref;
        }
    }


    public static void main(String[] args) {
//        Chinese obj1 = Chinese.getInstance();
//        Chinese obj2 = Chinese.getInstance();
//        System.out.println(obj1 == obj2);
//        TestChinese t = new TestChinese();
//        t.first();

        String s = new String("hello");
        String t = new String("hello");
        char[] c = {'h', 'e','l','l','0'};
        System.out.println(s.equals(t));
        System.out.println(t.equals(c));
        System.out.println(s==t);
        System.out.println(t.equals(new String("hello")));
//        System.out.println(t= =c);
    }

    public void first(){
        int i= 5;
        Value v= new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }

    public void second(Value v, int i){
        i= 0;
        v.i = 20;
        Value value = new Value();
        v = value;

        System.out.println(v.i + " " + i);
    }

}


class Value{
    public   int i = 15;
}


