public class Calculate {
	public static void main(String[] arg){
		System.out.println("Calculate.....");
		/*проводится сложение двух чиселенных параметров полученных  через массив функции main при запуске программы --  тоесть 
		"java Calculate 2 3" */
	int first = Integer.valueOf(arg[0]);/*первое число из массива*/
	
	int second = Integer.valueOf(arg[1]);/*второе число из массива*/
	int sum = first+second;
	System.out.println("Sum " +sum);
	}
}