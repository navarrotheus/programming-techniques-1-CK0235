class Ponto {
 float x, y;

 Ponto(){
  x = 0;
  y = 0;
 }

 Ponto(float x, float y){
  this.x = x;
  this.y = y;
 }

 Ponto(float a){
  this.x = a;
  this.y = a; 
 }

 void print(){
  System.out.println(this.x);
  System.out.println(this.y);
 }

 void mover(float dx, float dy){
  x += dx;
  y += dy;
 }
}
