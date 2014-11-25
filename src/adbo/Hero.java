/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo;

import adbo.ObjectMap;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *  Kelas ini digunakan sebagai kelas child dari Object Map yang memberikan istruksi untuk mengembalikan nilai sebuah objek berbentuk player.
 *  Nilai kembalian disingkat dalam bentuk alphabet "h".
 * 
 *  Objek Hero merupakan objek player yang digerakkan oleh user.
 *  Objek Hero dijalankan oleh user untuk mengumpulkan uang agar dapat mencapai finish
 */
public class Hero extends ObjectMap{
    

    @Override
    public Image getImage() {
        String path = "/adbo/image/hero.png";
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(path));
        Image image = imageIcon.getImage();
        return image;
    }
    
    @Override
    public char getValueObject() {
        return 'h';
    }
}
