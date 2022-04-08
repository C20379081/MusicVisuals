package ie.tudublin;

import processing.core.*;

public class WaveAfterWave extends Visual {
    Face fc;
    float cy = 0;

    public WaveAfterWave(Face fc)
    {
        this.fc = fc;
        cy = this.fc.height / 2;
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

        //Right Eye - a masterpiece
        fc.fill(0, 50, 170);        
        fc.circle(284, 200, fc.getSmoothedAmplitude() * 600);
        fc.fill(255, 255, 255);  
        fc.circle(284, 200, fc.getSmoothedAmplitude() * 300);
        fc.fill(180, 215, 242);  
        fc.circle(284, 200, fc.getSmoothedAmplitude() * 250);
        fc.fill(0); 
        fc.circle(284, 200, fc.getSmoothedAmplitude() * 100);

       /* for(int i = 0 ; i < fc.getAudioBuffer().size() ; i ++)
        {
            
            fc.stroke(
                PApplet.map(i, 0, fc.getAudioBuffer().size(), 0, 255)
                , 255
                , 255
            );

            fc.line(i, cy, i, cy + cy * fc.getAudioBuffer().get(i));
            

            fc.circle(width/2, height/2, smoothedA);
        }
        */
    }
}
