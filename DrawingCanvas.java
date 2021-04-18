public class DrawingCanvas {
	//initialize the drawing canvas
	public static int Width = 10;
	public static int Height = 6;
	public static String Char = "-";
	public void initialSize() {
		System.out.println("----WELCOME TO MY CONSOLE DRAWING APP----");
		System.out.println("Current drawing canvas settings:" + "\n" 
				+ "- Width: "+ DrawingCanvas.Width + "\n" 
				+ "- Height: " + DrawingCanvas.Height + "\n" 
				+ "- Background character: " + DrawingCanvas.Char);	
		System.out.println();
		System.out.println("Please select an option. Type 4 to exit.\r\n"
				+ "1. Draw triangles\r\n"
				+ "2. Draw squares\r\n"
				+ "3. Update drawing canvas settings\r\n"
				+ "4. Exit");
	}
	public void Width_new() {
		System.out.println("Canvas width:");
	}
	public void Height_new() {
		System.out.println("Canvas height:");
	}
	public void Char_new() {
		System.out.println("Background character:");
	}
	public void update() {
		System.out.println("Current drawing canvas settings:");
		System.out.println("-Width: " + Width);
		System.out.println("-Height: " + Height);
		System.out.println("-Background character: " + Char);
	}
}
