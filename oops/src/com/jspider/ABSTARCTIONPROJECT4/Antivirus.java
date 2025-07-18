package com.jspider.ABSTARCTIONPROJECT4;

abstract class Antivirus {
	void install() {
		System.out.println("Installing antivirus");
	}
	abstract  void scan();
	void log() {
		System.out.println("displaying scan log");
	}

}
class FreeAntivirus extends Antivirus{
	@Override
	void scan() {
		System.out.println("Basic scan");
	}
}
class PaidAntivirus extends Antivirus{
	@Override
	void scan() {
		System.out.println("Complete  scan");
	}
}

class EnterpriseAntivirus extends Antivirus{
	@Override
	void scan() {
		System.out.println("Complete + Network  scan");
	}
}

