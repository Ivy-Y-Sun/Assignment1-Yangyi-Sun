public class Triangle {
	public static int length;
	public static String inpChar;
	public static String align;
	public static String order;
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
	public void drawTriangle() {
		int col_index = 0;
		if (align.equals("left")) {
			col_index = 1;
		}else if(align.equals("middle")) {
			col_index = (DrawingCanvas.Width - length) / 2 + 1;
		}else if(align.equals("right")) {
			col_index = (DrawingCanvas.Width - length + 1);
		}
		for(int i=1;i<=DrawingCanvas.Height;i++) {
			for(int j=1;j<=DrawingCanvas.Width;j++) {
				if(j>=col_index&&j<col_index+length&&i+j<=length+col_index) {
					System.out.print(inpChar);
				}else {
					System.out.print(DrawingCanvas.Char);
				}
			}
		System.out.println();
		}
		int angle = 0;
		while (true){
			System.out.println();
			System.out.println("Type R/L to rotate clockwise/anti-clockwise. Use other keys to continue.");
			order = ConsoleDrawing.Scanner();
			if(order.equals("R")){
				angle++;
				if(angle == 1) {
					for(int i=1;i<=DrawingCanvas.Height;i++) {
						for(int j=1;j<=DrawingCanvas.Width;j++) {
							if(j>=col_index+i-1&&j<i+col_index+length&j<length+col_index) {
								System.out.print(inpChar);
							}else {
								System.out.print(DrawingCanvas.Char);
							}
						}
					System.out.println();
					}
				}
				else if(angle == 2) {
					for(int i=1;i<=DrawingCanvas.Height;i++) {
						for(int j=1;j<=DrawingCanvas.Width;j++) {
							if(j<=col_index+length-1&&i+j>=length+col_index&&i<=length) {
								System.out.print(inpChar);
							}else {
								System.out.print(DrawingCanvas.Char);
							}
						}
					System.out.println();
					}
				}
				else if(angle == 3) {
					for(int i=1;i<=DrawingCanvas.Height;i++) {
						for(int j=1;j<=DrawingCanvas.Width;j++) {
							if(j<col_index+i&&j>=col_index&&i<=length) {
								System.out.print(inpChar);
							}else {
								System.out.print(DrawingCanvas.Char);
							}
						}
					System.out.println();
					}	
				}
				else if(angle == 4) {
					for(int i=1;i<=DrawingCanvas.Height;i++) {
						for(int j=1;j<=DrawingCanvas.Width;j++) {
							if(j>=col_index&&j<col_index+length&&i+j<=length+col_index) {
								System.out.print(inpChar);
							}else {
								System.out.print(DrawingCanvas.Char);
							}
						}
					
					System.out.println();
					}
				}
			}
			else if(order.equals("L")) {
				angle--;
				if(angle == 3) {
					for(int i=1;i<=DrawingCanvas.Height;i++) {
						for(int j=1;j<=DrawingCanvas.Width;j++) {
							if(j<col_index+i&&j>=col_index&&i<=length) {
								System.out.print(inpChar);
							}else {
								System.out.print(DrawingCanvas.Char);
							}
						}
					System.out.println();
					}	
				}
				else if(angle == 2) {
					for(int i=1;i<=DrawingCanvas.Height;i++) {
						for(int j=1;j<=DrawingCanvas.Width;j++) {
							if(j<=col_index+length-1&&i+j>=length+col_index&&i<=length) {
								System.out.print(inpChar);
							}else {
								System.out.print(DrawingCanvas.Char);
							}
						}
					System.out.println();
					}
				}
				else if(angle == 1) {
					for(int i=1;i<=DrawingCanvas.Height;i++) {
						for(int j=1;j<=DrawingCanvas.Width;j++) {
							if(j>=col_index+i-1&&j<i+col_index+length&j<length+col_index) {
								System.out.print(inpChar);
							}else {
								System.out.print(DrawingCanvas.Char);
							}
						}
					System.out.println();
					}
				}
				else if(angle==0) {
					for(int i=1;i<=DrawingCanvas.Height;i++) {
						for(int j=1;j<=DrawingCanvas.Width;j++) {
							if(j>=col_index&&j<col_index+length&&i+j<=length+col_index) {
								System.out.print(inpChar);
							}else {
								System.out.print(DrawingCanvas.Char);
							}
						}
					System.out.println();
					}
				}
			}else {break;
			}
		}
	}	
}
