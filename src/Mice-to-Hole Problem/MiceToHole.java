/*There are N Mice and N holes are placed in a straight line. 
Each hole can accommodate only 1 mouse. A mouse can stay at his position, 
move one step right from x to x + 1, or move one step left from x to x -1. Any of these moves consumes 1 minute. 
Assign mice to holes so that the time when the last mouse gets inside a hole is minimized.

Input : positions of mice are:
    4 -4 2
  positions of holes are:
    4 0 5
Output :  4
Assign mouse at position x = 4 to hole at 
position x = 4 : Time taken is 0 minutes 
Assign mouse at position x=-4 to hole at 
position x = 0 : Time taken is 4 minutes 
Assign mouse at position x=2 to hole at 
position x = 5 : Time taken is 3 minutes 
After 4 minutes all of the mice are in the holes.
Since, there is no combination possible where
the last mouse's time is less than 4, 
answer = 4.*/

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class MiceToHole {

	public int assignHole(List<Integer> mice, List<Integer> holes) {

		if (mice.size() != holes.size())
			return -1;

		/*sort the lists*/
		Collections.sort(mice);
		Collections.sort(holes);

		/*finding the max difference between the ith mice & hole*/
		int max = 0;
		for (int i = 0; i < mice.size(); i++) {
			if (max <= Math.abs(mice.get(i) - holes.get(i)))
				max = Math.abs(mice.get(i) - holes.get(i));
		}

		return max;
	}
	
	public static void main(String[] args) 
    { 
		MiceToHole gfg = new MiceToHole(); 
        ArrayList<Integer> mice = new ArrayList<Integer>(); 
        mice.add(4); 
        mice.add(-4); 
        mice.add(2); 
        ArrayList<Integer> holes= new ArrayList<Integer>(); 
        holes.add(4); 
        holes.add(0); 
        holes.add(5); 
        System.out.println("The last mouse gets into "+ 
         "the hole in time: "+gfg.assignHole(mice, holes)); 
    } 

}
