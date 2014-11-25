/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adbo.engine;

import adbo.Air;
import adbo.Fire;
import adbo.Floor;
import adbo.Barrier;
import adbo.Chip;
import adbo.Finish;
import adbo.Hero;
import adbo.ObjectMap;
import adbo.SepatuApi;
import adbo.SepatuRenang;
import adbo.Wall;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *  Kelas ini digunakan sebagai kelas yang berfungsi untuk men-setting bentuk map untuk setiap level nya.
 */
public class Map {
    ObjectMap[][] arrayObjectMap; //untuk menampung object map

    public Map(String fileName) {
        setMap(fileName);
    }

    public ObjectMap[][] getArrayObjectMap() {
        return arrayObjectMap;
    }
    
    /**
     * Method ini untuk mengisi obeject ke dalam map menggunakan inputan file.
     * @param fileName file yang berisi struktur map.
     */
    public void setMap(String fileName){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName+".txt"));
            
            String line;
           
            int nLine =  Integer.parseInt(br.readLine());
            int nColumn =  Integer.parseInt(br.readLine());
            arrayObjectMap = new ObjectMap[nLine][nColumn];
            
            int i = 0;
            int j = 0;
            while ((line = br.readLine()) != null){
                if(!line.equals("-")){
                    if (line.charAt(0) == 'c') {
                        arrayObjectMap[i][j] = new Chip();
                    }else if (line.charAt(0) == 'b') {
                        arrayObjectMap[i][j] = new Barrier();
                    }else if (line.charAt(0) == 'f') {
                        arrayObjectMap[i][j] = new Floor();
                    }else if (line.charAt(0) == 'e') {
                        arrayObjectMap[i][j] = new Fire();
                    }else if (line.charAt(0) == 'i') {
                        arrayObjectMap[i][j] = new Finish();
                    }else if (line.charAt(0) == 'h') {
                        arrayObjectMap[i][j] = new Hero();
                    }else if (line.charAt(0) == 'w') {
                        arrayObjectMap[i][j] = new Wall();
                    }else if (line.charAt(0) == 'a') {
                        arrayObjectMap[i][j] = new Air();
                    }else if (line.charAt(0) == 'p') {
                        arrayObjectMap[i][j] = new SepatuApi();
                    }else if (line.charAt(0) == 'r') {
                        arrayObjectMap[i][j] = new SepatuRenang();
                    }
                    
                    j++;
                }
                else {
                    i++;
                    j=0;
                }  
            }
        }
        catch(IOException e){
            System.out.println("GAK KEBACA");
        }
    }
    
    /**
     * untuk mencek koordinat, apakah masih ada di dalam map atau tidak
     * @param x titik koordinat x.
     * @param y titik koordinat y
     * @return true jika karakter masih berada dalam map, dan false jika keluar dari daerah map.
     */
    public boolean outOfBound(int x, int y)
    {
        if(x>=arrayObjectMap.length || y >= arrayObjectMap[0].length || x<0 || y<0)
        {
            return true;
        }
        
        return false;
    }
    
    public boolean unlockable()
    {
        for (int i = 0; i < arrayObjectMap.length; i++) 
        {
            for (int j = 0; j < arrayObjectMap[0].length; j++) 
            {
                if(arrayObjectMap[i][j].getValueObject()=='c')
                {
                    i = arrayObjectMap.length;
                    j = arrayObjectMap[0].length;
                    return false;
                }
            }
        }
        return true;
    }
    
}
