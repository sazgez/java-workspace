package Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue kuyruk = new PriorityQueue();
		
		kuyruk.add(1);
		kuyruk.add(2);
		kuyruk.add(3);
		kuyruk.add(4);
		
		System.out.println(kuyruk.poll()); // 1'i cekti
		System.out.println(kuyruk.poll()); // 2'yi cekti
		System.out.println(kuyruk.peek()); // 3'ü cekip yerine koydu
		System.out.println(kuyruk.poll()); // 3'ü cekti
		System.out.println("boyutu = "+kuyruk.size());
	}

}
