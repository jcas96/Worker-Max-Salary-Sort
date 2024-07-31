import java.util.ArrayList;
import java.util.Collections;

public class WorkerMaxSalaryTest {

	public static void main(String[] args) {

		ArrayList<Worker> workerAL = new ArrayList<Worker>();
		workerAL.add(new Worker(10,"Maya", 25000, "Engineer"));
		workerAL.add(new Worker(120, "Jose", 45000, "Programmer"));
		workerAL.add(new Worker(210, "Abdul", 14000, "Analyst"));
		workerAL.add(new Worker(150, "Elissa", 24000, "Manager"));
		
		Collections.sort(workerAL);

		
		System.out.printf("Worker with max salary: %S",workerAL.get(0).toString());
	}

}
