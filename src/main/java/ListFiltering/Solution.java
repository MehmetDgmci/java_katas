package ListFiltering;


import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static List<Object> filterList(final List<Object> list) {

		List<Object> listToFilter = list;
		List<Object> filteredList = new ArrayList<>();

		for (Object element : listToFilter) {
			if (element instanceof Integer) {
				filteredList.add(element);
			}
		}
		return filteredList;
	}

}
