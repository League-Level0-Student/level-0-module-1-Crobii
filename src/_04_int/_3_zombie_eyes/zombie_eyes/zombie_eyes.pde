PImage face;
void setup() {
size(500, 500);
face = loadImage ("zombieEyes.png");
face.resize (500, 500);
}
void draw() {
image(face, 0, 0);
fill(255, 255, 0);
  ellipse(310, 130, 80, 60);
  ellipse(209, 125, 100, 100);
fill(mouseX, mouseY, 0);
  ellipse (310, 130, 20, 20);
  ellipse(209, 125, 30, 30);
print(mouseX, mouseY);

}
