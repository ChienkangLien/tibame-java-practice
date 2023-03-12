package somethingElse;

class Print {

    private int flag = 1;//訊號量。當值為1時列印數字，當值為2時列印字母
    private int count = 1;

    public synchronized void printNum() {
        if (flag != 1) {
            //列印數字
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print(2 * count - 1);
        System.out.print(2 * count);
        flag = 2;
        notify();
    }

    public synchronized void printChar() {
        if (flag != 2) {
            //列印字母
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print((char) (count - 1 + 'A'));
        count++;//當一輪迴圈列印完之後，計數器加1
        flag = 1;
        notify();
    }
}

public class watiNotifyTest {
    public static void main(String[] args) {
        Print print = new Print();
        new Thread(() -> {
            for (int i = 0; i < 26; i++) {
                print.printNum();
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 26; i++) {
                print.printChar();
            }
        }).start();
    }
}

