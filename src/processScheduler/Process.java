//author kevin barry
//Operating Systems
//class to store process data

package processScheduler;

public class Process  {
	private String name;
	private int burstTime;
	private int waitTime;
	
	//constructor
	public Process(String name, int burstTime) {
		super();
		this.name = name;
		this.burstTime = burstTime;
		waitTime = 0;
	}

	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}

	@Override
	public String toString() {
		return "Process [name=" + name + ", burstTime=" + burstTime + ", waitTime=" + waitTime + "]";
	}

}
