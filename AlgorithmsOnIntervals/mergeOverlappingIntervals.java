package AlgorithmsOnIntervals;

import java.util.*;

public class mergeOverlappingIntervals {
	public ArrayList<Interval> merge(ArrayList<Interval> in) {
	        ArrayList<Interval> al = new ArrayList<>();
	        Collections.sort(in,new Comparator<Interval>(){
	            public int compare(Interval i1,Interval i2)
	            {
	                return i1.start - i2.start;
	            }
	        });
	        Interval temp=in.get(0);
	        for(int i=1;i<in.size();i++){
	            // System.out.println(temp.start+" "+temp.end);
	            if(temp.end<in.get(i).start){
	                al.add(temp);
	                temp=in.get(i);
	            }else if(temp.end<in.get(i).end){
	                temp.end=in.get(i).end;
	            }
	        }
	        al.add(temp);
	        return al;
	    }

}
