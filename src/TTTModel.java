import java.util.Observable;

public class TTTModel extends Observable{
	
	private String board[][]; 
	private int size,row, col;
	private boolean turn;
	private String playerchar="O";

	public TTTModel(int size){
		board = new String [size][size];

		this.size=size;
		row=0;
		col=0;
		
		initBoard();
	}
	
	public void initBoard(){
		for(int i=0;i<size;i++){
			for (int j=0;j<size;j++ ){
				board[i][j]="*";
				
			}
		}
	}
	
	public void printBoard(){
		for(int i=0;i<size;i++){
			for (int j=0;j<size;j++ ){
				System.out.print(board[i][j]+"\t");
			
				
			}

			System.out.println();
			
		}
		System.out.println();
	}
	
	public String getPlayerChar(){
		if (turn){
			playerchar ="O";
			//board[row][col]=playerchar;
			
		}else{
			playerchar ="X";
			//board[row][col]=playerchar;
		}
		return playerchar;
	}
	
	public void changeTurn(){
		turn=!turn;
	}
	
	public void play(int row, int col){
		if(row > size || col > size){
			System.out.println("wrong coordinate fam!");
		}else{
			this.row=row;
			this.col=col;
			if(board[row][col].equals("*")){
				if (turn){
					board[row][col]=getPlayerChar();
				}else{
					board[row][col]=getPlayerChar();
					
				}
				printBoard();
				status(); 
				changeTurn();
				
			
				
			}
		}
	}
	
	public boolean isVertical(){
		boolean horz=true;
		
		for(int i=0;i<size-1;i++){
			for (int j=0;j<size;j++ ){
				if((!board[i][j].equals(board[i+1][j]) && (!board[i][j].equals("*")) )){
					horz = false;
				}
			}
			
		}
		
		return horz;
	}
	
	public boolean isHorizotal(){
		boolean ver;
		int count =0;
		for(int i=0;i<size;i++){
			for (int j=0;j<size-1;j++ ){
				if((board[i][j].equals(board[i][j+1])) && !board[i][j].equals("*") ){
					count++;
				}
			}
			
		}
		
		if(count ==size)
		return ver=true;
		
		return ver =false;
	}
	
	public boolean isDiag(){
		boolean diag= true;
		
		for(int i=0; i<size-1;i++){
			if (! board[i][i].equals(board[i+1][i+1]) || board[i].equals("*"))
				diag=false;
			
		}
	
		for(int i= 0, j=size-1; i< size-1 && j>=1 ; i++, j--){
			if(! board[i][j].equals(board[i+1][j-1]) || board[i][j].equals("*") )
				diag=false;
		}
		return diag;
	}
	
	
	public void status(){
		if(isDiag() || isHorizotal() || isVertical()){
			System.out.println("Player: "+getPlayerChar()+" has won!");
		return;
		}	
		if(!isStillRuning()){
			System.out.println("Game over");
			return;
		}
		
		
	}

	public boolean isStillRuning() {
		
		 
		boolean running =false;
		for(int i=0;i<size;i++){
			for (int j=0;j<size-1;j++ ){
				if(board[i][j].equals("*") ){
				
					running  = true;
					
				}
			}
		}
		return running ;
	}

}
