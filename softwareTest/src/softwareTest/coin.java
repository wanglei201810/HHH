package softwareTest;
import java.io.*;

public class coin {
	int One = 0;
	int Five = 0;
	int Twnty = 0;
	int Fifty = 0;
	int a = 0;
	int b =0;
	public static void main(String [] args) throws IOException{
		//读入字符串
        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        String str = null; 
        System.out.println("Enter your value:"); 
        str = br.readLine(); 
        
      //转换成int类型
        int i;
        i =Integer.parseInt(str);*/
        
}
	public int Coin(int i) throws IOException{
		int One = 0;
		int Five = 0;
		int Twnty = 0;
		int Fifty = 0;
		int a = 0;
		int b =0;
        
        for(One = 0; One <= 3; One++) {
        	for(Five = 0 ; Five <= 2 ; Five++) {
        		for(Twnty = 0; Twnty <=1 ; Twnty++) {
        			for(Fifty = 0;Fifty <=1;Fifty++) {
        				a = 1*One + 5*Five + 20*Twnty + 50*Fifty;
        				if(i == a) {
        					b = 1;
        					//System.out.println("y:"+i);
        					return b;
        				}
        			}
        		}
        	}
        }
        return 0;
	}
} 

