package objectOrientedProgramming.jukeBox;

public class CDPlayer {
	
	private PlayList p;
	private CD c;

	public PlayList getPlaylist() {
		return p;
	}

	public void setPlaylist(PlayList p) {
		this.p = p;
	}

	public CD getCD() {
		return c;
	}

	public void setCD(CD c) {
		this.c = c;
	}

	public CDPlayer(PlayList p) {
		this.p = p;
	}

	public CDPlayer(CD c, PlayList p) {
		this.p = p;
		this.c = c;
	}

	public CDPlayer(CD c) {
		this.c = c;
	}

	public void playSong(Song s) {
	}
}
