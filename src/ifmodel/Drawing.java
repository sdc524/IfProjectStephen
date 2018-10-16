package ifmodel;

public class Drawing
{
	//Declaration section
	//Data member section
	//Also called instance variables
	//These arte special - they get a "default" value
	//All numbers => 0
	//boolean => false
	//Objects => null!!
	
	
	private String picture;
	private double eyeCount;
	private int hasWeapon;
	private int armCount;
	private double legCount;
	
	/**
	 * Default constructor for after the fact customization
	 * AKA I don't know the info yet about the ifDrawing
	 * Initializing data members with "bad" values to be changed.
	 */
	
	
	public Drawing()
	{
		this.picture = "ninja";
		this.eyeCount = 2;
		this.hasWeapon = 1;
		this.armCount = 2;
		this.legCount = 2;
	}
	
	/**
	 * Better constructor when I know information for the Run object
	 * @param picture The picture drawn.
	 */
	
	public  Drawing(String picture, double eyeCount, int hasWeapon, int armCount, double legCount)
	{
		this.picture = picture;
		this.eyeCount = eyeCount;
		this.hasWeapon = hasWeapon;
		this.armCount = armCount;
		this.legCount = legCount;
		
	}
	
	
	
	public String getPicture()
	{
		return picture;
	}
	
	public double geteyeCount()
	{
		return eyeCount;
	}
	
	public int gethasWeapon()
	{
		return hasWeapon;
	}
	
	public int getarmCount()
	{
		return armCount;
	}
	public double getlegCount()
	{
		return legCount;
	}
	
	public void setPicture (String picture)
	{
		this.picture = picture;
	}
	
	public void seteyeCount(double eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public void sethasWeapon(int hasWeapon)
	{
		this.hasWeapon = hasWeapon;
	}
	
	public void setarmCount(int armCount)
	{
		this.armCount = armCount;
	}

	public void setlegCount(double legCount)
	{
		this.legCount = legCount;
	}
	
	public String toString()
	{
		String description = "This is a drawing";
		description += "The picture is of" + picture;
		description += "and it has " + eyeCount + "eyes"; 
		return description;
				
	}
	
	
	
	
	
	
}


