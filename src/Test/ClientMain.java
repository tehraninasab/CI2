package Test;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;

import client.swing.GamePanel;
import programView.MainController;

public class ClientMain {

	public static void main(String[] args) {
//		JFrame frame = new JFrame();
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//		frame.setBounds(0,0,screenSize.width, screenSize.height);
//	
//		Client client = new Client("127.0.0.1", 9090, "zahra");
//		
//		GamePanel gamePanel = new GamePanel(client);
//		gamePanel.add(new JLabel("50"));
//		
//		client.addGamePanel(gamePanel);
//		frame.add(gamePanel);
//		
//		client.start();
//		frame.setVisible(true);
		MainController mainController = new MainController();
		mainController.createClient("127.0.0.1", 9090);
		mainController.startClient();
	}
}
