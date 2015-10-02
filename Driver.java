package assignment04;
public class Driver {
    public static void main(String[] args) {
        System.out.println(Rhombus.FORTY_FIVE_DEGREES);
        Rhombus test = new Rhombus(100, 45);
        Rhombus test2 = new Rhombus(50, 60);
		
		//Test rhombus for resize, reshape radians, reshape degrees
		Rhombus test3 = new Rhombus(75, 55);
		System.out.println(test3.getArea());
		
		//Resize
		try{
			test3.resize(-200);
		} 
		catch(IllegalArgumentException e){
			System.out.println("As expected, resize threw an IllegalArgumentException");
		}
		test3.resize(50);
		System.out.println(test3.getArea());
		
		//Reshape radians
		try{
			test3.reshapeRadians(0);
		}
		catch(IllegalArgumentException e){
			System.out.println("As expected, reshape radians threw an IllegalArgumentException");
		}
		test3.reshapeRadians(1.42);
		System.out.println(test3.getArea());
		
		//Reshape degrees
		try{
			test3.reshapeDegrees(0);
		}
		catch(IllegalArgumentException e){
			System.out.println("As expected, an IllegalArgumentException was thrown");
		}
		test3.reshapeDegrees(35);
		System.out.println(test3.getArea());
		
		
        System.out.println(test.getAcuteAngle());
        System.out.println(test.getArea());
        System.out.println(test2.getArea());
        Rhombus[] array = {test, test2, null};
        array[2] = new Rhombus(200,30);
        for(Rhombus r : array) {
            System.out.println(r.getArea());
        }
        System.out.println(Rhombus.getAreaOfRhombus(200, Math.PI/6));
		try{
			test2.resize(-1000);
		}
		catch(IllegalArgumentException e){
			System.out.println("As expected, an exception was thrown.");
		}
    }

}
