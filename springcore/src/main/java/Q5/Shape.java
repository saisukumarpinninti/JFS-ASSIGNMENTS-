package Q5;

public interface Shape {
	
	public abstract void draw() ;

}

class injectimpl{
	int s;
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public String toString() {
        return ("@injectImplementation"+s);
    }
}
 