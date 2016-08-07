package objectOrientedProgramming.jukeBox;

import java.util.*;


public class PlayList {
	
	private Queue<Song> queue;
	private Song currentSong;
	
	public PlayList(Song song,Queue<Song> queue) {
		currentSong = song;
		this.queue=queue;
	}
	
	public Queue<Song> getQueue() {
		return queue;
	}
	
	public void addToPlayList(Song song){
		queue.add(song);
	}
	
	public void shufflePlayList(){
		List<Song> list = new ArrayList<Song>();
		list.addAll(queue);
		Collections.shuffle(list);
		while(!queue.isEmpty()){
			queue.poll();
		}
		
		queue.addAll(list);
		
	}
	
	public void printPlaylist(){
		Queue<Song> queueTemp = new LinkedList<>();
		queueTemp.addAll(queue);
		while(!queueTemp.isEmpty()){
			System.out.println(queueTemp.poll());
		}
	}
	
	public Song getNextSongToPlay(){ return queue.peek(); }
	public void queueUpSong(Song s){ queue.add(s); }
	
}
