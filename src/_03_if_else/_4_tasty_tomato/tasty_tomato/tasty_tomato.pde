void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(255, 0, 0);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(0, 155, 0);
    rect(176, 103, 12, 32);
    fill(255, 255, 255);
    if(mousePressed){
     ellipse(100, 150, 50, 50); 
    }
}
