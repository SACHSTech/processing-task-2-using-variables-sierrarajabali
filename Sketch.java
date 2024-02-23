import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  
   // Background color set to blue
  public void setup() {
    background(138, 181, 237);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

  // Drawing of the house
  public void draw() {

  //variables of width and lenght
  int length = 400;
  int width = 400;
	  
	// The grass (foreground) of the background
  fill(21, 153, 51);
  rect(0, (float)(width *0.625), length, width);  
  
  // The roof of the house
  fill(150, 58, 38);
  triangle((float)(length*0.25), (float)(width*0.5), (float)(length*0.5), (float)(width*0.2), (float)(length*0.75),(float)(width*0.5));

  // Base of the house
  fill(255, 77, 207);
  rect((float)(length*0.25), (float)(width*0.5), (float)(length*0.5), (float)(length*0.5)); 

  // Door of the house
  fill(150, 150, 150);
  rect((float)(length*0.325), (float)(width*0.7375), (float)(length*0.175), (float)(width*0.325)); 

  // Doorknob of the house
  fill(255, 255, 48);
  circle((float)(length*0.375), (float)(width*0.9), 20);
  }
  
  // define other methods down here.
}