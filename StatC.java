//Nathaniel Smith 
//3-20-13
//static variables
//chap 6

class StatC{
	int x =3;//instance vari
	static int y =4;//static belongs to the entire class

	//constructor
	StatC (int a, int b){
		x = a;
		y = b;}


	public static void main(String[] args){

		//create two instances (x,y)
		StatC s1 = new StatC(2, 1);
		System.out.println(s1.y);  //1

		StatC s2 = new StatC(5, 12);
		System.out.println(s1.y);  //12 if not static, if static y=12 now like a constant, it
		System.out.println(s1.x);//2							//is now all objects y are 12.


		//System.out.println(s2.y);



		//System.out.println("\n\n"+s1.x);
		//System.out.println(s2.y);

		//System.out.println(s1.y);
		//System.out.println(s2.x);

	}
}
