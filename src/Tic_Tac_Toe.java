
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tic_Tac_Toe implements ActionListener  {
	
	// Fields
	
	JButton restart = new JButton("Restart");
	JButton bturn = new JButton("X turn");
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	char turn = 'X';
	JLabel label = new JLabel();
	boolean running = true;
	
	
	Tic_Tac_Toe(){
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,4));
		panel.setBounds(0 , 0 , 700 , 500);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);		
		set();
		
		JPanel panel2 = new JPanel();
		
		panel2.add(restart);
		panel2.setLayout(null);
		panel2.setBackground(Color.black);
		panel2.add(label);
		panel2.add(bturn);
		set();
		
		
		JFrame frame = new JFrame();
		
		
		
		frame.setSize(700, 700);
		frame.setTitle("Tic Tac Toe");
		frame.add(panel);
		frame.add(panel2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		
		
		
	}
	
	
	public void set() {
		
		restart.setFont(new Font("Times New Roman" , Font.PLAIN , 30));
		restart.setFocusable(false);
		restart.setForeground(Color.RED);
		restart.setBackground(Color.white);
		restart.setBounds(550 , 500 , 140 , 160);
		restart.addActionListener(this);
		
		bturn.setFont(new Font("Times New Roman" , Font.PLAIN , 30));
		bturn.setFocusable(false);
		bturn.setForeground(Color.BLACK);
		bturn.setBackground(Color.white);
		bturn.setBounds(0 , 500 , 140 , 160);
		bturn.addActionListener(this);
		
		
		
		
		

		b1.setFocusable(false);
		b2.setFocusable(false);
		b3.setFocusable(false);
		b4.setFocusable(false);
		b5.setFocusable(false);
		b6.setFocusable(false);
		b7.setFocusable(false);
		b8.setFocusable(false);
		b9.setFocusable(false);
	
		
		
		b1.setBackground(Color.white);
		b2.setBackground(Color.white);
		b3.setBackground(Color.white);
		b4.setBackground(Color.white);
		b5.setBackground(Color.white);
		b6.setBackground(Color.white);
		b7.setBackground(Color.white);
		b8.setBackground(Color.white);
		b9.setBackground(Color.white);
		
		
		b1.setFont(new Font("Times New Roman" , Font.ITALIC , 60));
		b2.setFont(new Font("Times New Roman" , Font.ITALIC , 60));
		b3.setFont(new Font("Times New Roman" , Font.ITALIC , 60));
		b4.setFont(new Font("Times New Roman" , Font.ITALIC , 60));
		b5.setFont(new Font("Times New Roman" , Font.ITALIC , 60));
		b6.setFont(new Font("Times New Roman" , Font.ITALIC , 60));
		b7.setFont(new Font("Times New Roman" , Font.ITALIC , 60));
		b8.setFont(new Font("Times New Roman" , Font.ITALIC , 60));
		b9.setFont(new Font("Times New Roman" , Font.ITALIC , 60));

		
		
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		
		
		label.setForeground(Color.green);
		label.setFont(new Font("Times New Roman" , Font.PLAIN , 60 ));
		label.setText("  Tic Tac Toe");
		label.setBounds(150 , 545 , 400 , 50);
	
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (running) {
		
		if(e.getSource() == b1) {
			
			
			if(turn == 'X' && b1.getText().isEmpty()) {
				
				b1.setText("X");
				b1.setForeground(Color.RED);
			
				turn = 'O';
				bturn.setText(turn + " turn");
				
				check_Winner();
			}
			
			
			
			else if(turn == 'O' && b1.getText().isEmpty()){
				
				
				
				b1.setText("O");
				b1.setForeground(Color.BLUE);
			
				turn = 'X';
				
				bturn.setText(turn + " turn");
				
				check_Winner();
				
				
			}
				
		
			
			
		}
		
		
		
		
		if(e.getSource() == b2) {
			
			
			if(turn == 'X' && b2.getText().isEmpty()) {
				b2.setText("X");
				b2.setForeground(Color.RED);			
				turn = 'O';
				
				bturn.setText(turn + " turn");
				
				check_Winner();
				
			}
			
			
			
			else if(turn == 'O' && b2.getText().isEmpty()){
				b2.setText("O");
				b2.setForeground(Color.BLUE);
				turn = 'X';
				
				bturn.setText(turn + " turn");
				
				check_Winner();
				
				}
				
					}



		if(e.getSource() == b3) {
	
	
	if(turn == 'X' && b3.getText().isEmpty()) {
		b3.setText("X");
		b3.setForeground(Color.RED);			
		turn = 'O';
		
		bturn.setText(turn + " turn");
		
		check_Winner();
		
	}
	
	
	
	else if(turn == 'O' && b3.getText().isEmpty()){
		b3.setText("O");
		b3.setForeground(Color.BLUE);
		turn = 'X';
		
		bturn.setText(turn + " turn");
		
		check_Winner();
		
		}
		
			}


		if(e.getSource() == b4) {
	
	
	if(turn == 'X' && b4.getText().isEmpty()) {
		b4.setText("X");
		b4.setForeground(Color.RED);
		
		
		
		
		check_Winner();
		
		
		turn = 'O';
		
		bturn.setText(turn + " turn");
		
		
		
	}
	
	
	
	else if(turn == 'O' && b4.getText().isEmpty()){
		b4.setText("O");
		b4.setForeground(Color.BLUE);
		turn = 'X';
		
		
		bturn.setText(turn + " turn");
		
		check_Winner();
		
		}
		
			}

  if(e.getSource() == b5) {
	
	
	if(turn == 'X' && b5.getText().isEmpty()) {
		b5.setText("X");
		b5.setForeground(Color.RED);			
		turn = 'O';
		
		bturn.setText(turn + " turn");
		
		check_Winner();
	}
	
	
	
	else if(turn == 'O' && b5.getText().isEmpty()){
		b5.setText("O");
		b5.setForeground(Color.BLUE);
		
		check_Winner();
		
		
		turn = 'X';
		
		bturn.setText(turn + " turn");
		
		
		}
		
			}

  if(e.getSource() == b6) {
	
	
	if(turn == 'X' && b6.getText().isEmpty()) {
		b6.setText("X");
		b6.setForeground(Color.RED);	
		
		check_Winner();
		
		
		turn = 'O';
		
		bturn.setText(turn + " turn");
		
		;
	}
	
	
	
	else if(turn == 'O' && b6.getText().isEmpty()){
		b6.setText("O");
		b6.setForeground(Color.BLUE);
		
		check_Winner();
		
		
		turn = 'X';
		
		bturn.setText(turn + " turn");
		
		
		
		}
		
			}

  if(e.getSource() == b7) {
	
	
	if(turn == 'X' && b7.getText().isEmpty()) {
		b7.setText("X");
		b7.setForeground(Color.RED);	
			
		check_Winner();
		
		
		turn = 'O';
		
		bturn.setText(turn + " turn");
		
		
		
		
	}
	
	
	
	else if(turn == 'O' && b7.getText().isEmpty()){
		b7.setText("O");
		b7.setForeground(Color.BLUE);
		
		check_Winner();
		
		
		turn = 'X';
		
		
		bturn.setText(turn + " turn");
		
		
	
		}
		
			}

  	if(e.getSource() == b8) {
	
	
	if(turn == 'X' && b8.getText().isEmpty()) {
		b8.setText("X");
		b8.setForeground(Color.RED);	
		
		check_Winner();
		
		turn = 'O';
		
		bturn.setText(turn + " turn");
		
		
	}
	
	
	
	else if(turn == 'O' && b8.getText().isEmpty()){
		b8.setText("O");
		b8.setForeground(Color.BLUE);
		
		check_Winner();
		
		turn = 'X';
		
		
		bturn.setText(turn + " turn");
		
		

		}
		
			}

  	if(e.getSource() == b9) {
	
	
	if(turn == 'X' && b9.getText().isEmpty()) {
		b9.setText("X");
		b9.setForeground(Color.RED);	
		
		
		
		check_Winner();
		
		turn = 'O';
		
		bturn.setText(turn + " turn");
		
		
	}
	
	
	
	else if(turn == 'O' && b9.getText().isEmpty()){
		b9.setText("O");
		b9.setForeground(Color.BLUE);
		
		check_Winner();
		
		turn = 'X';
		
		bturn.setText(turn + " turn");
		
		;
		
		
		
		}
  
		
			}
  	
		}

  	if(e.getSource() == restart) {
  		
  		
  		b1.setText("");
  		b2.setText("");
  		b3.setText("");
  		b4.setText("");
  		b5.setText("");
  		b6.setText("");
  		b7.setText("");
  		b8.setText("");
  		b9.setText("");
  		
  		b1.setBackground(Color.white);
  		b2.setBackground(Color.white);
  		b3.setBackground(Color.white);
  		b4.setBackground(Color.white);
  		b5.setBackground(Color.white);
  		b6.setBackground(Color.white);
  		b7.setBackground(Color.white);
  		b8.setBackground(Color.white);
  		b9.setBackground(Color.white);
  		
  		
  		running = true;
  		bturn.setText("X turn");
  		label.setText("  Tic Tac Toe");
  		turn = 'X';
  		
  		
  		
  		
  		}
  	
  	if(e.getSource() == bturn) {
  		
  	
  		}
  	
	}
	
	
	public void check_Winner() {
		
		if(b1.getText() == "X" && b2.getText() == "X") {
			
			
			
			if(b3.getText() == "X") {
				
				
				label.setText("X is winner !!!!");
				
				
				
				b1.setBackground(Color.green);
				b2.setBackground(Color.green);
				b3.setBackground(Color.green);
				
				running = false;
				
				
			}
			
			
			
			
			
		}
		
		
		if(b1.getText() == "X" && b9.getText() == "X") {
			
			
			
			if(b5.getText() == "X") {
				
				
				label.setText("X is winner !!!!");
				
				
				
				b1.setBackground(Color.green);
				b9.setBackground(Color.green);
				b5.setBackground(Color.green);
				
				running = false;
				
				
			}
			
			
		}
		
		
		
		
		if(b3.getText() == "X" && b7.getText() == "X") {
			
			
			
			if(b5.getText() == "X") {
				
				
				label.setText("X is winner !!!!");
				
				
				b3.setBackground(Color.green);
				b7.setBackground(Color.green);
				b5.setBackground(Color.green);
				
				
				running = false;
				
				
			}
			
			
		}
		
		
		if(b7.getText() == "X" && b8.getText() == "X") {
			
			
			
			if(b9.getText() == "X") {
				
				
				label.setText("X is winner !!!!");
				
				
				b7.setBackground(Color.green);
				b8.setBackground(Color.green);
				b9.setBackground(Color.green);
				
				running = false;
				
				
			}
			
	
		
		}
		
		
		if(b3.getText() == "X" && b6.getText() == "X") {
			
			
			
			
			
			if(b9.getText() == "X") {
				
				
				label.setText("X is winner !!!!");
				
				b3.setBackground(Color.green);
				b6.setBackground(Color.green);
				b9.setBackground(Color.green);
				
				running = false;
				
				
			}
		
		
		}
		
		
		if(b1.getText() == "X" && b4.getText() == "X") {
			
			
			
			
			
			if(b7.getText() == "X") {
				
				
				label.setText("X is winner !!!!");
				
				b1.setBackground(Color.green);
				b4.setBackground(Color.green);
				b7.setBackground(Color.green);
				
				running = false;
				
				
			}
		
		
		}
		
		if(b2.getText() == "X" && b5.getText() == "X") {
			
			
			
			
			
			if(b8.getText() == "X") {
				
				
				label.setText("X is winner !!!!");
				
				b2.setBackground(Color.green);
				b5.setBackground(Color.green);
				b8.setBackground(Color.green);
				
				running = false;
				
				
			}
		
		
		}
		
		
		if(b4.getText() == "X" && b5.getText() == "X") {
			
			
			
			
			
			if(b6.getText() == "X") {
				
				
				label.setText("X is winner !!!!");
				
				b4.setBackground(Color.green);
				b5.setBackground(Color.green);
				b6.setBackground(Color.green);
				
				running = false;
				
				
				
				
			}
		
		
		}
		
		if(b1.getText() == "O" && b2.getText() == "O") {
			
			
			
			if(b3.getText() == "O") {
				
				
				label.setText("O is winner !!!!");
				
				
				
				b1.setBackground(Color.green);
				b2.setBackground(Color.green);
				b3.setBackground(Color.green);
				
				running = false;
				
				
			}
			
			
			
			
			
		}
		
		
		if(b1.getText() == "O" && b9.getText() == "O") {
			
			
			
			if(b5.getText() == "O") {
				
				
				label.setText("O is winner !!!!");
				
				
				
				b1.setBackground(Color.green);
				b9.setBackground(Color.green);
				b5.setBackground(Color.green);
				
				running = false;
				
				
			}
			
			
		}
		
		
		
		
		if(b3.getText() == "O" && b7.getText() == "O") {
			
			
			
			if(b5.getText() == "O") {
				
				
				label.setText("O is winner !!!!");
				
				
				b3.setBackground(Color.green);
				b7.setBackground(Color.green);
				b5.setBackground(Color.green);
				
				
				running = false;
				
				
			}
			
			
		}
		
		
		if(b7.getText() == "O" && b8.getText() == "O") {
			
			
			
			if(b9.getText() == "O") {
				
				
				label.setText("O is winner !!!!");
				
				
				b7.setBackground(Color.green);
				b8.setBackground(Color.green);
				b9.setBackground(Color.green);
				
				running = false;
				
				
			}
			
	
		
		}
		
		
		if(b3.getText() == "O" && b6.getText() == "O") {
			
			
			
			
			
			if(b9.getText() == "O") {
				
				
				label.setText("O is winner !!!!");
				
				b3.setBackground(Color.green);
				b6.setBackground(Color.green);
				b9.setBackground(Color.green);
				
				running = false;
				
				
			}
		
		
		}
		
		
		if(b1.getText() == "O" && b4.getText() == "O") {
			
			
			
			
			
			if(b7.getText() == "O") {
				
				
				label.setText("O is winner !!!!");
				
				b1.setBackground(Color.green);
				b4.setBackground(Color.green);
				b7.setBackground(Color.green);
				
				running = false;
				
				
			}
		
		
		}
		
		if(b2.getText() == "O" && b5.getText() == "O") {
			
			
			
			
			
			if(b8.getText() == "O") {
				
				
				label.setText("O is winner !!!!");
				
				b2.setBackground(Color.green);
				b5.setBackground(Color.green);
				b8.setBackground(Color.green);
				
				running = false;
				
				
				
				
			}
		
		
		}
		
		
		if(b5.getText() == "O" && b6.getText() == "O") {
			
			
			
			
			
			if(b4.getText() == "O") {
				
				
				label.setText("O is winner !!!!");
				
				b4.setBackground(Color.green);
				b5.setBackground(Color.green);
				b6.setBackground(Color.green);
				
				running = false;
				
				
				
				
			}
		
		
		}
		
		if (running == true)	{
		
		 if(!b1.getText().isEmpty() && !b2.getText().isEmpty()) {
			
			
			
			if (!b3.getText().isEmpty() && !b4.getText().isEmpty()) {
				
				
				if (!b5.getText().isEmpty() && !b6.getText().isEmpty()) {
					
					
					if (!b7.getText().isEmpty() && !b8.getText().isEmpty()) {
						
						
						if (!b9.getText().isEmpty()) {
							
							label.setText("    Draw !!!");
							running = false;
							
							
							
							
						}	
						
					}
					
				}
				
			}
			
		 }
			
			
		}
		
		
		
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
