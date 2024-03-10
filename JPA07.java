import java.util.Scanner;
public class JPA07 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        while(true){//建立無線迴圈
            System.out.println("Input: ");//輸出
            int m = scn.nextInt();//建立整數變數
            int n = scn.nextInt();//建立整數變數
            if(m==999){//判斷
                scn.close();
                break;
            }
            else{
                for (int i = n; i >= 1; i--) {//最大公因數判斷
                    if (m % i == 0 && n % i == 0) {
                        System.out.printf(i+" \n");//使用\n換行
                        break;
                        }
                        
            }
        }
    }
    }
}
