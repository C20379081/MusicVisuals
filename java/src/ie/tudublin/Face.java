package ie.tudublin;

import processing.core.PApplet;

public class Face extends PApplet {
    public void settings()
    {
        size(1024, 500);
        
        // Use this to make fullscreen
        //fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        //fullScreen(P3D, SPAN); 
    }


    void drawEyes() {
        //Right Eye
        arc( 700, 100, 300, 300, radians(0), radians(130), OPEN);

        //Left Eye
        arc( 324, 100, 300, 300, radians(50), radians(180), OPEN);

	}

    void drawMouth() {
        float teethWidth = 25;
        float halfTeethWidth = teethWidth / 2;
        float teethHeight = 40;
        float teethStart = width / 2 - 125;
        float teethEnd = width / 2 + 125;

        float x1 = teethStart;
        float x2 = teethStart + teethWidth;
        float x3 = teethStart + halfTeethWidth;

        float y1 = 310;
        float y2 = 310 + teethHeight;

        arc( width/2, 300, 300, 300, radians(0), radians(180), OPEN);

        fill(0);
        arc( width/2, 310, 250, 250, radians(0), radians(180), OPEN);

        
        for(float i = teethStart; i < teethEnd; i += teethWidth)
        {
            fill(255);
            triangle(x1, y1, x2, y1, x3, y2);

            x1 += teethWidth;
            x2 += teethWidth;
            x3 += teethWidth;

        }
    }

    
    public void draw() {
		background(0);
		fill(255);
        drawMouth();	
		drawEyes();
        
	}
}
