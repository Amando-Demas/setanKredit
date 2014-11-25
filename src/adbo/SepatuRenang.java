/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *  Kelas ini digunakan sebagai kelas child dari Object Map yang memberikan istruksi untuk mengembalikan nilai sebuah objek berbentuk sepatu anti tenggelam.
 *  Nilai kembalian disingkat dalam bentuk alphabet "r".
 * 
 *  Objek Sepatu renang merupakan objek yang dapat diambil oleh player
 *  Objek Sepatu renang berguna untuk membuat player jadi dapat berenang.
 */
public class SepatuRenang extends ObjectMap{
    
    @Override
    public Image getImage() {
        String path = "/adbo/image/sepaturenang.png";
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(path));
        Image image = imageIcon.getImage();
        return image;
    }
    
    @Override
    public char getValueObject() {
        return 'r';
    }
}
