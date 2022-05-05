# Music Visualiser Project

Name: 

Student Number: 
C20379081 - Harry O'Donnell
C20376686 - Matthew Jungmann
C20485612 - Dylan Nolan


## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment
We built this project together through in person and online collabrative sessions, which has led to the final product that we are all proud of. This assignment is based on Nazar the evil eye. We decided to have an interactive face as the centre piece and the eyes presenting an element of hypnosis on the user. All the elements of our visualisation are perfectly symmetrical which is a key aspect to the visual beauty of the project, this appealing nature was an aspect we wanted to hone in on.
Overall we are very pleased with the outcome and we feel we have learnt many new skills and now have a proficient understanding of java processing and git. 

# Instructions
Press 'a' to begin the music, this starts the visuals.

# How it works
-The face, eyes, teeth and spikes are drawn 
```Java
drawEyes()
drawMouth()
drawTeeth()
freqSpike()
```

-Song loads and plays
```Java
loadAudio("agate.mp3");
```

-The eyes react and expand to the amplitude
```Java
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
```

-The teeth move and color react to the amplitude
```Java
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
```

-The spikes move and react to the frequency bands 
```Java
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
```

# What I am most proud of in the assignment
There are two areas of this assignment that we are the most proud of, one relating to the actual coding, and one relating to how we went about the project.

When we began this assignment, there was a clear vision of what we wanted the end visuals to look like but no real idea of how to bring them to fruition. Our first session as a group we spent a lot of time going around in circles, experimenting with different methods to try and gain a better understanding of how Processing, and Java in general, works. It was frustrating, and many subsequent sessions were spent doing much the same as the first. About halfway through the project we all seemed to have a breakthrough, classes began to make sense and when we met up, work was definitely moving faster than before. The perserverance from the early sessions was now paying off, although none of us realised it at the time, the hours spent banging our heads against the wall were very worth it.

Coding wise the colour changing teeth are our favourite part of the assignment. It was an area that we found a bit confusing, but once we managed to get it working, it was very satisfying. We created the teeth using a loop, and then made the fangs by adding additional height to the teeth by adding ifs to identify the first and last. Originally we had the colour of the teeth change with the frequency of the music but after testing, we realised that it looks significantly better when it reacts with amplitude.

# Video URL
https://www.youtube.com/watch?v=ccmXxjAdPO4
