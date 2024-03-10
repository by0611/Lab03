import java.util.Scanner;
public class JPA01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//宣告輸入清單
        System.out.println("Input: ");//輸出
        int total = 0; //設定變數
        int k = scn.nextInt();

        for (int i = 1; i <= k; i++) {//建立迴圈，*注意要使用;區隔
            total += i;//計算
        }

        System.out.println("1 + ... + "+k+" = "+" "+total);//輸出
        
        scn.close();
    }
}