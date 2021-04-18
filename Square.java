public class Square {
	public static int length;
	public static String inpChar;
	public static String align;
	public static String input;
	public static String select;
	public void length_input() {
		System.out.println("Side length:");
	}
	public void char_input() {
		System.out.println("Printing character:");
	}
	public void alignment_input() {
		System.out.println("Alignment (left, middle, right):");
	}
	public void drawSquare() {
		int col_index = 1;
		if (align.equals("left")) {
			col_index = 1;
		}else if(align.equals("middle")) {
			col_index = (DrawingCanvas.Width - length) / 2 + 1;
		}else if(align.equals("right")) {
			col_index = (DrawingCanvas.Width - length + 1);
		}
		for(int i=1;i<=DrawingCanvas.Height;i++) {
			for(int j=1;j<=DrawingCanvas.Width;j++) {
				if(j>=col_index&&j<col_index+length&&i<=length) {
					System.out.print(inpChar);
				}else {
					System.out.print(DrawingCanvas.Char);
				}
			}
		System.out.println();
		}
		while(true) {
			System.out.println();
			System.out.println("Type I/O to zoom in/out. Use other keys to continue.");
			input = ConsoleDrawing.Scanner();
			if (input.equals("I")) {
				length++;
				if(length<=DrawingCanvas.Height) {
					drawSquare();
				}
				else if(length>DrawingCanvas.Height) {
					length--;
					drawSquare();
				}
			}
			else if (input.equals("O")) {
				length--;
				if(length>0) {
					drawSquare();
				}
				else if(length==0) {
					length++;
					drawSquare();
				}
			}
		break;
		}
	}
}

