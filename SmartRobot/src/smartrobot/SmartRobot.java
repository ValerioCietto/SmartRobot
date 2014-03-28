package smartrobot;


import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.Toolkit;
import java.io.IOException;

public class SmartRobot {
	
	
	public static Robot dumbRobot;
	final int left = InputEvent.BUTTON1_MASK;
	final int right = InputEvent.BUTTON3_MASK;
	int delaytime = 200;
	private static String OS = System.getProperty("os.name").toLowerCase();

	public SmartRobot() throws AWTException {
		dumbRobot = new Robot();
	}
	public static boolean isWindows() {
		 
		return (OS.indexOf("win") >= 0);
 
	}
 
	public static boolean isMac() {
 
		return (OS.indexOf("mac") >= 0);
 
	}
 
	public static boolean isUnix() {
 
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
 
	}
 
	public static boolean isSolaris() {
 
		return (OS.indexOf("sunos") >= 0);
 
	}
	/**
	 * @param x, y coordinates of the click
	 */
	public void click(int x, int y){
		dumbRobot.mouseMove(x, y);
		dumbRobot.mousePress(left);
		dumbRobot.mouseRelease(left);
		dumbRobot.delay(delaytime);
	}
	
	public void rclick(int x, int y){
		dumbRobot.mouseMove(x+random(-1,+1),y+random(-1,+1));
		dumbRobot.mousePress(left);
		dumbRobot.delay(random(12,35));
		dumbRobot.mouseRelease(left);
		dumbRobot.delay(random(212,335));
	}
	
	public void rightClick(){
		dumbRobot.mousePress(right);
		dumbRobot.mouseRelease(right);
		dumbRobot.delay(delaytime);
	}
	
	public void rightClick(int x, int y){
		dumbRobot.mouseMove(x, y);
		dumbRobot.mousePress(right);
		dumbRobot.mouseRelease(right);
		dumbRobot.delay(delaytime);
	}
	
	public void rdelay(int millisec){
		dumbRobot.delay(millisec+random(0,134));
	}
	
	public void delay(int millisec){
		dumbRobot.delay(millisec);
	}
	
	public Color getColorAt(int x, int y){
		return dumbRobot.getPixelColor(x, y);
	}
	
	public void select(int x1,int y1, int x2, int y2){
		dumbRobot.mouseMove(x1,y1);
		dumbRobot.mousePress(left);
		dumbRobot.mouseMove(x2, y2);
		dumbRobot.mouseRelease(left);
	}
	
	public void copyTextAt(int x1,int y1, int x2, int y2){
		this.select(x1, y1, x2, y2);
		//dumbRobot.mouseMove(x1+(x2-x1)/2, y1+(y2-y1)/2);
		//this.rightClick();
		dumbRobot.keyPress(KeyEvent.VK_CONTROL);
		dumbRobot.keyPress(KeyEvent.VK_C);
		dumbRobot.keyRelease(KeyEvent.VK_C);
		dumbRobot.keyRelease(KeyEvent.VK_CONTROL);
	}
	
	
	
