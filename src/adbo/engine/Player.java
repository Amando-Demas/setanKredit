/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo.engine;

import adbo.Hero;
import java.awt.Image;
import javax.swing.ImageIcon;



/**
 * Kelas ini digunakan sebagai kelas yang berfungsi mengatur fungsi dan gerak player dalam permainan.
 */
public class Player extends Hero{
    int x;
    int y;
    int status;
    int score;
    
    public int iPosition;
    public int jPosition;

    public boolean movable;

    public Player() {
        this.status = 0;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public boolean isMovable() {
        return movable;
    }

    public void setMovable(boolean movable) {
        this.movable = movable;
    }
    
    public void setiPosition(int iPosition) {
        this.iPosition = iPosition;
    }

    public void setjPosition(int jPosition) {
        this.jPosition = jPosition;
    }
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    @Override
    public Image getImage(){
        String path = "";
        if (status == 0) {
            path = "/adbo/image/hero.png";
        }else if (status == 1) {
            path = "/adbo/image/siksapocongair.png";
        }else if (status == 2) {
            path = "/adbo/image/siksapocongapi.png";
        }
            ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(path));
            Image image = imageIcon.getImage();
            return image;
        
    }
}
