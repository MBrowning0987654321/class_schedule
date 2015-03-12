package classSchedule;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;
/*
 * The user interface for the schedule
 * Prints the schedule and courses underneath the major
 */



import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class viewSchedule extends JFrame{
	//private major majorFirst;
	private modelSchedule model;
	private controllerSchedule controller;


	public viewSchedule()
	{

	}
	//Set the model
	public void setModel(modelSchedule model) {
		this.model = model;
	}

	// Set the controller
	public void setController(controllerSchedule controller) {
		this.controller = controller;
	}

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		//user input for the major
		System.out.println("Please enter a major: ");
		String result = keyboard.nextLine();

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// Create model and controller objects
				modelSchedule model = new modelSchedule();
				controllerSchedule controller = new controllerSchedule();

				// Use the controller to initialize the model
				controller.initModel(model);

				// Create the view, and connect it to the model and controller objects
				viewSchedule view = new viewSchedule();
				view.setModel(model);
				view.setController(controller);

				// Create a frame to display the view
				JFrame frame = new JFrame();
				frame.setTitle("Class Schedule!");
				frame.setContentPane(view);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.pack();
				frame.setVisible(true);
				/*
		// Register mouse event handlers
				 * this will be used for the search button when they type
				 * in their major, minor, or course
		MouseAdapter listener = new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				handleMousePressed(e);
			}
				 */

			}
		});
	}
}
