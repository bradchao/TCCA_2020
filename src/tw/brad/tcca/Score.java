package tw.brad.tcca;

public class Score {

	public static void main(String[] args) {

		double doubleScore = Math.random();
		int score = (int)(doubleScore * 101);	// 
		System.out.println(score);
		if (score >= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Down");
		}
		System.out.println("End");
	}

}
