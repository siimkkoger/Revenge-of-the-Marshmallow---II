package Engine;

/**
 * NOTE:
 *      The Game engine (windows rendering, framerate etc.) is based
 *      on a tutorial from a YouTube channel Majoolwip.
 *      if you like those meth
 */

public class GameThread implements Runnable{

    private int default_width = 1080;
    private int width = default_width;
    private int default_height = 720;
    private int height = default_height;
    private float scale = 1f;
    private String title = "default_title";

    private Thread thread;
    private Window window;
    private Renderer renderer;

    private boolean running = false;
    private final double UPDATE_CAP = 1.0/60.0;

    public GameThread(int width, int height, String title){
        this.width = width;
        this.height = height;
        this.title = title;
    }

    public GameThread(String title){
        this.title = title;
    }

    public void start(){
        window = new Window(this);
        renderer = new Renderer(this);
        thread = new Thread(this);
        thread.run();
    }

    public void stop(){

    }

    @Override
    public void run() {
        running = true;

        boolean render = false;
        double firstTime = 0;
        double lastTime = System.nanoTime() / 1000000000.0;
        double passedTime = 0;
        double unprocessedTime = 0;

        double frameTime = 0;
        int framesPassed = 0;
        int fps = 0;

        while(running){

            render = false;

            firstTime = System.nanoTime() / 1000000000.0;
            passedTime = firstTime - lastTime;
            lastTime = firstTime;

            unprocessedTime += passedTime;
            frameTime += passedTime;

            while(unprocessedTime >= UPDATE_CAP){
                unprocessedTime -= UPDATE_CAP;
                render = true;

                //TODO : Update Game
                if(frameTime >= 1.0){
                    frameTime = 0;
                    fps = framesPassed;
                    framesPassed = 0;
                    System.out.println("FPS: " + fps);
                }
            }

            if(render){
                renderer.clear();
                // TODO : Render Game
                window.update();
                framesPassed++;
            }else{
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        dispose();
    }

    private void dispose(){

    }

    public Thread getThread() {
        return thread;
    }

    public Window getWindow() {
        return window;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        GameThread gc = new GameThread("First Game");
        gc.start();
    }

}

































