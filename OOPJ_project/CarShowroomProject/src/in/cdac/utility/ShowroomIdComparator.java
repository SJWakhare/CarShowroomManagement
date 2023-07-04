package in.cdac.utility;

import java.util.Comparator;
import in.cdac.domain.*;

public class ShowroomIdComparator implements Comparator<Showroom>
{

	@Override
	public int compare(Showroom s1, Showroom s2) 
	{
		return s1.getShowroom_id()- s2.getShowroom_id();
	}
	
}
