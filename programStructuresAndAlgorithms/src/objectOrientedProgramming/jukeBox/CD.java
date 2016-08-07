package objectOrientedProgramming.jukeBox;

import java.util.*;

public class CD {
	private String id;
	private String artistName;
	private ArrayList<Song> songList;

	public CD(String id, String artistName, ArrayList<Song> songList) {
		this.id = id;
		this.artistName = artistName;
		this.songList = songList;
	}

	public String getArtistName() {
		return artistName;
	}

	public String getId() {
		return id;
	}

	public ArrayList<Song> getSongList() {
		return songList;
	}

}
