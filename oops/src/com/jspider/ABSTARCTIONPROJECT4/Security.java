package com.jspider.ABSTARCTIONPROJECT4;

public class Security {
	static void checkIssue(Antivirus a)
	{
		if(a!=null) {
			a.install();
			a.scan();
			a.log();
			
		}
	}

}
