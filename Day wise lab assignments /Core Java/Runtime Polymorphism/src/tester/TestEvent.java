package tester;

import core.*;

public class TestEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int cnt=1;
          Person[] person = { new Student("goutam",88339977,cnt++,"Dac"), new Faculty("gotam",66778899,cnt++,"dbda"),new Student("govinda",66443322,cnt++,"ditiis")};
          for(Person p: person)
          System.out.println(p);
          
          System.out.println(person[0].equals(person[1]));
          
          
          }
          
          }
