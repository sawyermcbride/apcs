package algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryHeap<T extends Comparable> {
	ArrayList<T> arr = new ArrayList<T >();
	int currentSize = 0;
	
	public BinaryHeap() {
	}
	public void insert(T elem) {
		arr.add(elem);
		percUp();
		++currentSize;
	}
	public T remove() {
		T e = arr.get(0);
		arr.set(0, arr.remove(currentSize-1));
		--currentSize;
		percDown();
		return e;
	}
	public T peek() {
		return arr.get(currentSize);
	}
	private void percUp() {
		int i = currentSize;
		while(i > 0 && arr.get(i).compareTo(arr.get(i/2)) < 0) {
			swap(arr, i, i/2);
			i/=2;
		}
	}
	private void swap(ArrayList<T> arr, int i1, int i2) {
		T tmp =  arr.get(i1);
		arr.set(i1, arr.get(i2));
		arr.set(i2, tmp);
	}
	private int minChild(int i) {
		if(i*2+2>arr.size())
			return i*2+1;
		else 
			return arr.get(i*2+1).compareTo(arr.get(i*2+2)) > 0 ? i*2+1 : i*2+2;
	} 
	private void percDown() {
		int i = 0;
		while( (i*2+2) < currentSize ) {
			int mc = minChild(i);
			if(arr.get(mc).compareTo(arr.get(i)) > 0)
				swap(arr, mc, i);
			i=mc;
		}
	}
	void p() {
		System.out.println(Arrays.toString(arr.toArray()));
	}
	public static void main(String[] args) {
		BinaryHeap<Integer> bh = new BinaryHeap<>();
		bh.insert(5);
		bh.insert(20);
		bh.insert(2);
		bh.insert(3);
		bh.p();
		System.out.println(bh.remove());bh.p();
	}

}
