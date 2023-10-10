package DemoProject;
import org.testng.annotations.Test;

public class GroupDemo {

		@Test(groups = {"Mathamatics"})
		
		public void Sum()
		{
			System.out.println("sum belongs to math group");
		}
		
		@Test(groups = {"Alpahabhat"})
		public void Alphabhat()
		{
			System.out.println("A-z to a-z  belongs to alphabat method ");
		}
		
		@Test(groups = {"Mathamatics"})
		public void Divide()
		{
			System.out.println("Divide belongs to maths group");
			
		}
		
		
		

		@Test(groups = {"Bhopal"})
		
		public void  Bhopali()
		{
			System.out.println("Belongs to MP group");
		}
	}