	public void pressKey(String keyName){
		
		if(keyName.compareTo("a")==0){//############################ LETTERS
			
			dumbRobot.keyPress(KeyEvent.VK_A);
			dumbRobot.keyRelease(KeyEvent.VK_A);
			
		}else if(keyName.compareTo("b")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_B);
			dumbRobot.keyRelease(KeyEvent.VK_B);
			
		}else if(keyName.compareTo("c")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_C);
			dumbRobot.keyRelease(KeyEvent.VK_C);
			
		}else if(keyName.compareTo("d")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_D);
			dumbRobot.keyRelease(KeyEvent.VK_D);
			
		}else if(keyName.compareTo("e")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_E);
			dumbRobot.keyRelease(KeyEvent.VK_E);
			
		}else if(keyName.compareTo("f")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_F);
			dumbRobot.keyRelease(KeyEvent.VK_F);
			
		}else if(keyName.compareTo("g")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_G);
			dumbRobot.keyRelease(KeyEvent.VK_G);
			
		}else if(keyName.compareTo("h")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_H);
			dumbRobot.keyRelease(KeyEvent.VK_H);
			
		}else if(keyName.compareTo("i")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_I);
			dumbRobot.keyRelease(KeyEvent.VK_I);
			
		}else if(keyName.compareTo("j")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_J);
			dumbRobot.keyRelease(KeyEvent.VK_J);
			
		}else if(keyName.compareTo("k")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_K);
			dumbRobot.keyRelease(KeyEvent.VK_K);
			
		}else if(keyName.compareTo("l")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_L);
			dumbRobot.keyRelease(KeyEvent.VK_L);
			
		}else if(keyName.compareTo("m")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_M);
			dumbRobot.keyRelease(KeyEvent.VK_M);
			
		}else if(keyName.compareTo("n")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_N);
			dumbRobot.keyRelease(KeyEvent.VK_N);
			
		}else if(keyName.compareTo("o")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_O);
			dumbRobot.keyRelease(KeyEvent.VK_O);
			
		}else if(keyName.compareTo("p")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_P);
			dumbRobot.keyRelease(KeyEvent.VK_P);
			
		}else if(keyName.compareTo("q")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_Q);
			dumbRobot.keyRelease(KeyEvent.VK_Q);
			
		}else if(keyName.compareTo("r")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_R);
			dumbRobot.keyRelease(KeyEvent.VK_R);
			
		}else if(keyName.compareTo("s")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_S);
			dumbRobot.keyRelease(KeyEvent.VK_S);
			
		}else if(keyName.compareTo("t")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_T);
			dumbRobot.keyRelease(KeyEvent.VK_T);
			
		}else if(keyName.compareTo("u")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_U);
			dumbRobot.keyRelease(KeyEvent.VK_U);
			
		}else if(keyName.compareTo("v")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_V);
			dumbRobot.keyRelease(KeyEvent.VK_V);
			
		}else if(keyName.compareTo("w")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_W);
			dumbRobot.keyRelease(KeyEvent.VK_W);
			
		}else if(keyName.compareTo("x")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_X);
			dumbRobot.keyRelease(KeyEvent.VK_X);
			
		}else if(keyName.compareTo("y")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_Y);
			dumbRobot.keyRelease(KeyEvent.VK_Y);
			
		}else if(keyName.compareTo("z")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_Z);
			dumbRobot.keyRelease(KeyEvent.VK_Z);
			
		}else if(keyName.compareTo("1")==0){//################## NUMBERS
			
			dumbRobot.keyPress(KeyEvent.VK_1);
			dumbRobot.keyRelease(KeyEvent.VK_1);
			
		}else if(keyName.compareTo("2")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_2);
			dumbRobot.keyRelease(KeyEvent.VK_2);
			
		}else if(keyName.compareTo("3")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_3);
			dumbRobot.keyRelease(KeyEvent.VK_3);
			
		}else if(keyName.compareTo("4")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_4);
			dumbRobot.keyRelease(KeyEvent.VK_4);
			
		}else if(keyName.compareTo("5")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_5);
			dumbRobot.keyRelease(KeyEvent.VK_5);
			
		}else if(keyName.compareTo("6")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_6);
			dumbRobot.keyRelease(KeyEvent.VK_6);
			
		}else if(keyName.compareTo("7")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_7);
			dumbRobot.keyRelease(KeyEvent.VK_7);
			
		}else if(keyName.compareTo("8")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_8);
			dumbRobot.keyRelease(KeyEvent.VK_8);
			
		}else if(keyName.compareTo("9")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_9);
			dumbRobot.keyRelease(KeyEvent.VK_9);
			
		}else if(keyName.compareTo("0")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_0);
			dumbRobot.keyRelease(KeyEvent.VK_0);
			
		}else if(keyName.compareTo(" ")==0){//################SPECIAL KEYS
			
			dumbRobot.keyPress(KeyEvent.VK_SPACE);
			dumbRobot.keyRelease(KeyEvent.VK_SPACE);
			
		}else if(keyName.compareTo("!")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_EXCLAMATION_MARK);
			dumbRobot.keyRelease(KeyEvent.VK_EXCLAMATION_MARK);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("?")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_SLASH);
			dumbRobot.keyRelease(KeyEvent.VK_SLASH);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("@")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_2);
			dumbRobot.keyRelease(KeyEvent.VK_2);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("#")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_3);
			dumbRobot.keyRelease(KeyEvent.VK_3);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("$")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_4);
			dumbRobot.keyRelease(KeyEvent.VK_4);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("%")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_5);
			dumbRobot.keyRelease(KeyEvent.VK_5);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("^")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_6);
			dumbRobot.keyRelease(KeyEvent.VK_6);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("&")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_7);
			dumbRobot.keyRelease(KeyEvent.VK_7);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("*")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_8);
			dumbRobot.keyRelease(KeyEvent.VK_8);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("(")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_9);
			dumbRobot.keyRelease(KeyEvent.VK_9);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo(")")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_SHIFT);
			dumbRobot.keyPress(KeyEvent.VK_0);
			dumbRobot.keyRelease(KeyEvent.VK_0);
			dumbRobot.keyRelease(KeyEvent.VK_SHIFT);
			
		}else if(keyName.compareTo("invio")==0){
			
			dumbRobot.keyPress(KeyEvent.VK_ENTER);
			dumbRobot.keyRelease(KeyEvent.VK_ENTER);
			
		}else if(keyName.compareTo("back")==0){
			
			// press /b to trigger
			dumbRobot.keyPress(KeyEvent.VK_BACK_SPACE);
			dumbRobot.keyRelease(KeyEvent.VK_BACK_SPACE);
			
		}
		else if(keyName.compareTo(":")==0){
			
			if(isWindows()){
				dumbRobot.keyPress(16);
				dumbRobot.keyPress(46);
				dumbRobot.keyRelease(46);
				dumbRobot.keyRelease(16);
			}
			else if(isUnix()){
				dumbRobot.keyPress(16);
				dumbRobot.keyPress(46);
				dumbRobot.keyRelease(46);
				dumbRobot.keyRelease(16);
			}
			
			
			
		}
		else{
			System.out.println("Key not yet supported "+'"'+keyName+'"');
		}
		
			
	}
	
	public void pressKey(char c){
		String s = Character.toString(c);
		pressKey(s);
	}
	
	public void write(String s){
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i)=='/'){

				if(s.charAt(i+1)=='n'){
					pressKey("invio");
					i++;
					continue;
				}
				if(s.charAt(i+1)=='b'){
					pressKey("back");
					i++;
					continue;
				}
				
			}
			pressKey(s.charAt(i));
		}
	}
	
	public String getClipboardContents() {
	    String result = "";
	    Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	    //odd: the Object param of getContents is not currently used
	    Transferable contents = clipboard.getContents(null);
	    boolean hasTransferableText =
	      (contents != null) &&
	      contents.isDataFlavorSupported(DataFlavor.stringFlavor);
	    if ( hasTransferableText ) {
	      try {
	        result = (String)contents.getTransferData(DataFlavor.stringFlavor);
	      }
	      catch (UnsupportedFlavorException ex){
	        //highly unlikely since we are using a standard DataFlavor
	        System.out.println(ex);
	        ex.printStackTrace();
	      }
	      catch (IOException ex) {
	        System.out.println(ex);
	        ex.printStackTrace();
	      }
	    }
	    return result;
	  }
	
	public String getTextAt(int x1,int y1, int x2, int y2){
		copyTextAt(x1, y1, x2, y2);
		return getClipboardContents();
	}
	
	public int readIntAt(int x1,int y1, int x2, int y2){
		
		int out = -1;
		try{
			out = Integer.parseInt(getTextAt(x1, y1, x2, y2)); 
		}
		catch(NumberFormatException e){
			
		}
		
		return out;
				
		
	}
	
	
	public boolean ifColorAtCoordsIs (int x, int y, int red, int blue, int green){
		
		Color other = new Color(red, blue, green);
		if(dumbRobot.getPixelColor(x, y).equals(other)){
			return true;
		}
		else return false;
		
	}
	
	public boolean ifColorAtCoordsIsRoughly (int x, int y, int red, int blue, int green){
		
		Color other = new Color(red, blue, green);
		Color screen = dumbRobot.getPixelColor(x, y);
		
		int difference = 
				Math.abs(other.getRed()-screen.getRed())+
				Math.abs(other.getGreen()-screen.getGreen())+
				Math.abs(other.getBlue()-screen.getBlue());
		
		if(difference < 7){
			return true;
		}
		else return false;
		
	}
	
	
	public int random(int min, int max){
		return min + (int)(Math.random() * ((max - min) + 1));
	}
	
	//not working yet
        public int compareImages(BufferedImage a){
    	        Raster buffer = a.getData();
		return -1;
	}
}
