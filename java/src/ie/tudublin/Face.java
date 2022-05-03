package ie.tudublin;

import processing.core.PImage;

public class Face extends Visual{
    
    WaveAfterWave waw;
    DancyTeeth dt;
    StrobeBack sb;
    PImage img;
    Spikes sp;

    public void settings()
    {
        size(1024, 500);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }
    
    public void setup()
    {
        startMinim();
                
        // Call loadAudio to load an audio file to process 
        loadAudio("agate.mp3");   
        
        // Call this instead to read audio from the microphone
        //startListening(); 
        
        waw = new WaveAfterWave(this);
        dt = new DancyTeeth(this);
        sb = new StrobeBack(this);
        sp = new Spikes(this);
    }


    void drawEyes() {
        
        //Right Eye
        fill(255);
        arc(700, 100, 300, 300, radians(0), radians(130), OPEN);

        //Left Eye
        fill(255);
        arc(324, 100, 300, 300, radians(50), radians(180), OPEN);

	}

    void drawMouth() {
        arc( width/2, 300, 300, 300, radians(0), radians(180), OPEN);

        fill(0);

        arc( width/2, 310, 250, 250, radians(0), radians(180), OPEN);

    }

    public void keyPressed()
    {
        if (key == 'a')
        {
            getAudioPlayer().cue(0);
            getAudioPlayer().play();
        }


    }

    public void draw() {
        
        /*
		background(0);
		fill(255);
        try
        {
            // Call this if you want to use FFT data
            calculateFFT(); 
        }
        catch(VisualException e)
        {
            e.printStackTrace();
        }
        // Call this is you want to use frequency bands
        calculateFrequencyBands(); 
        drawMouth();	
		drawEyes();
        waw.render();
        dt.drawTeeth();
        sp.freqSpike();
        */
        for(int i = 0 ; i < getBands().length ; i ++)
        {
            background(0);
            fill(255);
            try
            {
                // Call this if you want to use FFT data
                calculateFFT(); 
            }
            catch(VisualException e)
            {
                e.printStackTrace();
            }
            // Call this is you want to use frequency bands
            calculateFrequencyBands(); 
            drawMouth();	
            drawEyes();
            waw.render();
            dt.drawTeeth();
            sp.freqSpike();

            if(getSmoothedBands()[i] * 0.65f > 29)
            {
                background(255);
            }

        }
        
	}
}
