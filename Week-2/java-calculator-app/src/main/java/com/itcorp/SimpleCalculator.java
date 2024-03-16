package com.itcorp;

public class SimpleCalculator {
	public static void main(String[] args) {

		System.out.println("No of program arguments " + args.length);
		
		for (int index = 0; index < args.length; index ++) {
			System.out.println("Arguments " + (index + 1) + "-> '" + args[index] + "'");
		}
		
		if (args.length == 3) {

			try {
				
				float x = Float.parseFloat(args[0]);
				System.out.println("Parsing first argument as " + x);
				
				float y = Float.parseFloat(args[1]);
				System.out.println("Parsing second argument as " + y);


				String operator = args[2];
				System.out.println("Retriveing the operator as " + operator);

				float z = 0;				
				if (operator != null) {

					operator = operator.trim();

					if (operator.equals("+")) {
						System.out.println("About to perform addition...");
						z = (x + y);
					} else if (operator.equals("-")) {
						System.out.println("About to perform subtraction...");						
						z = (x - y);
					} else if (operator.equals("*")) {
						System.out.println("About to perform multiplication...");						
						z = (x * y);
					} else if (operator.equals("/")) {
						System.out.println("About to perform division...");						
						z = (x / y);
					}

					System.out.printf("For the inputs '%f' and '%f', with '%s' as operator, the outcome is '%f'", x, y, operator, z);
					System.out.println();

				} else {
					System.out.println("Invalid operator" + operator);
				}
			} catch (Exception e) {

				System.out.println("Error performing arithmetic operation");
				e.printStackTrace();
			}
		} else {
			System.out.println("Incorrect usage");
			System.out.println("Usage Examples");
			System.out.println("\t10 10 +");
			System.out.println("\t10 20 -");
		}

	}
}
