PVector circle,mouseVec;
void setup()
{
      size(640,480); 
      circle = new PVector(200,200);
}
void draw()
{
      background(55, 55, 55);
    strokeWeight(3);
    mouseVec = new PVector(mouseX, mouseY);
    circle.x += (mouseVec.x - circle.x) * 0.1;
    circle.y += (mouseVec.y - circle.y) * 0.1;
    noFill();
    ellipse(circle.x, circle.y, 50, 50);
    
}