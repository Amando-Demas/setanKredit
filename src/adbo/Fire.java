/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo;

import adbo.ObjectMap;
import adbo.ObjectMap;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *  Kelas ini digunakan sebagai kelas child dari Object Map memberikan istruksi untuk mengembalikan nilai sebuah objek berbentuk api.
 *  Nilai kembalian disingkat dalam bentuk alphabet "e".
 * 
 *  Objek api merupakan sebuah rintangan yang ditempatkan pada objek floor.
 *  Objek api dapat dilewati saat player mendapatkan spatu anti api.
 */
public class Fire extends ObjectMap{

    @Override
    public Image getImage() {
        String path = "/adbo/image/fire.png";
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(path));
        Image image = imageIcon.getImage();
        return image;
    }
    
    @Override
    public char getValueObject() {
        return 'e';
    }
}
