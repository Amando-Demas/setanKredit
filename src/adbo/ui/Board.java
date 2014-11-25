package adbo.ui;


import adbo.Floor;
import adbo.Hero;
import adbo.engine.Inventory;
import adbo.engine.Map;
import adbo.engine.Player;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 * Kelas ini digunakan sebagai kelas yang berfungsi sebagai pengatur papan permainan di awal permainan.
 */
public class Board extends javax.swing.JPanel implements ActionListener{

    private Timer timer;
    private Player player;
    public Map map;
    public int counter;
    public Inventory inventory;
    public int sizeKotak;
    
    
    Graphics2D g2d;
    
    public Board() {
        initComponents();
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        counter = 1;
        sizeKotak = 55;
        
        map = new Map("1");
        player = new Player();
        
        inventory = new Inventory();
        this.setHeroPosition();
        timer = new Timer(5, this);
        timer.start();
    }
    /**
     * Method ini digunakan sebagai method yang mengatur letak player pada posisi default.
     */
    
    public void setHeroPosition() {
        int counter = 0;
        for (int i = 0; i < map.getArrayObjectMap().length; i++) {
            for (int j = 0; j < map.getArrayObjectMap()[0].length; j++) {
                if(map.getArrayObjectMap()[i][j].getValueObject() == 'h')
                {
                    player.setX(j*sizeKotak + 60);
                    player.setY(i*sizeKotak + 100);
                    player.setiPosition(i);
                    player.setjPosition(j);
                    map.getArrayObjectMap()[i][j] = new Floor();
                }
            }
        }
    }
    /**
     * Method ini digunakan sebagai method yang memanggil map yang akan digunakan pada level-level tertentu.
     */
    
