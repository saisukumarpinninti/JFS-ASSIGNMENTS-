package Q5;

import javax.annotation.Resource;



public class circle implements Shape {
	private point p ;

	@Override
	public void draw() {
		System.out.println("Drawing a circle");
		System.out.println("Center is ("+p.getx()+" . "+p.gety()+")");
	}
	
	public point getP() {
		return p;
	}
	
	@Resource(name="i")
	public void setP(point p) {
		this.p = p;
	}

}
