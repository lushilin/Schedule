import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ScheduleTest {

	private Work work;
	private Schedule schedule;
	
	@Before
	public void setUp() throws Exception {
		schedule = new Schedule();
	}

	@Test
	public void testFCFS() {
		List<Work> works = new ArrayList<Work>();
		works.add(new Work("A", 0, 4));
		works.add(new Work("B", 1, 3));
		works.add(new Work("C", 2, 5));
		works.add(new Work("D", 3, 2));
		works.add(new Work("E", 4, 4));
		double avgCircleTime = schedule.FCFS(works).get(1);
		double avgCircleTimeWP = schedule.FCFS(works).get(2);
		assertEquals(9,avgCircleTime,0);
		assertEquals(2.8,avgCircleTimeWP,0);
	}


	@Test
	public void testSJF() {
		List<Work> works = new ArrayList<Work>();
		works.add(new Work("A", 0, 4));
		works.add(new Work("B", 1, 3));
		works.add(new Work("C", 2, 5));
		works.add(new Work("D", 3, 2));
		works.add(new Work("E", 4, 4));
		double avgCircleTime = schedule.SJF(works).get(1);
		double avgCircleTimeWP = schedule.SJF(works).get(2);
		assertEquals(8,avgCircleTime,0);
		assertEquals(2.1,avgCircleTimeWP,0);
	}


}
