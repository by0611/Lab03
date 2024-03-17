import java.util.Scanner;
public class JPA05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for(int h = 0;h <= 2;h++){
        int total = 1;//設定total為1，因為是相乘
        System.out.println("Please enter one value: ");//輸出
        int n = scn.nextInt();
        if(n > 0 && n <= 10){//判斷
            for(int i=1;i<=n;i++){//建立迴圈
                total *= i;//計算
            }
            System.out.printf(n+"!= "+total+"\n");//輸出
            }
        else{//判斷
            System.out.println("Error, the value is out of the range \n");//輸出
            }
        }
        scn.close();}
}
