package objectOrientedProgramming.jukeBox;

public class Song {
	private String name;

	public Song(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
