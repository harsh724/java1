import java.util.Scanner;
public class VideoLauncher {

	public static void main(String[] args) 
	{
		int i=0;
		Scanner s=new Scanner(System.in);
		VideoStore videoStore=new VideoStore();
		while(i!=6)
		{
			System.out.println("1. Add Videos : ");
			System.out.println("2. Check Out Video : ");
			System.out.println("3. Return Video : ");
			System.out.println("4. Receive Rating : ");
			System.out.println("5. List Inventory : ");
			System.out.println("6. Exit : ");
			System.out.print("Enter Your Choice (1..6) : ");
			String name;
			i=s.nextInt();
			s.nextLine();
			if(i==1)
			{
				System.out.print("Enter the name of video you want to add: ");
				name=s.nextLine();
				videoStore.addVideo(name);
				System.out.print("video "+name + " added successfully.");
			}
			else if(i==2)
			{
				System.out.print("Enter the name of video you want to check out: ");
				name=s.nextLine();
				if(videoStore.checkVideo(name)==0)
				{
					System.out.print("Video does not exist");
				}
				else
				{
					videoStore.doCheckout(name);
					System.out.print("video "+name + " checked out successfully.");
				}
			}
			else if(i==3)
			{
				System.out.print("Enter the name of video you want to return: ");
				name=s.nextLine();
				if(videoStore.checkVideo(name)==0)
				{
					System.out.print("Video does not exist");
				}
				else
				{
					videoStore.doReturn(name);
					System.out.print("video "+name + " returned successfully.");
				}
			
			}
			else if(i==4)
			{
				System.out.print("Enter the name of video you want to rate: ");
				name=s.nextLine();
				if(videoStore.checkVideo(name)==0)
				{
					System.out.print("Video does not exist");
				}
				else
				{
					System.out.print("Enter the rating for this video: ");
					int rating=s.nextInt();
					videoStore.receiveRating(name, rating);
					System.out.print("Rating "+rating+" has been mapped to video "+name+".");
				}
			}
			else if(i==5)
			{
				videoStore.listInventory();
			}
			else if(i==6)
			{
				System.out.println("Exiting...!! Thanks for using the application.");
			}
			else
			{
				System.out.println("Exiting...!! Invalid Input");
			}
		}

	}

}
