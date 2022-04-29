package ie.tudublin;

import example.AudioBandsVisual;
import example.RotatingAudioBands;
import example.CubeVisual;
import example.MyVisual;

public class Main
{	

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch(a, new Face());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();			
	}
}