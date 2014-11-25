/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo.ui;

/**
 * Kelas ini digunakan untuk mengatur layar sebagai default setting.
 */


public class Controller {
    MainFrame mainFrame;
    About about;
    MainMenuFrame mainMenuFrame;
    Option option;
    
    
    public Controller(){
        mainMenuFrame = new MainMenuFrame(this);
        mainFrame = new MainFrame(this);
        about = new About(this);
        option = new Option(this);
        
        mainFrame.setVisible(false);
        mainMenuFrame.setVisible(false);
        about.setVisible(false);
        option.setVisible(false);
    }
    
}
