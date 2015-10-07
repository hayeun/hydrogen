package hydrogen.player;

public class Player {

	//constructor
	Player(String name, String team, int birth, byte backNumber, float average, short games){
		setName(name);
		setTeam(team);
		setBirth(birth);
		setBackNumber(backNumber);
		setAverage(average);
		setGames(games);
	}
	
	//set functions
	public void setName(String name) {
		//if(name!=null)
			this.name = name;			
	}

	public void setTeam(String team){
		//if(team!=null)
			this.team = team;
	}

	public void setBirth(int birth){
		//if(birth/10000000>1)
			this.birth = birth;
	}

	public void setBackNumber(byte backNumber){
		this.backNumber = backNumber;
	}

	public void setAverage(float average){
		this.average = average;
	}

	public void setGames(short games){
		this.games = games;
	}
	
	//get functions
	public String getName(){
		return name;
	}
	
	public String getTeam(){
		return team;
	}
	
	public int getBirth(){
		return birth;
	}
	
	public byte getBackNumber(){
		return backNumber;
	}
	
	public float getAverage(){
		return average;
	}
	
	public short getGames(){
		return games;
	}
	

private String name;
private String team;
private int birth;
private byte backNumber;
private float average;
private short games;

}
