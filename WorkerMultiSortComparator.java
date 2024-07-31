import java.util.Comparator;

public class WorkerMultiSortComparator implements Comparator<Worker> {
	
	public int compare(Worker work1, Worker work2) {
		int sortTitle = work1.getTitle().compareTo(work2.getTitle());
		int sortName = work1.getName().length()-work2.getName().length();
		if(sortTitle ==0) {
			return sortName;
		}
		else {
			return sortTitle;
		}
	}
}

