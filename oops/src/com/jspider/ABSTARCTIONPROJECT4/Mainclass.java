package com.jspider.ABSTARCTIONPROJECT4;

public class Mainclass {
	public static void main(String[] args) {
		FreeAntivirus ft= new FreeAntivirus();
		Security.checkIssue(ft);
		PaidAntivirus pt= new PaidAntivirus ();
		Security.checkIssue(pt);
		EnterpriseAntivirus et= new EnterpriseAntivirus();
		Security.checkIssue(et);
	}

}
