
public class Run {
	
	public Run(){
		
	}
	
	
	public static void main(String args[]){
		
		TTTModel m = new TTTModel(3);
		m.printBoard();
		m.play(0,0);//x
		//m.printBoard();
		System.out.println("is Horz: "+m.isHorizotal());
		System.out.println("is Ver: "+m.isVertical());
		System.out.println("is Diag: "+m.isDiag());
		System.out.println("is still??? "+ m.isStillRuning());
		m.play(1,1);//o
		//m.printBoard();
		System.out.println("is Horz: "+m.isHorizotal());
		System.out.println("is Ver: "+m.isVertical());
		System.out.println("is Diag: "+m.isDiag());
		System.out.println("is still??? "+ m.isStillRuning());
		m.play(0,1);//x
		//m.printBoard();
		System.out.println("is Horz: "+m.isHorizotal());
		System.out.println("is Ver: "+m.isVertical());
		System.out.println("is Diag: "+m.isDiag());
		System.out.println("is still??? "+ m.isStillRuning());
		m.play(1,0);//o
		//m.printBoard();
		System.out.println("is Horz: "+m.isHorizotal());
		System.out.println("is Ver: "+m.isVertical());
		System.out.println("is Diag: "+m.isDiag());
		System.out.println("is still??? "+ m.isStillRuning());
		m.play(0,2);//x
		//m.printBoard();
		System.out.println("is Horz: "+m.isHorizotal());
		System.out.println("is Ver: "+m.isVertical());
		System.out.println("is Diag: "+m.isDiag());
		System.out.println("is still??? "+ m.isStillRuning());

	}

}
