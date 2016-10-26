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
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String restart = view.getRestart().getActionCommand();
		
		
		String actionL = arg0.getActionCommand();
		
		if(actionL.equals(restart)){
			model.initBoard();

			return;
		}
		String[] turns = actionL.split(" ");
		int row = Integer.parseInt(turns[0]);
		int col = Integer.parseInt(turns[1]);
		model.play(row, col);
	}

}
