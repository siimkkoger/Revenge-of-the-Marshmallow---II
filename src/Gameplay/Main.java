package Gameplay;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

public class Main extends Applet implements KeyListener{


    // ------------------- TUTORIAL GRAPHICS -------------------

    private Rectangle rect;
    public void init(){
        this.addKeyListener(this);
        rect = new Rectangle(0, 0, 50, 50);
    }
    private ArrayList<Integer> keysDown = new ArrayList<>();

    // ---------------------------------------------------------

    //TODO : make validation logic
    private static final boolean EVERTHING_IS_OK = true;

    private static boolean started = false;
    private static HashMap<String, Game> games = new HashMap<>();

//    public static void main(String[] args) {
//        Game game1 = new Game("Game_1");
//        if(!game1.gameValidated(() -> Main.EVERTHING_IS_OK)){
//            throw new RuntimeException("Game was not validated");
//        }
//        game1.gameInitialize();
//        game1.gameLoop();
//    }

    public void paint(Graphics g){
        setSize(500, 500);
        Graphics2D g2 = (Graphics2D)g;
        g2.fill(rect);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(!keysDown.contains(e.getKeyCode())){
            keysDown.add(e.getKeyCode());
        }
        moveRect();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keysDown.remove(e.getKeyCode());
    }

    public void moveRect(){
        int speed = 10;
        int x = rect.x;
        int y = rect.y;

        if(keysDown.contains(KeyEvent.VK_UP)) y -= speed;
        if(keysDown.contains(KeyEvent.VK_DOWN)) y += speed;
        if(keysDown.contains(KeyEvent.VK_LEFT)) x -= speed;
        if(keysDown.contains(KeyEvent.VK_RIGHT)) x += speed;

        rect.setLocation(x, y);
        repaint();
    }

    interface validationHelper {
        boolean helpValidation();
    }
}
