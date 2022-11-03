package controller.admin;

import org.json.simple.JSONArray;

public class ssss {
	public String mon_info() {
		JSONArray array = new JSONArray();
	
		String monname="독수리";
		String monhp="300";
		String mondmg="200";
		
		array.add(monname);
		array.add(mondmg);
		array.add(mondmg);
		
		for(int i=0 ; i<array.size();i++) {
			System.out.println(array);
		}
		return null;
	}
	
}
