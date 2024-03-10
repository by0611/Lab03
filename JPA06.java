import java.util.Scanner;
public class JPA06 {
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
                int Ans = (int) Math.pow(m,n);//計算
                System.out.println(Ans);//輸出
            }
        }
    }
}
