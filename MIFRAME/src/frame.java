

import javax.swing.JFrame;
import javax.swing.JPanel;

public class frame extends JFrame{
	panel panel1=new panel();
public frame() {
	
	setTitle("frame");
    setBounds(500,300,1000,380);
    add(panel1);



}


	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
frame frame1=new frame();
frame1.setVisible(true);
frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

}
