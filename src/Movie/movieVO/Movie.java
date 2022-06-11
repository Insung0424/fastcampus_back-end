package Movie.movieVO;

public class Movie {
	String mName;
	int price;
	double score;
	String story;
	String review;
	
	int total;
	int personScore;
	String rev;
	int personNum;
	String reviewName;
	
	public Movie(String mName, int price, double score, String story, String review) {
		this.mName = mName;
		this.price = price;
		this.score = score;
		this.story = story;
		this.review = review;
		this.personNum = 1;
		setScore();
	}

	public double getScore() {
		return score;
	}

	public void setScore() {
		this.score = (double) this.total / this.personNum;
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getReview() {
		return review;
	}

	public void setReview() {
		this.review += this.personScore + "점\t<" 
				+ this.reviewName +  ">\t" + this.rev +"\n";
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total += total;
	}

	public int getPersonScore() {
		return personScore;
	}

	public void setPersonScore(int personScore) {
		this.personScore = personScore;
	}

	public String getRev() {
		return rev;
	}

	public void setRev(String rev) {
		this.rev = rev;
	}

	public int getPersonNum() {
		return personNum;
	}

	public void setPersonNum() {
		this.personNum++;
	}

	public String getReviewName() {
		return reviewName;
	}

	public void setReviewName(String reviewName) {
		this.reviewName = reviewName;
	}

	public String getmName() {
		return mName;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "★영화 제목 : " + mName + 
				"\n★가격 : " + price + "\n★평점 : " + score + 
				"\n★최신 한줄 평 : " + review;
	}
	
	
	
	
}
