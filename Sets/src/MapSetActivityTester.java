public class MapSetActivityTester
{
	public static void main(String[] args) 
	{	
		System.out.println("Team Set");
		TeamSet one = new TeamSet();
		one.add(new Wrestler("Alok", 130));
		one.add(new Wrestler("Cody", 60));
		one.add(new Wrestler("John", 90));
		one.add(new Wrestler("John", 90));
		one.display();
		System.out.println(one.avgWeight());
		System.out.println(one.lightweights());
		
		System.out.println();
			
		System.out.println("Team Map");
		TeamMap a = new TeamMap();
		a.add(new Wrestler("Bob", 157));
		a.add(new Wrestler("Fred", 129));
		a.add(new Wrestler("Jake", 100));
		a.add(new Wrestler("Arnold", 199));
		a.add(new Wrestler("Stan", 120));
		a.display();
		System.out.println("Change Arnold's group");
		a.changeWeightGroup(new Wrestler("Arnold", 199), 10);
		System.out.println("Arnold is in Weight Group " + a.get(new Wrestler("Arnold", 199)));
		System.out.println();
		a.display();
	}
}
