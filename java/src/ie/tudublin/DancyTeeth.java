package ie.tudublin;

public class DancyTeeth extends Visual {
    Face fc;

    public DancyTeeth(Face fc)
    {
        this.fc = fc;
    }

    public void drawTeeth(){
        fc.colorMode(HSB);
        float teethWidth = 25;
        float halfTeethWidth = teethWidth / 2;
        float teethHeight = 40;
        float teethStart = fc.width / 2 - 125;
        float teethEnd = fc.width / 2 + 125;

        float x1 = teethStart;
        float x2 = teethStart + teethWidth;
        float x3 = teethStart + halfTeethWidth;
        float x4 = teethStart;

        float y1 = 311;
        float y2 = 310 + teethHeight;
        int j = 20;


        for(float i = teethStart; i < teethEnd; i += teethWidth)
        {
            fc.fill(j * (fc.getSmoothedAmplitude() * 5), 255, 255);

            if(teethStart == i)
            {
                y2 += 25;
            }
            if(teethEnd - teethWidth == i)
            {
                y2 += 25;
            }

            fc.triangle(x1, y1, x2, y1, x3, y2 + (fc.getSmoothedAmplitude() * 200));

            x1 += teethWidth;
            x2 += teethWidth;
            x3 += teethWidth;
            
            j+=20;
            y2 = 310 + teethHeight;
        }
    }
    
}
