package Engine;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.nio.Buffer;

class Window {

    private JFrame frame;
    private BufferedImage image;
    private Canvas canvas;
    private Graphics graphics;
    private BufferStrategy bufferStrategy;

    private int default_width = 800;
    private int width = default_width;
    private int default_height = 600;
    private int height = default_height;
    private float scale = 1f;
    private String title = "default_title";

    private void createCanvasAndFrame(){
        /*
        A method to be used in the beginning of all constructors
        Creates a canvas to draw on and JFrame object.
         */
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        canvas = new Canvas();
        Dimension dimension = new Dimension((int)(width*scale), (int)(height*scale));
        canvas.setPreferredSize(dimension);
        canvas.setMaximumSize(dimension);
        canvas.setMinimumSize(dimension);

        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(canvas, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        canvas.createBufferStrategy(2);
        bufferStrategy = canvas.getBufferStrategy();
        graphics = bufferStrategy.getDrawGraphics();
    }

    Window(GameThread gameThread) {
        this.width = gameThread.getWidth();
        this.height = gameThread.getHeight();
        this.title = gameThread.getTitle();
        createCanvasAndFrame();
    }

    void update(){
        graphics.drawImage(image,0, 0, canvas.getWidth(), canvas.getHeight(), null);
        bufferStrategy.show();
    }

    BufferedImage getImage() {
        return image;
    }
}
