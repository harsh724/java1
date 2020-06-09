
public class VideoStore {
	Video[] Store;
	int checkVideo(String name)
	{
		int flag=0;
		try
		{
			for(Video video:Store)
			{
				if(video.getName().equals(name))
					flag=1;
			}
		}
		catch(Exception e)
		{
			
		}
		return flag;
	}
	void addVideo(String Name)
	{
		int size;
		Video video=new Video(Name);
		try
		{
			size=Store.length;		
		}
		catch(Exception e)
		{
			size=0;
		}
		Video[] Store2=new Video[size+1];
		Store2[size]=video;
		Store=Store2;
		
	}
	void doCheckout(String Name)
	{
		if(Store==null||Store.length==0)
		{
			System.out.println("Store is empty");
			return;
		}
		for(Video video :Store)
		{
			if(video.getName().equals(Name))
			{
				video.doCheckout();
			}
		}
	
	}
	void doReturn(String Name)
	{
		if(Store==null || Store.length==0)
		{
			System.out.println("Store is empty");
			return;
		}
		for(Video video :Store)
		{
			if(video.getName().equals(Name))
			{
				video.doReturn();
			}
		}
	}
	
	void receiveRating(String Name , int rating)
	{
		if(Store==null || Store.length==0)
		{
			System.out.println("Store is empty");
			return;
		}
		for(Video video :Store)
		{
			if(video.getName().equals(Name))
			{
				video.recieveRating(rating);
			}
		}
	}
	void listInventory()
	{
		if (Store == null || Store.length == 0) {
			System.out.println("Store is empty");
			return;
		}
		for (Video video : Store) {
			System.out.print("------------------------------------------------------");
			System.out.printf("\n\t%-10s\t|\t%-10s\t|\t%-10s\n", "Video Name","Checkout Status","Rating");
			System.out.printf("\n\t%-10s\t|\t%-10s\t|\t%-10s\n", video.getName(), video.getCheckout(),video.getRating());
			System.out.println("----------------------------------------------------");
		}
		
		
	}
}


