package ie.tudublin;

public class StrobeBack extends Visual{
    Face fc;

    public StrobeBack(Face fc){
        this.fc = fc;
    }

    public void backColour(){
        int timer = 0;
        fc.colorMode(RGB);
        if (millis() - timer >= 2000) {
            fc.background(random(255));
            timer = millis();
        }
    }
}
