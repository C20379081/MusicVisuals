package ie.tudublin;

public class DancyTeeth extends Visual {
    Face fc;

    public DancyTeeth(Face fc)
    {
        this.fc = fc;
    }

    public void drawTeeth(){
        float teethWidth = 25;
        float halfTeethWidth = teethWidth / 2;
        float teethHeight = 40;
        float teethStart = fc.width / 2 - 125;
        float teethEnd = fc.width / 2 + 125;

        float x1 = teethStart;
        float x2 = teethStart + teethWidth;
        float x3 = teethStart + halfTeethWidth;

        float y1 = 310;
        float y2 = 310 + teethHeight;

        for(float i = teethStart; i < teethEnd; i += teethWidth)
        {
            fc.fill(255);
            fc.triangle(x1, y1, x2, y1, x3, y2);

            x1 += teethWidth;
            x2 += teethWidth;
            x3 += teethWidth;

        }
    }
    
}
