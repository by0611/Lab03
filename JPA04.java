import java.util.Scanner;

public class JPA04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int total = 0;
        int count = 0;//計算道數
		

        while(true){//無限迴圈
            System.out.println("Please enter meal dollars or enter -1 to stop: ");//輸出
            int coin = scn.nextInt();//建立變數
            if(coin == -1){//判斷
                System.out.println("餐點總費用:"+total);
				double ave = (double) total/count;//設立平均並計算，*注意輸出格式必須使用()在前面
                System.out.printf("%d 道餐點平均費用為: %.2f",count,ave);//輸出
                scn.close();
                break;//終止
            }
            else{
                total += coin;//計算
                count += 1;
            }
        }
    }
}