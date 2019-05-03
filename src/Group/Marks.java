
package Group;
public abstract class Marks{
 int sub1;
 int sub2;
 int sub3;
 abstract double getPrecentage();
	
}

class A extends Marks{


	@Override
	double getPrecentage() {
		double precentage=(sub1+sub2+sub3)/3;
		return precentage;
		}
		
	public double  A(int sub1, int sub2,int sub3){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		double pr=this.getPrecentage();
		     return pr;
			
			}
		
		
	}
class B extends Marks{
	int sub4;
	@Override
	double getPrecentage() {
		double precentage=(sub1+sub2+sub3+sub4)/4;
		return precentage;
		}
		
	public double  A(int sub1, int sub2,int sub3, int sub4){
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
		double pr=this.getPrecentage();
		     return pr;
}

}
	
