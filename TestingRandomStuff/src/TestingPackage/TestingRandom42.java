package TestingPackage;

public class TestingRandom42 {

	public static void main(String[] args) {
		int i = 2, j = 0;
		i = --i + ++j + i++;
		
		//i= (i-1)+(j+1)+()

		System.out.println(i + " " + j);

		j = j++ + i++ - ++j;

		System.out.println(i + " " + j);

		System.out.println(i - j);

		System.out.println();

		int x = 1;
		x = x++ + x--;
		System.out.println(x);

		int y = 1;
		y = ++y + --y;
		System.out.println(y);

		int sum;
		int z = 1;
		sum = z++ + z--;
		System.out.println(sum);

		int sum1;
		int t = 1;
		sum1 = ++t + t--;
		System.out.println(sum1);

	}

}
