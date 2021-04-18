import java.util.Scanner;
public class ConsoleDrawing {
	public static String Scanner(){
		Scanner input=new Scanner(System.in);
		String user_input=input.next();
		return user_input;
	}
	public static void main(String[] args) {
		while(true) {
			//print the initialization of the limitation
			DrawingCanvas size = new DrawingCanvas();
			size.initialSize();
			Scanner Input = new Scanner(System.in);
			int userInput;
			userInput = Input.nextInt();
			if (userInput == 1) {
				Triangle triangle = new Triangle();
				triangle.length_input();
				triangle.length = Input.nextInt();
				//if the input is larger than the height, then return error message and ask for another attempt.
				while (triangle.length > DrawingCanvas.Height) {
					System.out.println("Error! The side length is too long (Current canvas size is " + DrawingCanvas.Width +"x" +DrawingCanvas.Height +"). Please try again.");
					System.out.println("Side length:");
					triangle.length = Input.nextInt();
				}
				triangle.char_input();
				triangle.inpChar = Input.next();
				triangle.alignment_input();
				triangle.align = Input.next();
				triangle.drawTriangle();
				while(true) {
					System.out.println("Draw another triangle (Y/N)?");
					triangle.select = Input.next();
					while(triangle.select.equals("Y")) {
						triangle.length_input();
						triangle.length = Input.nextInt();
						//if the input is larger than the height, then return error message and ask for another attempt.
						while (triangle.length > DrawingCanvas.Height) {
							System.out.println("Error! The side length is too long (Current canvas size is " + DrawingCanvas.Width +"x" +DrawingCanvas.Height +"). Please try again.");
							System.out.println("Side length:");
							triangle.length = Input.nextInt();
						}//Update the character and alignment
						triangle.char_input();
						triangle.inpChar = Input.next();
						triangle.alignment_input();
						triangle.align = Input.next();
						triangle.drawTriangle();
						break;
					}
					if(triangle.select.equals("N")) {
						break;
					}
				}			
			}
			else if(userInput == 2) {
				Square square = new Square();
				square.length_input();
				square.length = Input.nextInt();
				//if the input is larger than the height, then return error message and ask for another attempt.
				while (square.length > DrawingCanvas.Height) {
					System.out.println("Error! The side length is too long (Current canvas size is " + DrawingCanvas.Width +"x" +DrawingCanvas.Height +"). Please try again.");
					System.out.println("Side length:");
					square.length = Input.nextInt();
				}
				square.char_input();
				square.inpChar = Input.next();
				square.alignment_input();
				square.align = Input.next();
				square.drawSquare();
				while(true) {
					System.out.println("Draw another square (Y/N)?");
					square.select = Input.next();
					while(square.select.equals("Y")) {
						square.length_input();
						square.length = Input.nextInt();
						//if the input is larger than the height, then return error message and ask for another attempt.
						while (square.length > DrawingCanvas.Height) {
							System.out.println("Error! The side length is too long (Current canvas size is " + DrawingCanvas.Width +"x" +DrawingCanvas.Height +"). Please try again.");
							System.out.println("Side length:");
							square.length = Input.nextInt();
						}//Update the character and alignment
						square.char_input();
						square.inpChar = Input.next();
						square.alignment_input();
						square.align = Input.next();
						square.drawSquare();
						break;
					}		
					if(square.select.equals("N")) {
						break;
					}
				}
			}
			else if(userInput == 3) {
				size.Width_new();
				size.Width = Input.nextInt();
				size.Height_new();
				size.Height = Input.nextInt();
				size.Char_new();
				size.Char = Input.next();
				System.out.println("Drawing canvas has been updated!");
				System.out.println();
				size.update();
				System.out.println();
			}
			else if(userInput == 4){
				System.out.println("Goodbye!");
				break;
			}
		}	
	}
}
