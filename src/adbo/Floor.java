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
 *  Kelas ini digunakan sebagai kelas child dari Object Map yang memberikan istruksi untuk mengembalikan nilai sebuah objek berbentuk lantai.
 *  Nilai kembalian disingkat dalam bentuk alphabet "f".
 * 
 *  Objek lantai ini merupakan dasar tempat player berjalan.
 */
public class Floor extends ObjectMap{

    @Override
    public Image getImage() {
        String path = "/adbo/image/tile.png";
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(path));
        Image image = imageIcon.getImage();
        return image;
    }
    
    @Override
    public char getValueObject() {
        return 'f';
    }
}
