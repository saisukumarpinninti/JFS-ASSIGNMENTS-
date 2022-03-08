package Q5;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Required;

public class dot implements Shape{
	private point center ;
	@Inject
	private injectimpl injectImpl;
	public point getcenter() {
		return center;
	}
	@Required
	public void setcenter(point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Dot is at : ("+center.getx()+" . "+center.gety()+")");
		System.out.println(injectImpl);
	}


}
