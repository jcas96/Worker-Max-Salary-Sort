import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class WorkerMultiSortTest {

	public static void main(String[] args) {
		ArrayList<Worker> workerAL = new ArrayList<Worker>();
		
		workerAL.add(new Worker(10, "Javier", 25000,"Programmer"));
		workerAL.add(new Worker(120, "Kwame", 45000, "Analyst"));
		workerAL.add(new Worker(210, "Teressa", 14000, "Programmer"));
		workerAL.add(new Worker(150, "Richard", 24000,"Engineer"));
		workerAL.add(new Worker(10, "Luis", 29000, "Programmer"));
		workerAL.add(new Worker(120, "Ali", 46000, "Analyst"));
		workerAL.add(new Worker(210, "Brenda", 9000, "Programmer"));
		workerAL.add(new Worker(150, "Patel", 22000, "Engineer"));
		
		Collections.sort(workerAL, new WorkerMultiSortComparator());
		
		Iterator<Worker>workerIter = workerAL.iterator();
		while(workerIter.hasNext()) {
			System.out.printf(workerIter.next().toString());
		}
	}

}
