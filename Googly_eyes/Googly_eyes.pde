
    void setup(){
           PImage face = loadImage("Dog.jpg");
    size(600,600);
    face.resize(width,height);
    background(face);
    }

    void draw(){
ellipse(400,65,20,20);
  fill(#0f0f0e);
ellipse(450,55,20,20);
  fill(#46997f);
  ellipse(mouseX,mouseY,7,7);
   ellipse(400,65,17,17);
    ellipse(400,65,15,15);
      ellipse(400,65,10,10);
     ellipse(400,65,5,5);
 
}
