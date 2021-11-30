import java.util.Scanner;

public class simple {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        MATH math = new MATH();

        math.help();

        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(a + " + " + b + " = " + math.add(a, b));

        System.out.println("------------------------ interface ----------------------------");
        c1 c1_obj = new c1();
    }
}

class MATH extends parent {
    int add(int a, int b) {
        return a+b;
    }

    void help() throws InterruptedException {               // Threa.sllep 要加 throws ..., 呼叫他的也叫加
        super.info = "Easy Map supports add function";
        char [] info_ary = super.info.toCharArray();

        for (int i = 0; i < info_ary.length; i++) {
            System.out.print(info_ary[i]);
            Thread.sleep(interval); 
        }
        System.out.println();
    }
    
    private int interval = 35;
}

class parent {
    String info;
}

interface interface0 {
    public String msg0 = "Hello World";                     // 介面 => 不能修改 => 預設 final
    void greet();                                           // 給 implements 的自行定義 (使用者一定要定義, 不然會報錯)
}

interface interface1 {
    public String msg1 = "byebye";
    void goodbye();
}

class c1 extends parent implements interface0, interface1 {  // extends inplemnt 可以同時使用, extends 只能繼承 1 個, implements 可以很多個
    public c1() {                                            // constructor , 由於有 garbage collection 機制, 導致 finalize (destructor) 執行時機未知, 在 Java9 已經 deprecated 了
        super.info = "I'm c1";
        System.out.println(super.info);

        greet();
        goodbye();
    }

    public void greet() {                                    // implements 的 function 記得加 public
        System.out.println("c1 say : " + msg0);
    }

    public void goodbye() {
        System.out.println("c1 say : " + msg1);
    }
}
