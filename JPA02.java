public class JPA02{
    public static void main(String[] args) {
        int count = 0;//建立變數
        for(int i = 1;i<=9;i++){//第一迴圈1~9
            count += 1;
            for (int k = 1 ;k <= 2;k++){//第二迴圈0~2
                count += 1;
            }
        }
        System.out.println("count = "+count);//輸出
    }
}