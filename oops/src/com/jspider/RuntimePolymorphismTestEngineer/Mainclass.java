package com.jspider.RuntimePolymorphismTestEngineer;

public class Mainclass {
	public static void main(String[] args) {
		ManualTestEngineer mt= new ManualTestEngineer();
		QALead.AssignTest(mt);
		AutomationTestEngineer at= new AutomationTestEngineer();
		QALead.AssignTest(at);
		
	}

}
