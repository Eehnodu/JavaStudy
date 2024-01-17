package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {
		Pokemon p = new Pokemon();
		Mario m = new Mario();
		Zelda z = new Zelda();
		
		insert(p);
		insert(m);
		insert(z);
		
	}
	
	private static void insert(Pokemon game) {
		game.gameStart();
	}

}
