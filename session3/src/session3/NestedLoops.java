package session3;

public class NestedLoops {
public static void main(String[] args) {
		
		myloop: // label to the i loop
		for(int i=1; i<=3; i++) {
			System.out.println(">> i is: "+i);
			
			// j loop is externally executed 3 times
			// j loop is internally executed 5 times
			for(int j=1; j<=5; j++) {
				System.out.print(j+"  ");
				
				if(j==3) {
					break myloop; // break the outer loop
				}
				
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 
		 	Considering Chessboard :)
		 	
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	1 0 1 0 1 0 1 0
		 	0 1 0 1 0 1 0 1
		 	
		 	
		 */
		
		/*for(int i=0;i<8;i++) {
		
		for(int j=0;j<8;j++) {
			
			if(i%2==0) {
				System.out.print((j+1)%2+" ");
			}else {
				System.out.print(j%2+" ");
			}
		}
		
			System.out.println();
		}*/
		
		char whiteSquare = '\u25A0';
		char blackSquare = '\u25A1';
		
		char queen = '\u2655';
		
		for(int i=0;i<8;i++) {
			
			for(int j=0;j<8;j++) {
				
				if(i%2==0) {
					//System.out.print((j+1)%2+" ");
					//char square = (j+1)%2==0 ? blackSquare : whiteSquare;
					char square = (j+1)%2==0 ? blackSquare : queen;
					System.out.print(square+" ");
				}else {
					//System.out.print(j%2+" ");
					char square = j%2==0 ? blackSquare : whiteSquare;
					System.out.print(square+" ");
				}
			}
			
				System.out.println();
		}
		
		
		
		
		

	}

}
