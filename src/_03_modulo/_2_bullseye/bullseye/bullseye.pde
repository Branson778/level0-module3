
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  int size=200;
  for(int i = 0;i < 8; i++){
    if (i%2==0){
      fill(255,0,0);
    }
    else{
      fill(#FFFFFF);
    }
    ellipse(250,250,size,size);
    size-=25;
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
