/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo.engine;

/**
 *  Kelas ini digunakan untuk menampung inventory yang telah didapatkan oleh player dalam setiap pergerakannya.
 */
public class Inventory {
    boolean[] isiInventory;

    public Inventory() {
        this.isiInventory = new boolean[2];//
        for (int i = 0; i < this.isiInventory.length; i++) {
            this.isiInventory[i] = false;
        }
        
    }

    public boolean[] getIsiInventory() {
        return isiInventory;
    }

    public void setIsiInventory(int index, boolean value) {
        this.isiInventory[index] = value;
    }
    
    public boolean hasFireBoot() {
        return this.isiInventory[0];
    }
    
    public boolean hasSwimmingBoot() {
        return this.isiInventory[1];
    }
}
