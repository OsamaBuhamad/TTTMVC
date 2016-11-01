import java.util.Scanner;
public class Run {
	
	public Run(){
		
	}
	
	
	public static void main(String args[]){
		
		
		/**
		 * console test of the model 
		 */
		/*
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
	*/
		
		
		/**
		 * MVC 
		 */
		Scanner user_input = new Scanner( System.in );
		int size=0;
		System.out.print("Enter your board size: ");
		size = user_input.nextInt( );
		TTTModel model = new TTTModel(size);
		TTTController controller = new TTTController(model);
		
		TTTView view = new TTTView(size, controller);
		controller.setView(view);
		
		//view.setModel(model);
		model.addObserver(view);
		

	}
}
