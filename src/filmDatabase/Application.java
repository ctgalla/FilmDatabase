package filmDatabase;

public class Application {
	private int year;
	private String title;
	private  int popularity;
	private int length;
	private String image;
	private String subject;
	/**
	 * @param year
	 * @param title
	 * @param popularity
	 * @param length
	 * @param image
	 * @param subject
	 */
	public Application(int id, int year, String title, int popularity, int length, String subject) {
		super();
		this.year = year;
		this.title = title;
		this.popularity = popularity;
		this.length = length;
		this.image = image;
		this.subject = subject;
	}
	
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the popularity
	 */
	public int getPopularity() {
		return popularity;
	}
	/**
	 * @param popularity the popularity to set
	 */
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * @return the subject
	 */
	public String getSubject() {
		return subject;
	}
	/**
	 * @param subject the subject to set
	 */
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
}	