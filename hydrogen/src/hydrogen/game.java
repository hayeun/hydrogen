package hydrogen;

public class Game {
	
	private int date;
	private String homeTeam;
	private String awayTeam;
	private String field;
	private byte homeScore;
	private byte awayScore;
	private byte homeHit;
	private byte awayHit;
	private byte homeRun;
	private byte awayRun;
	private byte homeError;
	private byte awayError;
	
	//constructor
	public Game(int date, String homeTeam, String awayTeam, String field, byte homeScore, byte awayScore, byte homeHit, byte awayHit, byte homeRun, byte awayRun, byte homeError, byte awayError ){
		setDate(date);
		setHomeTeam(homeTeam);
		setAwayTeam(awayTeam);
		setField(field);
		setHomeScore(homeScore);
		setAwayScore(awayScore);
		setHomeHit(homeRun);
		setAwayHit(awayRun);
		setHomeError(homeError);
		setAwayError(awayError);
	}
	//setter
	public void setDate(int date){
		this.date =date;
	}
	public void setHomeTeam(String awayTeam){
		this.awayTeam = awayTeam;
	}
	public void setAwayTeam(String homeTeam){
		this.homeTeam = homeTeam;
	}
	public void setField(String field){
		this.field = field;
	}
	public void setHomeScore(byte homeScore){
		this.homeScore = homeScore;
	}
	public void setAwayScore(byte awayScore){
		this.awayScore = awayScore;
	}
	public void setHomeHit(byte homeHit){
		this.homeHit = homeHit;
	}
	public void setAwayHit(byte awayHit){
		this.awayHit = awayHit;
	}
	public void setHomeRun(byte homeRun){
		this.homeRun = homeRun;
	}
	public void setAwayRun(byte awayRun){
		this.awayRun = awayRun;
	}
	public void setHomeError(byte homeError){
		this.homeError = homeError;
	}
	public void setAwayError(byte awayError){
		this.awayError = awayError;
	}
	
	//getter
	public int getDate(){
		return this.date;
	}
	public String getHomeTeam(){
		return this.homeTeam;
	}
	public String getAwayTeam(){
		return this.awayTeam;
	}
	public String getField(){
		return this.field;
	}
	public byte getHomeScore(){
		return this.homeScore;
	}
	public byte getAwayScore(){
		return this.awayScore;
	}
	public byte getHomeHit(){
		return this.homeHit;
	}
	public byte getAwayHit(){
		return this.awayHit;
	}
	public byte getHomeRun(){
		return this.homeRun;
	}
	public byte getAwayRun(){
		return this.awayRun;
	}
	public byte getHomeError(){
		return this.homeError;
	}
	public byte getAwayError(){
		return this.awayError;
	}
	
	
}	
