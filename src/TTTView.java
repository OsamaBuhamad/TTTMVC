import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class TTTView extends JFrame implements Observer {

	private int size;
	private JButton[][] b;
	private JButton reset;
	private ActionListener action;
	JPanel panel;
	JTextArea textarea;
	private TTTModel model;
	public TTTView(int size,ActionListener action){
		
		this.size=size;
		this.action = action;
		
		JFrame tttFrame = new JFrame("TicTacToe Game!");
		tttFrame.setSize(300,300);
		tttFrame.setLayout(new BorderLayout());
		 textarea = new JTextArea("Current Player: ");
		
		panel = new JPanel(); 
		panel.setLayout(new GridLayout(size,size));
		
		reset = new JButton("restart");
	    reset.setBackground(Color.white);
	    reset.addActionListener(action);
	    tttFrame.getContentPane().add(reset, BorderLayout.SOUTH);

		
		b = new JButton[size][size];
		//setting up the buttons 
		for (int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				b[i][j] = new JButton("");
				b[i][j].addActionListener(action);
				panel.add(b[i][j]);
				b[i][j].setActionCommand(""+i+" "+j);
			}
		}
		
		textarea.setEditable(false);
		//panel.add(textarea); 
		tttFrame.getContentPane().add(textarea, BorderLayout.NORTH);
		tttFrame.getContentPane().add(panel, BorderLayout.CENTER);
	    tttFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tttFrame.setVisible(true);
		

	}
	
	public JButton getRestart(){
		return reset;
	}



	
	public static void main(String args[]){
		ActionListener a = new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			

		}; 
		TTTView f = new TTTView(3,a);
	}

	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		TTTModel model = (TTTModel)arg0;
		
		for(int i=0;i<size;i++){
			for(int j=0; j<size;j++){
				
				b[i][j].setText(model.getElement(i, j));
			}
		}
		 textarea.setText("Currnet Player: "+model.getPlayerChar());
		
	}

}
