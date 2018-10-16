package drawing.controller;

import ifmodel.Drawing;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class DrawingController<E>
{
	/**
	 * Builds the instance of the Controller
	 */
	public DrawingController()
	{

	}

	/**
	 * This is where the program starts calling methods to run the program.
	 */

	public void start()
	{
		loopy();
	}

	private void loopy()
	{
		// define variable before loop
		int count = 0;
		while (count < 15)// Test the variable
		{
			JOptionPane.showMessageDialog(null, "brother may I have some loops?");
			// Eventually change the loop variable
			count++;
		}
		for (int loop = 30; loop >= 0; loop -= 2)
		{
			JOptionPane.showMessageDialog(null, "The loop value is: " + loop + "'the picture I drew");
		}
	}

	private void lotsOfDrawing()
	{
		// local variables are only visible in the method
		// they only have SCOPE to that method

		ArrayList<Drawing> myDrawings = new ArrayList<Drawing>();
		ArrayList<Integer> myDrawing = new ArrayList<Integer>();
		// Have to use a Wrapper class to hold a primitive in a list

		Drawing sampleDrawing = new Drawing();
		Drawing otherDrawing = new Drawing();

		myDrawings.add(sampleDrawing);
		myDrawings.add(sampleDrawing);
		myDrawings.add(otherDrawing);

		// Standard forward loop
		// going backwards with for loops is better used if you remove something
		for (int index = 0; index < myDrawings.size(); index += 1)
		{
			Drawing currentDrawing = myDrawings.get(index);
			currentDrawing.setPicture(index + currentDrawing.getPicture()); // can't multiply strings
			// Good for display, or minor changes
			JOptionPane.showMessageDialog(null, myDrawings.get(index).getPicture());

			// good for remove, replace, change multiple values
			Drawing currentDrawing1 = myDrawings.get(index);
			currentDrawing.setPicture("The new name is" + index + "Drawing");

		}

		// Standard backward loop
		// great for removing!!!
		for (int index = myDrawings.size() - 1; index >= 0; index -= 1)
		{

		}

		for (Drawing current : myDrawings)
		{
			JOptionPane.showMessageDialog(null, "The drawing is named: " + current.getPicture());
		}

	}

	private void userDraw()
	{
		Drawing userDraw = new Drawing();
		// ask'
		String response = JOptionPane.showInputDialog(null, "What is the eye count??");
		// repeat until finished correctly
		while (response == null && !validDouble(response))
		{
			response = JOptionPane.showInputDialog(null, "No! Guess what it is or don't press anything.");
		}

		// assign and convert
		userDraw.seteyeCount(Double.parseDouble(response));

		response = JOptionPane.showInputDialog(null, "what is the picture of?");
		if (response == null || response.equalsIgnoreCase("CTEC"))
		{
			JOptionPane.showMessageDialog(null, "You either pressed cancel, the x or typed nothing >:[ ");
		}

		JOptionPane.showMessageDialog(null, userDraw);

	}

	//

	private void testLoop()
	{
		// Define variable before loop
		boolean isDone = false;
		int count = 0;

		while (!isDone)// Test the variable
		{
			JOptionPane.showMessageDialog(null, "May I have a piece of paper?");
			// eventually change the loop variable
			count++;
			if (count >= 10)
			{
				isDone = true;
			}
		}
	}

	public boolean validInt(String maybeInt)
	{
		boolean isValid = false;

		try
		{
			Integer.parseInt(maybeInt);
			isValid = true;
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "You should draw a picture of our teacher");
		}

		return isValid;
	}

	public boolean validDouble(String maybeDouble)
	{
		boolean isValid = false;

		try
		{
			Double.parseDouble(maybeDouble);
		}
		catch (NumberFormatException error)
		{
			JOptionPane.showMessageDialog(null, "This requires a double value aka something with a . >)");
		}

		return isValid;
	}

}
