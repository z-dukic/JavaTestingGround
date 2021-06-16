package TestingPackage;

public class TestingRandom39 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 7, 25, 17 };
		int najveciBroj = 0;
		int drugiNajveciBroj = 0;
		int treciNajveciBroj = 0;
		int cetvrtiNajveciBroj = 0;
		int petiNajveciBroj = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > najveciBroj) {
				petiNajveciBroj = cetvrtiNajveciBroj;
				cetvrtiNajveciBroj = treciNajveciBroj;
				treciNajveciBroj = drugiNajveciBroj;
				drugiNajveciBroj = najveciBroj;
				najveciBroj = array[i];

			} else if (array[i] > drugiNajveciBroj) {
				petiNajveciBroj = cetvrtiNajveciBroj;
				cetvrtiNajveciBroj = treciNajveciBroj;
				treciNajveciBroj = drugiNajveciBroj;
				drugiNajveciBroj = array[i];
			} else if (array[i] > treciNajveciBroj) {
				petiNajveciBroj = cetvrtiNajveciBroj;
				cetvrtiNajveciBroj = treciNajveciBroj;
				treciNajveciBroj = array[i];
			} else if (array[i] > cetvrtiNajveciBroj) {
				petiNajveciBroj = cetvrtiNajveciBroj;
				cetvrtiNajveciBroj = array[i];
			} else if (array[i] > petiNajveciBroj) {
				petiNajveciBroj = array[i];
			}
		}
		System.out.println(najveciBroj);
		System.out.println(drugiNajveciBroj);
		System.out.println(treciNajveciBroj);
		System.out.println(cetvrtiNajveciBroj);
		System.out.println(petiNajveciBroj);

	}
}
