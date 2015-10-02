package assignment04;
import java.util.Arrays;

public class RhombusStore{
	private Rhombus[] storage = new Rhombus[10];
	private int size = 0;
	
	//Methods
	
	public void add(Rhombus r){
		storage[size] = r;
		size++;
		if (size == storage.length){
			storage = Arrays.copyOf(storage, storage.length + storage.length/2);
		}
	}
	
	public int size(){
		return size;
	}
	
	public Rhombus get(int i){
		if(i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(i + "can only be from 0 to size-1");
        }
		return storage[i];
	}
	
	public void insert(int i, Rhombus r){
		if (i==size){
			add(r);
		}
		else if(i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(i + "can only be from 0 to size");
        }
		for(int j = size-1; j >= i; j--){
			Rhombus copy = storage[j];
			storage[j+1]=copy;
		}
		storage[i]=r;
		size++;
		if (size == storage.length){
			storage = Arrays.copyOf(storage, storage.length + storage.length/2);
		}
	}
}