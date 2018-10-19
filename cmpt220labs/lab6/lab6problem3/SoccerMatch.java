import java.util.*;

public class SoccerMatch {
	Date startTime;
	Date endTime;
	String venue;
	String home;
	String visitor;
	Player homePlayers[];
	Player visitorPlayers[];
	Goal homeGoals[];
	Goal visitorGoals[];
	int homePlayerCount, visitPlayerCount;
	int homeGoalCount, visitGoalCount;
	SoccerMatch() {
		startTime = endTime = null;
		venue = home = visitor = null;
		homePlayers = new Player[11];
		visitorPlayers = new Player[11];
		homeGoals = new Goal[10];
		visitorGoals = new Goal[10];
		homePlayerCount = visitPlayerCount = homeGoalCount = visitGoalCount = 0;
		for(int i = 0; i < 11; i++) {
			homePlayers[i] = new Player();
			visitorPlayers[i] = new Player();
		}
		for(int i = 0; i < 10; i++) {
			homeGoals[i] = new Goal();
			visitorGoals[i] = new Goal();
		}
	}
	SoccerMatch(Date St, Date En, String Ven, String Hom, String Vis) {
		this();
		startTime = St;
		endTime = En;
		venue = Ven;
		home = Hom;
		visitor = Vis;
	}
	void addHomePlayer(Player x) {
		homePlayers[homePlayerCount++] = x;
	}
	void addVisitorPlayer(Player x) {
		visitorPlayers[visitPlayerCount++] = x;
	}
	void addHomeGoal(Goal i) {
		homeGoals[homeGoalCount++] = i;
	}
	void addVisitorGoal(Goal i) {
		visitorGoals[visitGoalCount++] = i;
	}
	int [] getHomeGoals() {
		int goals[] = new int[10];
		for(int i = 0; i < 10; i++) 
			goals[i] = homeGoals[i].getPlayer().getGoals();
	return goals;
	}
	int [] getVisitorGoals() {
		int goals[] = new int[10];
		for(int i = 0; i < 10; i++)
			goals[i] = visitorGoals[i].getPlayer().getGoals();
	return goals;
	}
	String getWinner() {
		String winStat = "";
		int homeGoals[] = getHomeGoals();
		int visitGoals[] = getVisitorGoals();
		int totalHome = 0, totalVisit = 0;
		for(int i = 0; i < 10; i++) {
			totalHome += homeGoals[i];
			totalVisit += visitGoals[i];
		}
		winStat = "\n Home Team Goals in Total: " + totalHome 
				+ "\n Visitor Team Goals in Total: " + totalVisit;
		if(totalHome > totalVisit)
			winStat += "\n Winner: The Home Team";
			else if(totalHome > totalVisit)
				winStat += "\n Winner: The Visitor Team";
				else
					winStat += "\n Tie";
		return winStat;
	}
	public static void main(String[] args) {
		Random rand = new Random();
		@SuppressWarnings("deprecation")
		Date d1 = new Date(2018, 11, 12, 10, 12, 30);
		@SuppressWarnings("deprecation")
		Date d2 = new Date(2018, 11, 12, 12, 40, 30);
		SoccerMatch sm = new SoccerMatch(d1, d2, "Barry”, "Drake”, "Parker”);

		String homePlayerName[] = {"Alex", "Rondell", "Sunny", "Akhil", "Lee", "Gary", "Kwaku", "Tyus", "Bynum", "Andrew", "Mac"};
		String visitPlayerName[] = {"Rohan", "Noel", "Max", "Jonathan", "Rohan", "Sam", "Bryan", "Arjun", "Smith", "Bruce", "Tony"};

		for(int x = 0; x < 11; x++) {
			sm.addHomePlayer(new Player(homePlayerName[x], rand.nextInt(10), "Dragen"));
			sm.addVisitorPlayer(new Player(visitPlayerName[x], rand.nextInt(10), "Panthor"));
		for(int i = 0; i < 10; i++) {
			sm.addHomeGoal(new Goal(rand.nextInt(59), sm.homePlayers[i]));
			sm.addVisitorGoal(new Goal(rand.nextInt(59), sm.visitorPlayers[i]));

	}

	System.out.print("\n\n*************************** Home Team Players *************************** ");

	for(int i = 0; i < 11; i++)

	System.out.println(sm.homePlayers[i]);
	System.out.print(“\n\n—------—------—------—------ Visiting Team Players —------—------—------—------");

	for(int i = 0; i < 11; i++)

	System.out.println(sm.visitorPlayers[i]);

	System.out.print("\n\n*************************** Home Team Goals *************************** ");

	for(int i = 0; i < 10; i++)

	System.out.println(sm.homeGoals[i]);

	System.out.print("\n\n—------—------—------—------ Visiting Team Goals —------—------—------—------ ");

	for(int i = 0; i < 10; i++)

	System.out.println(sm.visitorGoals[i]);

	System.out.print("\n\n*************************** GAME STATUS *************************** ");

	System.out.println(sm.getWinner());

		}
	}

}
