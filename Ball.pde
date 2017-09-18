PVector v1,v2;

boolean xx = true, yy = true;
void setup() {
	size(500, 500);
	v1 = new PVector(200,200);
	v2 = new PVector((int)(Math.random()*10+1),(int)(Math.random()*10+1));
}

void draw() {
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