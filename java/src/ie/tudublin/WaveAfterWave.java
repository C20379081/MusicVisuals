package ie.tudublin;

import processing.core.*;

public class WaveAfterWave extends Visual {
    Face fc;

    public WaveAfterWave(Face fc)
    {
        this.fc = fc;
    }

    public void render()
    {
        fc.calculateAverageAmplitude();
        fc.colorMode(PApplet.RGB);
        fc.stroke(255);

        //Right Eye - a masterpiece
        fc.fill(0, 50, 170);        
        fc.circle(740, 200, fc.getSmoothedAmplitude() * 600);
        fc.fill(255, 255, 255);  
        fc.circle(740, 200, fc.getSmoothedAmplitude() * 300);
        fc.fill(180, 215, 242);  
        fc.circle(740, 200, fc.getSmoothedAmplitude() * 250);
        fc.fill(0);  
        fc.circle(740, 200, fc.getSmoothedAmplitude() * 100);

        //Left Eye - a masterpiece
        fc.fill(0, 50, 170);        
        fc.circle(284, 200, fc.getSmoothedAmplitude() * 600);
        fc.fill(255, 255, 255);  
        fc.circle(284, 200, fc.getSmoothedAmplitude() * 300);
        fc.fill(180, 215, 242);  
        fc.circle(284, 200, fc.getSmoothedAmplitude() * 250);
        fc.fill(0); 
        fc.circle(284, 200, fc.getSmoothedAmplitude() * 100);
    }
}
