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
 *  Kelas ini digunakan sebagai kelas child dari Object Map yang memberikan istruksi untuk mengembalikan nilai sebuah objek berbentuk berbentuk uang.
 *  Dalam permainan chip challenge, objek ini berbentuk chip yang harus dikumpulkan.
 *  Nilai kembalian disingkat dalam bentuk alphabet "c".
 * 
 *  Objek uang digunakan sebagai barang yang dikumpulkan untuk membuka barier sebagai penghalang garis finish.
 *  Jika seluruh uang yang tersedia sudah terambil, maka barrier penghalang garis finish akan hilang.
 */
public class Chip extends ObjectMap{

    @Override
    public Image getImage() {
        String path = "/adbo/image/IC.png";
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(path));
        Image image = imageIcon.getImage();
        return image;
    }
    
    @Override
    public char getValueObject() {
        return 'c';
    }
}
