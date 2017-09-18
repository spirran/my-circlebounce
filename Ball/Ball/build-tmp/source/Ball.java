import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Ball extends PApplet {

PVector v1,v2;

boolean xx = true, yy = true;
public void setup() {
	
	v1 = new PVector(200,200);
	v2 = new PVector((int)(Math.random()*10+1),(int)(Math.random()*10+1));
}

public void draw() {
	background(204);
		v1.add(v2);
	
	if(v1.x >= 475) {
		v2.x = -(int)(Math.random() *10 +1);
		System.out.println("X DEcrease with " + v2.x);
	}
	if(v1.x <= 25) {
		v2.x = (int)(Math.random() *10 +1);
		System.out.println("X INcrease with " + v2.x);
	}
	if(v1.y >= 475) {
		v2.y = -(int)(Math.random() *10 +1);
		System.out.println("Y DEcrease with " + v2.y);
	}
	if(v1.y <= 25) {
		v2.y = (int)(Math.random() *10 +1);
		System.out.println("Y INcrease with " + v2.y);
	}
	
	noFill();
	strokeWeight(4);
	ellipse(v1.x, v1.y, 50, 50);
}
  public void settings() { 	size(500, 500); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Ball" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
