

public class Driver {

	public static void main(String[] args) {
		
		
		// Create Images Objects
		Image carImage = new Image("Car", 1440);
		Image boatImage = new Image("Boat", 1080);
		Image planeImage = new Image("Plane", 720);
		Image bikeImage = new Image("Bike", 1440);
		Image unkownImage = new Image();
		
		// Set Attributes for the unknown Images
		unkownImage.setName("UFO");
		unkownImage.setResolution(360);
		
		// Create Queue
		Queue queue = new Queue();
		
		// Add Integers to the Queue
		queue.enqueue(carImage);
		queue.enqueue(boatImage);
		queue.enqueue(planeImage);
		queue.enqueue(bikeImage);
		queue.enqueue(unkownImage);
		
		// Remove first element of the Queue
		queue.dequeue();
		queue.dequeue();
		
		
		// Output the Image at the start of the  (First Image)
		System.out.println("First Image:\n");
		System.out.println( "Image Name: " + queue.firstEl().getName() 
						+ "\nImage Resolution: " + queue.firstEl().getResolution());

	}

}
