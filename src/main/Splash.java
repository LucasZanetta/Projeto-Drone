/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import view.SplashScreen;

/**
 *
 * @author Lucas
 */



public class Splash {
    
    private final int TIME_SPLASH = 4000;

    public Splash(){
    
    SplashScreen splashScreen = new SplashScreen();
    
    splashScreen.setVisible(true);
    
    try{
        
        Thread.sleep(TIME_SPLASH);
        
    }catch(InterruptedException e){
        
    }
    
    splashScreen.dispose();
    
    
    
    }
}
