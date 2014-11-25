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
 *  Kelas ini digunakan sebagai kelas untuk memanggil suara.
 *  Kelas ini memiliki beberapa jenis method yang memiliki fungsi suara yang digunakan dalam permainan.
 */

public class SoundCaller 
{
    
    Clip clipBG;
    AudioInputStream inputStreamBG;
    
    /**
     * Method playSoundMoney digunakan untuk memanggil suara jika player mengumpulkan uang.
     * 
     */
    
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
    /**
     * Method playSoundFire digunakan untuk memanggil suara jika player berjalan di atas api.
     */
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
    
    /**
     * Method playSoundWater digunakan untuk memanggil suara jika player berenang ataupun tenggelam ke dalam air.
     */
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
    /**
     * Method playSoundFireWithoutShoes digunakan untuk memanggil suara jika player berjalan di atas api dengan syarat player telah mendapatkan spatu api.
     */
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
    /**
     * Method playSoundFinish digunakan untuk memanggil suara jika player menginjak garis finish.
     */
    
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
    
    /**
     * Method playSoundBG digunakan untuk memanggil suara background dalam permainan.
     */
    
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
