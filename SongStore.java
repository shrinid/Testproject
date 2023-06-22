package com.abc;
import java.util.*; 


 class User{
	int capacity;
	String name;
	List<String> song_list= new ArrayList<String>();
	public User(String name,int capacity) {
		this.capacity=capacity;
		this.name=name;
	}
	public void add_song_to_list(String song_name) {
		if(this.capacity==this.song_list.size())
		{
			
			this.song_list.remove(0);
		}
		this.song_list.add(song_name);
	}
	public void display_songs_in_list() {
		System.out.println(this.name);
		System.out.println(this.song_list);
	}
}
public class SongStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, User> hash_table = 
		        new Hashtable<String, User>();
		  Scanner sc = new Scanner(System.in); 
		    System.out.println("enter capacity : ");
		    int capacity=sc.nextInt();
		    while(true) {
		    	Scanner sc1 = new Scanner(System.in);
		    	System.out.println("enter user/song pair : ");
		    	String data =sc1.nextLine();
		    	String username=data.split("/")[0];
		    	String songname=data.split("/")[1];
		    	if(!hash_table.containsKey(username)) {
		    		User userobj=new User(username, capacity);
		    		hash_table.put(username, userobj);
		    	}
		    	hash_table.get(username).add_song_to_list(songname);
		    	hash_table.forEach(
		    			(k,v)-> System.out.println("user : " + k + ", song_list : " + v.song_list));
		    	
		    	
		    	
		    	
		        
		    	
		    }
	}

}
