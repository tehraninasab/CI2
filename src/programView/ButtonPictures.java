package programView;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class ButtonPictures{
	private static ButtonPictures buttonPictures;
	HashMap <String, Image> pictures;
	
	
	public static ButtonPictures getInstance()
	{
		if(buttonPictures == null) {
			buttonPictures = new ButtonPictures();
		}
		return buttonPictures;
	}
	
	public ButtonPictures()
	{
		try {
			initialize();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void initialize() throws IOException
	{
		pictures = new HashMap();
		pictures.put("enter", loadPNGImage("enter"));
		
		pictures.put("addUser", loadPNGImage("addUser"));
		
		pictures.put("remove", loadPNGImage("remove"));
		
		pictures.put("removeUser", loadPNGImage("removeUser"));
		
		pictures.put("newGame", loadPNGImage("newGame"));
		
		pictures.put("resume", loadPNGImage("resume"));
		
		pictures.put("ranking", loadPNGImage("ranking"));
		
		pictures.put("setting", loadPNGImage("setting"));
		
		pictures.put("quit", loadPNGImage("quit"));
		
		pictures.put("continueGame", loadPNGImage("continueGame"));
		
		pictures.put("quitGame", loadPNGImage("quitGame"));
		
		pictures.put("plus", loadPNGImage("plus"));
		
		pictures.put("minus", loadPNGImage("minus"));
		
		pictures.put("ok", loadPNGImage("ok"));
		
		pictures.put("cancel", loadPNGImage("cancel"));
		
		pictures.put("back", loadPNGImage("back"));
		
		pictures.put("avatarSetting", loadPNGImage("avatarSetting"));
		
		pictures.put("rocketSetting", loadPNGImage("rocketSetting"));
		
		pictures.put("soundSetting", loadPNGImage("soundSetting"));
		
		pictures.put("SinglePlayer", loadPNGImage("SinglePlayer"));
		
		pictures.put("MultiPlayer", loadPNGImage("MultiPlayer"));
		
		pictures.put("WorkAsServer", loadPNGImage("WorkAsServer"));
		
		pictures.put("WorkAsClient", loadPNGImage("WorkAsClient"));
		
		pictures.put("StartGame", loadPNGImage("StartGame"));
		
		
		pictures.put("enter2", loadPNGImage("enter (2)"));
		
		pictures.put("addUser2", loadPNGImage("addUser (2)"));
		
		pictures.put("remove2", loadPNGImage("remove (2)"));
		
		pictures.put("removeUser2", loadPNGImage("removeUser (2)"));
		
		pictures.put("newGame2", loadPNGImage("newGame (2)"));
		
		pictures.put("resume2", loadPNGImage("resume (2)"));
		
		pictures.put("ranking2", loadPNGImage("ranking (2)"));
		
		pictures.put("setting2", loadPNGImage("setting (2)"));
		
		pictures.put("quit2", loadPNGImage("quit (2)"));
		
		pictures.put("continueGame2", loadPNGImage("continueGame (2)"));
		
		pictures.put("quitGame2", loadPNGImage("quitGame (2)"));
		
		pictures.put("plus2", loadPNGImage("plus (2)"));
		
		pictures.put("minus2", loadPNGImage("minus (2)"));
		
		pictures.put("ok2", loadPNGImage("ok (2)"));
		
		pictures.put("cancel2", loadPNGImage("cancel (2)"));
		
		pictures.put("back2", loadPNGImage("back (2)"));
		
		pictures.put("avatarSetting2", loadPNGImage("avatarSetting (2)"));
		
		pictures.put("rocketSetting2", loadPNGImage("rocketSetting (2)"));
		
		pictures.put("soundSetting2", loadPNGImage("soundSetting (2)"));
		
		pictures.put("SinglePlayer2", loadPNGImage("SinglePlayer2"));
		
		pictures.put("MultiPlayer2", loadPNGImage("MultiPlayer2"));

		pictures.put("WorkAsServer2", loadPNGImage("WorkAsServer2"));
		
		pictures.put("WorkAsClient2", loadPNGImage("WorkAsClient2"));
		
		pictures.put("StartGame2", loadPNGImage("StartGame2"));
		
		pictures.put("multiplySign", loadPNGImage("multiplySign"));
		
		
		
	}
	
	public Image get(String name)
	{
		return pictures.get(name);
	}

	
	public Image loadPNGImage(String name) throws IOException
	{
		Image image = ImageIO.read(new File("C:\\Users\\Markazi.co\\workspace\\Chicken Invaders\\src\\game\\resources\\"+name+".png"));
		return image;
	}

}