package assignment04;

public class Tester{
	public static void main(String[] args){

		RhombusStore store = new RhombusStore();
	
		for (double i = 1; i < 21; i++){
			Rhombus newRhombus = new Rhombus(i, 45);
			store.add(newRhombus);
		}
		for (int i = 0; i<store.size(); i++){
			Rhombus sideRhombus = store.get(i);
			System.out.print(sideRhombus.getSide() + "");
		}
		for (int i = 22; i<33; i++){
			store.insert(5, new Rhombus(i, 45));
		}
		for(int i = 0; i<store.size(); i++){
			System.out.print(store.get(i).getSide() + "");
		}
	}
}