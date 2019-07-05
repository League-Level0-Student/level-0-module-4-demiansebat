
    PImage creeper;
   int creeperX= 289;
   int creeperY=103;
      
    void setup(){
       size(500,500);
PImage minecraft = loadImage("hidethecreeper.jpg");
minecraft.resize(500,500);
background(minecraft);
creeper=loadImage("hide.png");  
creeper.resize(30, 30);
    }

    void draw(){
image(creeper, creeperX, creeperY);
println(mouseX + " " +mouseY);
if (creeperX== mouseX && creeperY== mouseY){
  
}
if( mousePressed){
  if (isNear(creeperX, mouseX)){
    fill(#34673D);
 println("Congratulations, you found the creeper!!!");
 creeperX=(int)random(0,500);
  creeperY=(int)random(0,500);
}
  else{
fill(#FF0000);
  }
ellipse(mouseX, mouseY, 25,25);
}}
boolean isNear(int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
