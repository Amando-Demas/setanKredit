/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo;

import java.awt.Image;

/**
 *  Kelas ini digunakan sebagai kelas parent yang memberikan instruksi untuk menurnkan methodnya ke kelas Child.
 */
public abstract class ObjectMap {
    /**
     * Method ini merupakan method yang akan diturunkan kepada kelas anak-anaknya.
     * 
     * Method getImage digunakan untuk merubah sebuah objek menjadi gambar.
     * Method getValueObject digunakan untuk mengembalikan nilai untuk digunakan membentuk level.
     * 
     * @return 
     */
    public abstract Image getImage();
    public abstract char getValueObject();
        
      
}
