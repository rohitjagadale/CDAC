package core;

public class Faculty extends Person {
	 private String sme;
     
     public Faculty(String n,double mob,int i,String c) {
    	 super(n,mob,i);
    	 this.sme=c;
     }
     @Override
     public String toString() {
    	   return "faculty "+super.toString()+" sme = "+sme;
     }
     @Override
     public String specification() {
    	 return "specif = teaching";
     }
     @Override
     public boolean equals(Object obj1) {
    	 Person p = (Person)obj1;
    	
    	if( super.getName() == p.getName() )
    		return true;
    	return false;
     }
}
