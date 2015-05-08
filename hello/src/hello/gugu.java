package hello;

public class gugu {

	public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 6; j++) {
				System.out.print(j + "*" + i + "=" + (i * j)+ "\t" );
                  //한줄에서 나온다... 
			}
		   System.out.println(" ");
		}
        System.out.println( );
		
		for(int i = 1 ; i < 10 ; i++){
			for(int j =6 ; j<10 ; j++){
				
				System.out.print(j +"*" + i +"="+(i*j)+ "\t");
			}
			System.out.println(" ");
		}

	
	
	}
}
