import java.util.Arrays;

public class Lexiprint {

	public static void main(String args[]) {

		char sorted[] = { 'A', 'A', 'C', 'E' };
		Arrays.sort(sorted);
		permutations(sorted, 0);
	}

	public static void permutations(char[] word, int k) {

		if (word.length == k)
			System.out.println(word);
		else {
			for (int i = k; i < word.length; i++) {

				if (i + 1 < word.length && word[i] == word[i + 1])
					continue;

				swap(word, i, k);

				for (int l = k + 1; l <= i; l++) {
					if (word[l] > word[i]) {
						swap(word, l, i);
					}
				}
				permutations(word, k + 1);

				for (int l = i; l >= k + 1; l--) {
					if (word[l] < word[i]) {
						swap(word, l, i);
					}
				}

				swap(word, i, k);

			}
		}

	}

	private static void swap(char[] s, int ind, int i) {
		char temp = s[ind];
		s[ind] = s[i];
		s[i] = temp;

	}

}