public class JPA03 
{
	public static void main(String[] args) 
	{
        	int i, num, sum = 0;
        	System.out.printf("1~1000中的完美數有: ");//輸出

        	for(num=1;num<=1000;num++) {//建立迴圈
			    sum=0;//建立變數     

            		for(i=1;i<num;i++){//建立巢狀迴圈	            
                            if(num%i==0) {//判斷
					    sum+=i; 
		             }
	            	}
            		if(sum==num)  {//判斷
                		System.out.printf("%d ",num); //輸出
            		}
        	}
       		System.out.printf("\n");//換行   
    	}
}