public class Queue {
	private java.util.LinkedList<Image> queue = new java.util.LinkedList<Image>();
	
	// Constructor
	public Queue() {
		
	}
	
	// Clear the Queue
	public void clear() {
		queue.clear();
	}
	
	// Return if the Queue is empty or not
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	// Return the Object at the start of the Queue (First Object)
	public Image firstEl() {
		return queue.getFirst();
	}
	
	// Remove the Object at the start of the Queue
	public Image dequeue() {
		return queue.removeFirst();
	}
	
	// Add an Object to the Queue
	public void enqueue(Image el) {
		queue.addLast(el);
	}
	
}