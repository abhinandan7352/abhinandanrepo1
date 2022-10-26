import java.util.*;
class Ar{
	
		int length,breadth;
		void input(){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the length:");
			length=sc.nextInt();
			System.out.println("enter the breadth:");
			breadth=sc.nextInt();
		
	}
}
	class Soma extends Ar{
		int vol;
		void input2(){
			Scanner sc=new Scanner(System.in);
			input();
			System.out.println("enter the volume:");
			vol=sc.nextInt();
			
		}
		void show(){
			System.out.println("the area is:"+length*breadth);
			System.out.println("the volum is:"+length*breadth*vol);
		}
	}

	class Area{
		public static void main(String args[]){
			Soma a=new Soma();
			a.input2();
			a.show();
		}
	}
