import java.util.Scanner;
public class Run {
	
	public Run(){
		
	}
	
	
	public static void main(String args[]){
		
		Scanner user_input = new Scanner( System.in );
		int size=0;
		System.out.print("Enter your board size: ");
		size = user_input.nextInt( );
		TTTModel m = new TTTModel(size);
		m.printBoard();
		int row,col;
		while(m.isRunning()){
			System.out.print("Enter row: ");
			row = user_input.nextInt( );
			System.out.print("Enter col: ");
			col = user_input.nextInt( ); 
			m.play(row, col);
		}
		
//		m.play(0,0);//x
//		//m.printBoard();
//		System.out.println("is Horz: "+m.isHorizotal());
//		System.out.println("is Ver: "+m.isVertical());
//		System.out.println("is Diag: "+m.isDiag());
//		System.out.println("is still??? "+ m.isRunning());
//		m.play(1,1);//o
//		//m.printBoard();
//		System.out.println("is Horz: "+m.isHorizotal());
//		System.out.println("is Ver: "+m.isVertical());
//		System.out.println("is Diag: "+m.isDiag());
//		System.out.println("is still??? "+ m.isRunning());
//		m.play(1,0);//x
//		//m.printBoard();
//		System.out.println("is Horz: "+m.isHorizotal());
//		System.out.println("is Ver: "+m.isVertical());
//		System.out.println("is Diag: "+m.isDiag());
//		System.out.println("is still??? "+ m.isRunning());
//		m.play(1,2);//o
//		//m.printBoard();
//		System.out.println("is Horz: "+m.isHorizotal());
//		System.out.println("is Ver: "+m.isVertical());
//		System.out.println("is Diag: "+m.isDiag());
//		System.out.println("is still??? "+m.isRunning());
//		m.play(2,0);//x
//		//m.printBoard();
//		System.out.println("is Horz: "+m.isHorizotal());
//		System.out.println("is Ver: "+m.isVertical());
//		System.out.println("is Diag: "+m.isDiag());
//		System.out.println("is still??? "+ m.isRunning());
//		
//		
//
//		while 

	}

}
