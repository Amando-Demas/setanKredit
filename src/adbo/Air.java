/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *  Kelas ini digunakan sebagai kelas child dari Object Map yang memberikan istruksi untuk mengembalikan nilai sebuah objek berbentuk air.
 *  Nilai kembalian disingkat dalam bentuk alphabet "a".
 * 
 *  Objek air merupakan sebuah rintangan yang ditempatkan pada objek floor.
 *  Objek air dapat dilewati saat player mendapatkan spatu anti air.
 */
public class Air extends ObjectMap{
    
    @Override
    public Image getImage() {
        String path = "/adbo/image/air.png";
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(path));
        Image image = imageIcon.getImage();
        return image;
    }
    
    @Override
    public char getValueObject() {
        return 'a';
    }
}
