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
 *
 * @author Ilham
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
