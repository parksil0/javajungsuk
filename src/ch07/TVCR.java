package ch07;

class VCR {
	boolean power;
	int counter = 0;
	void power() { power = !power; }
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}

public class TVCR extends Tv {
	VCR vcr = new VCR();	//VCRŬ������ ���Խ��Ѽ� ����Ѵ�.
	int counter = vcr.counter;
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}

}
