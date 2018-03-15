package Engine;

import java.awt.image.DataBufferInt;

public class Renderer {

    private int pixelWidth, pixelHeight;
    private int[] pixels;

    public Renderer(GameThread gameThread){
        pixelWidth = gameThread.getWidth();
        pixelHeight = gameThread.getHeight();
        pixels = ((DataBufferInt)gameThread.getWindow().getImage().getRaster().getDataBuffer()).getData();
    }

    public void clear(){
        for(int i = 0; i < pixels.length; i++){
            pixels[i] = 0;
        }
    }

}
