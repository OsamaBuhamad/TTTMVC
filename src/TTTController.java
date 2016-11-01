import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TTTController implements ActionListener{

	private TTTModel model;
	private TTTView view;
	private int size;
	
	public TTTController(TTTModel model) {
		// TODO Auto-generated constructor stub
		this.model=model;
	}
	
	public void setView(TTTView view){
		this.view=view;
	}
	
	public TTTModel getModel(){
		return this.model;
	}
	
	public String getPlayerFromModel(){
		return model.getPlayerChar();
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		String restart = view.getRestart().getActionCommand();
		String actionL = arg0.getActionCommand();
		
		if(!actionL.equals(restart)){
			String[] turns = actionL.split(" ");
			int row = Integer.parseInt(turns[0]);
			int col = Integer.parseInt(turns[1]);
			model.play(row, col);
			
		}else{
			model.initBoard();
			return;
		}
		
	}


}
