package Gameplay;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Array;
import java.security.Key;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;


public class Main extends JPanel implements KeyListener{

    /**
     * Perhaps I should add an extra classes: GamePanel and/maybe Listener?
     * Rendering would then come from GamePanel, listening from Listener and
     * Game would give all the objects and game logic itself
     * Main class would then bring them all together.
     */


    // ---------------------  TUTORIAL GRAPHICS  ---------------------------------

    private static int DEFAULT_WIDTH = 800;
    private static int DEFAULT_HEIGHT = 600;
    private final Timer timer;
    private int timerDelay;

    public Main(){
        super();
        this.setPreferredSize(new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT));
        this.setVisible(true);
        this.setBackground(Color.BLACK);
        timerDelay = 1000;
        timer = new Timer(timerDelay, gameTimer);
        timer.start();
    }

    ActionListener gameTimer = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("test");
        }
    };

    private Rectangle rect;
    public void init(){
        this.addKeyListener(this);
        rect = new Rectangle(0, 0, 50, 50);
    }
    private ArrayList<Integer> keysDown = new ArrayList<>();

    public void paintComponent(Graphics g){
        super.paint(g);

        setSize(500, 500);
        Graphics2D g2 = (Graphics2D)g;
        g2.fill(rect);
    }

    // -----------------------  START A GAME   ----------------------------------

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



    // ------------------- TUTORIAL KEYPRESS -------------------

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

    private void moveRect(){
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

    // -------------------------------- INTERFACES ----------------------------------

    interface validationHelper {
        boolean helpValidation();
    }
}