    public void drawMap() {
        for (int i = 0; i < map.getArrayObjectMap().length; i++) 
        {
            for (int j = 0; j < map.getArrayObjectMap()[0].length; j++) 
            {
                g2d.drawImage(map.getArrayObjectMap()[i][j].getImage(), (j*sizeKotak + 60), (i*sizeKotak + 100), this);
            }
        }
    }
    /**
     * Method ini digunakan untuk menampilkan score yang telah diperoleh player saat ini.
     */
    public void drawScore() {
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("/adbo/image/dirt.jpg"));
        Image image = imageIcon.getImage();
        g2d.drawImage(image, 400, sizeKotak + 45, this);
        g2d.setFont(new Font("TimesRoman", Font.BOLD, 28));
        g2d.setColor(Color.RED);
        g2d.drawString("Score", 500, 150 );
        g2d.setFont(new Font("TimesRoman", Font.BOLD, 70));
        g2d.setColor(Color.RED);
        g2d.drawString(player.getScore() + "", 475, 235 );
        if (inventory.hasSwimmingBoot() == true) {
            ImageIcon imageIcon2 = new ImageIcon(this.getClass().getResource("/adbo/image/sepaturenang.png"));
            Image image2 = imageIcon2.getImage();
            g2d.drawImage(image2, 480, 300, this);
        }
        if (inventory.hasFireBoot() == true) {
            ImageIcon imageIcon3 = new ImageIcon(this.getClass().getResource("/adbo/image/sepatuapi.png"));
            Image image3 = imageIcon3.getImage();
            g2d.drawImage(image3, 550, 300, this);
        }
        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        String path = "/adbo/image/electronic_circuit.jpg";
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource(path));
        Image image = imageIcon.getImage();
        
    
        g2d = (Graphics2D)g;
        g2d.drawImage(image, 0, 0, this);
        this.drawMap();
        g2d.setFont(new Font("TimesRoman", Font.BOLD, 28));
        g2d.setColor(Color.RED);
        g2d.drawString("LEVEL " + counter, 320, 50 );
        g2d.drawImage(player.getImage(), player.getX(), player.getY(), this);
        this.drawScore();
        
        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }
    
    /**
     * Kelas ini digunakan sebagai kelas yang bergfungsi mengatur pergerakan player melalui input user.
     */
    private class TAdapter extends KeyAdapter {

        /**
         *  Method ini memberikan instruksi kepada engine setelah input user diterima.
         * @param e 
         */
        public void keyReleased(KeyEvent e) {
            
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT) {
                int tempX = player.jPosition-1;
                if(!map.outOfBound(player.iPosition, tempX))
                {
                    if(map.getArrayObjectMap()[player.iPosition][tempX].getValueObject()!='w' && map.getArrayObjectMap()[player.iPosition][tempX].getValueObject()!='b')
                    {
                        player.setX(player.getX() - sizeKotak);
                        player.jPosition+=-1;
                    }
                }
            }

            if (key == KeyEvent.VK_RIGHT) {
                int tempX = player.jPosition+1;
                if(!map.outOfBound(player.iPosition, tempX))
                {
                    if(map.getArrayObjectMap()[player.iPosition][tempX].getValueObject()!='w' && map.getArrayObjectMap()[player.iPosition][tempX].getValueObject()!='b')
                    {
                        player.setX(player.getX() + sizeKotak);
                        player.jPosition+=1;
                    }
                }
            }
            

            if (key == KeyEvent.VK_UP) {
                int tempY = player.iPosition-1;
                if(!map.outOfBound(tempY, player.jPosition))
                {
                    if(map.getArrayObjectMap()[tempY][player.jPosition].getValueObject()!='w' && map.getArrayObjectMap()[tempY][player.jPosition].getValueObject()!='b')
                    {
                        player.setY(player.getY() - sizeKotak);
                        player.iPosition+=-1;
                    }
                }
            }

            if (key == KeyEvent.VK_DOWN) {
                int tempY = player.iPosition+1;
                if(!map.outOfBound(tempY, player.jPosition))
                {
                    if(map.getArrayObjectMap()[tempY][player.jPosition].getValueObject()!='w' && map.getArrayObjectMap()[tempY][player.jPosition].getValueObject()!='b')
                    {
                        player.setY(player.getY() + sizeKotak);
                        player.iPosition+=1;
                    }
                }
            }
            
            player.setStatus(0);
            
            //jika menginjak IC
            if(map.getArrayObjectMap()[player.iPosition][player.jPosition].getValueObject()=='c') {
                adbo.SoundCaller.playSoundMoney();
                player.setScore(player.getScore() + 100);
                map.getArrayObjectMap()[player.iPosition][player.jPosition] = new Floor();
                if(map.unlockable())
                {
                    for (int i = 0; i < map.getArrayObjectMap().length; i++) 
                    {
                        for (int j = 0; j < map.getArrayObjectMap()[0].length; j++) 
                        {
                            if(map.getArrayObjectMap()[i][j].getValueObject()=='b')
                            {
                                map.getArrayObjectMap()[i][j]= new Floor(); 
                            }
                        }
                    }
                }
            }
            
            //jika menginjak sepatu api
            if(map.getArrayObjectMap()[player.iPosition][player.jPosition].getValueObject()=='p') {
                map.getArrayObjectMap()[player.iPosition][player.jPosition] = new Floor();
                inventory.setIsiInventory(0, true);
            }
            
            //jika menginjak sepatu air
            if(map.getArrayObjectMap()[player.iPosition][player.jPosition].getValueObject()=='r') {
                map.getArrayObjectMap()[player.iPosition][player.jPosition] = new Floor();
                inventory.setIsiInventory(1, true);
            }
            
            //jika menginjak air
            if(map.getArrayObjectMap()[player.iPosition][player.jPosition].getValueObject()=='a') {
                adbo.SoundCaller.playSoundWater();
                player.setStatus(1);
                if (inventory.hasSwimmingBoot() == false) 
                {
                    jOP.showMessageDialog(new Frame(),"Karaktermu tenggelam.","Game Over",jOP.ERROR_MESSAGE);   
                    String level = "" + counter;
                    map = new Map(level);
                    inventory = new Inventory();
                    setHeroPosition();
                    player.setScore(0);
                }
            }
            
            //jika menginjak api
            if(map.getArrayObjectMap()[player.iPosition][player.jPosition].getValueObject()=='e') {
                adbo.SoundCaller.playSoundFire();
                player.setStatus(2);
                if (inventory.hasFireBoot() == false) 
                {
                    adbo.SoundCaller.playSoundFireWithoutShoes();
                    jOP.showMessageDialog(new Frame(),"Karaktermu terbakar.","Game Over",jOP.ERROR_MESSAGE);
                    
                    String level = "" + counter;
                    map = new Map(level);
                    inventory = new Inventory();
                    setHeroPosition();
                    player.setScore(0);
                }
            }
            
            
            //jika menginjak endpoint
            if(map.getArrayObjectMap()[player.iPosition][player.jPosition].getValueObject()=='i') {
                counter ++;
                adbo.SoundCaller.playSoundFinish();
//              
                if (counter != 6) {
                    jOP.showMessageDialog(new Frame(),"anda naik level");
                    String level = "" + counter;
                    map = new Map(level);
                    inventory = new Inventory();
//              
                    setHeroPosition(); 
                }else{
                    jOP.showMessageDialog(new Frame(),"Permainan Selesai.");
                    System.exit(0);
                }
               
//                
               // System.exit(0);
            }
            
            
        }

        /**
         * Method ini digunakan untuk mengatur fungsi saat input user diterima yakni tombol-tombol arah gerak player.
         * @param e 
         */
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_LEFT) {
                player.setX(player.getX() + 0);
            }

            if (key == KeyEvent.VK_RIGHT) {
                player.setX(player.getX() + 0);
            }

            if (key == KeyEvent.VK_UP) {
                player.setY(player.getY() + 0);
            }

            if (key == KeyEvent.VK_DOWN) {
                player.setY(player.getY() + 0);
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOP = new javax.swing.JOptionPane();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JOptionPane jOP;
    // End of variables declaration//GEN-END:variables
}
