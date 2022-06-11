package Movie.main;

import Movie.frame.FrameBase;
import Movie.frame.FrameBegin;

public class MovieProMain {

	public static void main(String[] args) {
		
		FrameBase.getInstance(new FrameBegin());
	}

}
