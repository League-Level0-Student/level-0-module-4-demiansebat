PImage donkey;
PImage tail;

void setup(){
  donkey = loadImage("Donkey-2-icon.png");      //change the file name if you need to
tail = loadImage("tail-clipart-donkey-8.png");      //change the file name if you need to
  size(750, 750); 
  donkey.resize(width,height);
  

  tail.resize(336,334);
}

void draw(){
  
  image(tail, mouseX-(336/2), mouseY-50);
  rect(525, 300, 50, 50);
  if(dist(525, 300, mouseX, mouseY) < 30){
    background (donkey);
  }
}
