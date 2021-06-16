package TestingPackage;

public class TestingRandom40 {

	public static void main(String[] args) {
		int t = 0, k = 1;
		t = ++k; // t = 2, k=2
		k = ++t - k--; // t = 3, k=1
		System.out.println(k + t--); // 4

		System.out.println();

		int x = 1, y = 2;
		x = y++; // x=2 y=3
		System.out.println(x + " " + y);
		y = --x - --y; // x=1 y= -1
		System.out.println(x + " " + y);

		System.out.println(x - y--); // 2

		System.out.println();

		int a = 0, b = 1;
		b = a++ - b--; // a=1, b= -1
		System.out.println(a + " " + b);
		a = --b - a++; // a=-3, b=-2
		System.out.println(a + " " + b);
		b = ++a + b++; // a= -2, b= -4;
		System.out.println(a + " " + b);
		System.out.println(a - b--); // (-2 - (-4) = 2

		System.out.println();

		int q = 1, w = 0;
		q = q++ - ++w; // q=0, w=1
		System.out.println(q + " " + w);
		q = q-- + --w; // q=0 , w=0
		System.out.println(q + " " + w);
		w = ++q + ++w; // q=1 , w=2
		System.out.println(q + " " + w);

		System.out.println(q + w);

		System.out.println();

		int e = 0, z = 1;
		e = ++e + z--; // e=2, z=0
		System.out.println(e + " " + z);
		z = e-- - --z; // e=1, z= 3
		System.out.println(e + " " + z);
		e = e++ + z++; // e=4 , z=4
		System.out.println(e + " " + z);

		System.out.println(e + z);

		System.out.println();

		int r = 1, u = 1;
		r = r-- - u--; // r= 0, u=0
		System.out.println(r + " " + u);
		u = --r + --u; // r=-1, u=-2
		System.out.println(r + " " + u);
		u = r-- - u--; // r=-2, u=1
		System.out.println(r + " " + u);
		System.out.println(r + u); // -1

	}

}
