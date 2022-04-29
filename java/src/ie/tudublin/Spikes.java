package ie.tudublin;

import processing.core.*;

public class Spikes{
    Face fc;

    public Spikes(Face fc) {
        this.fc = fc;
    }

    public void freqSpike(){
        float gap = fc.width / ((float) fc.getBands().length * 2);
        fc.noStroke();
        for(int i = 0 ; i < fc.getBands().length ; i ++)
        {
            fc.fill(PApplet.map(i, 0, fc.getBands().length, 255, 0), 255, 255);
           
            // Left spikes
            fc.triangle(0, (fc.height - gap) - i * gap, 0, gap, fc.getSmoothedBands()[i] * 0.65f, i * gap / 2);
            
            // Right spikes
            fc.triangle(fc.width, (fc.height - gap) - i * gap, fc.width, gap, fc.width - fc.getSmoothedBands()[i] * 0.65f, i * gap / 2);

        }
        
    }
}
