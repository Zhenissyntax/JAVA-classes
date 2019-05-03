package Group;



public interface Shape {
	 void calculateArea();
	    void calculatePerimiter();

	}
	class Circle implements Shape{

	    int r = 0;
	    double pi = 3.14, ar = 0;
	    double p =0;
	    
	    
	    @Override
	    public void calculateArea() {
	        r =5;
	        ar = pi*(r*r);
	        System.out.println("Area of circle:" + ar );
	        
	    }

	    @Override
	    public void calculatePerimiter() {
	        
	        p = 2*pi*r;
	        System.out.println("perimeter of circle:" + p);
	    }
	    
	}
	class Square implements Shape{
	    
	    int area;
	    int a = 4;

	    @Override
	    public void calculateArea() {
	        
	        area = a*a;
	        
	        System.out.println("Area of squre: "+area);
	        
	    }

	    int P;
	    int b = 5;
	    
	    @Override
	    public void calculatePerimiter() {
	        
	        P=5*4;
	        
	        System.out.println("Perimeter of square:" + P);
	        
	    }
	    
	}
	


	
	