package July9;

public class CountOfMatches {

	/*
	 * PseudoCode:
	 * 
	 * Input get the N teams value
	 * Declare three variables  to Count teams, matches, and total
	 * While to check whether team count is even or odd
	 * if it is odd, then teams	=(n/2)+1;
	 * if it is odd, then teams	=n/2;
	 * Count the totalmatches in each iteration (n/2)
	 *  
	 */
	public int countOfTeams(int team) {
		int count=0;
		 while (team > 1) {
			 if(team%2==0) {
				 count= count+team/2;
				 team = team -team/2;
			 }else
			 {
				 count= count+(team-1)/2;
				 team = team -(team-1)/2;
				 
			 }
		 }
		 return count;
	}
}
