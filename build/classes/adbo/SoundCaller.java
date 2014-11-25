/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import sun.applet.Main;
import sun.audio.AudioPlayer;

/**
 *
 * @author Acer
 */
public class SoundCaller 
{
    
    Clip clipBG;
    AudioInputStream inputStreamBG;
    
    
    public static void playSoundMoney() {
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
            Main.class.getResourceAsStream("/adbo/sound/BLIP2.WAV"));
            clip.open(inputStream);
            clip.start(); 
        }

        catch (Exception e) {
            System.err.println(e.getMessage());
        }   
    }
    
    public static void playSoundFire() {
        
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
            Main.class.getResourceAsStream("/adbo/sound/POP2.WAV"));
            clip.open(inputStream);
            clip.start(); 
        }

        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    
    public static void playSoundWater() 
    {
        
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
            Main.class.getResourceAsStream("/adbo/sound/WATER2.WAV"));
            clip.open(inputStream);
            clip.start(); 
        }

        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    
    public static void playSoundFireWithoutShoes() {

        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
            Main.class.getResourceAsStream("/adbo/sound/FIRE.WAV"));
            clip.open(inputStream);
            clip.start(); 
        }

        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void playSoundFinish() {
        
        try {
            Clip clip = AudioSystem.getClip();
            AudioInputStream inputStream = AudioSystem.getAudioInputStream(
            Main.class.getResourceAsStream("/adbo/sound/DITTY1.WAV"));
            clip.open(inputStream);
            clip.start(); 
        }

        catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    public void playSoundBG() 
    {
        try{
            File file = new File("src/adbo/sound/tiptoe.wav");
            clipBG = AudioSystem.getClip();
            inputStreamBG = AudioSystem.getAudioInputStream(file);
            clipBG.open(inputStreamBG);
            clipBG.start();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        clipBG.setFramePosition(0);
        clipBG.start();
    }
    
    public void stopSoundBG(){
        this.clipBG.stop();
    }
}
