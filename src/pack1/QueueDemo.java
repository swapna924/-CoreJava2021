package pack1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo implements Queue1 {

	public static void main(String[] args) {
	

		Queue<Integer> l1 = new LinkedList<>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);

		System.out.println(l1.remove());
		System.out.println("The result after removing the element "+l1);
		System.out.println(l1.offer(80));
		System.out.println(l1);
		QueueDemo q = new QueueDemo();
		q.insert();
		q.delete();
	}

	@Override
	public void delete() {
	}

	@Override
	public void insert() {
		

	}

}
