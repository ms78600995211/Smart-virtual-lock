package smartvirtualkey.service;

import org.example.smartvirtualkey.screen.Welcomescreen;
import org.example.smartvirtualkey.screen.FileOptionScreen;
import org.example.smartvirtualkey.screen.SCREEN;

public class ScreenServices {
	//static Directory dir = new Directory();
	
	
	
		public static Welcomescreen WelcomeScreen = new Welcomescreen();
	    public static FileOptionScreen FileOptionsScreen = new FileOptionScreen();
	    
	    

	    public static SCREEN CurrentScreen = WelcomeScreen;

	    
	    public static SCREEN getCurrentScreen() {
	        return CurrentScreen;
	    }

	    
	    public static void setCurrentScreen(SCREEN currentScreen) {
	        CurrentScreen = currentScreen;
	    }
	    
	    
}
