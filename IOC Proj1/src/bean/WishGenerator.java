package bean;

import java.util.Date;

public class WishGenerator {
	private String name;
	private Date date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String generateWishMsg()
	{
		int hour=date.getHours();
		if(hour<=12)
			return "Good Morning "+name;
		else if (hour>12 && hour<16)
			return "Good OfterNoon "+name;
		else if (hour>16 && hour<19)
			return "Good Evening "+name;
		else
			return "Good Night "+name;
	}

}
