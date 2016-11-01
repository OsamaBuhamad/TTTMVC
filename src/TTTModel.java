import java.util.Observable;

public class TTTModel extends Observable{
	
	private String board[][]; 
	private int size,row, col;
	private boolean turn;
	private String playerchar="O";
	//private int countlist[]; 
	
	public TTTModel(int size){
		board = new String [size][size];

		this.size=size;
		row=0;
		col=0;
		//countlist = new int[2];
		//countlist[0]=0;
		//countlist[1]=0;
		initBoard();
	}
	
	public void initBoard(){
		for(int i=0;i<size;i++){
			for (int j=0;j<size;j++ ){
				board[i][j]="*";
				this.setChanged();
				this.notifyObservers();
				
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
					if(isRunning()){
						changeTurn();
					}
					printBoard();
					this.setChanged();
					this.notifyObservers();
					
				}
			

		}
	}
	
	public boolean isVertical(){
		boolean ver;
		int count1=0;
		int count2=0;
		for(int i=0;i<size-1;i++){
			for (int j=0;j<size;j++ ){
				if((board[i][j].equals(board[i+1][j])) && ! board[i][j].equals("*") ){
					if(board[i][j].equals("X")){
						count1++;
					}else if(board[i][j].equals("O")){
						count2++;
					}
				}
					
			}
			
		}
		
		if(count1 ==size-1 || count2==size-1){
			return ver=true;
		}
			
			return ver =false;
	
	}
	
	public boolean isHorizotal(){
		boolean hor;
		int count1 =0; 
		int count2 =0;
		for(int i=0;i<size;i++){
			for (int j=0;j<size-1;j++ ){
				if((board[i][j].equals(board[i][j+1])) && !board[i][j].equals("*") ){
					if(board[i][j].equals("X")){
						count1++;
					}else if(board[i][j].equals("O")){
						count2++;
					}
					
				}
			}
			
		}

		if(count1 ==size-1||count2==size-1){
			
			return hor=true;
		}
		
		
		return hor =false;
	}
	
	public boolean isDiag(){
		boolean diag;
		int count1 =0; 
		int count2 =0;
		for(int i=0; i<size-1;i++){
			if ( board[i][i].equals(board[i+1][i+1]) && ! board[i].equals("*"))
				if(board[i][i].equals("X")){
					count1++;
				}else if(board[i][i].equals("O")){
					count2++;
				}
			
		}
	
		for(int i= 0, j=size-1; i< size-1 && j>=1 ; i++, j--){
			if( board[i][j].equals(board[i+1][j-1]) && ! board[i][j].equals("*") )
				if(board[i][j].equals("X")){
					count1++;
				}else if(board[i][j].equals("O")){
					count2++;
				}
		}

		if(count1 ==size-1 || count2==size-1)
			return diag=true;
			
			return diag =false;
		
	}
	
	
	public boolean isRunning(){
		if (!isWon() && isEmptyPositions()){
			
			return true;
			}
		return false;
		}
	
		
		


	public boolean isEmptyPositions() {
		
		 
		boolean running =false;
		for(int i=0;i<size;i++){
			for (int j=0;j<size-1;j++ ){
				if(board[i][j].equals("*") ){
				
					return true;
					
				}
			}
		}
		return running ;
	}
	
	public boolean isWon(){
		if( isVertical()||isHorizotal() ||isDiag()){
			System.out.println("Player: "+getPlayerChar()+" has won!");
		return true;
		}	
		return false;
	}
	
	public String getElement(int row, int col){
		return board[row][col];
	}

}
