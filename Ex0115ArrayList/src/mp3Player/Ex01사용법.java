package mp3Player;

import javazoom.jl.player.MP3Player;

public class Ex01사용법 {

	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player();
		
		mp3.play("C:\\Users\\smhrd\\Desktop\\JavaStudy\\Ex0115ArrayList\\player\\HypeBoy.mp3");
		mp3.stop();
		
		mp3.play("C:\\Users\\smhrd\\Desktop\\JavaStudy\\Ex0115ArrayList\\player\\한페이지가될수있게.mp3");
		mp3.stop();	
		
		System.out.println(mp3.isPlaying());
	}
}
