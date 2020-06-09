
public class Video {
	String VideoName;
	Boolean checkout;
	int rating;
	
	Video(String Name)
	{
		this.VideoName=Name;
	}
	String getName()
	{
		return VideoName;
	}
	void doCheckout()
	{
		checkout=true;
	}
	void doReturn()
	{
		checkout=false;
	}
	void recieveRating(int Rating)
	{
		this.rating=Rating;	
	}
	int getRating()
	{
		return rating;
	}
	boolean getCheckout()
	{
		return checkout;
	}

}
