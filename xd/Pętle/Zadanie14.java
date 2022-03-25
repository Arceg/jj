public class Zadanie14 {
    int rew[] = new int[l.length];
		for (int i = l.length-1; i > 0;){
        for (int j = 0; j < l.length;j++){
            rew[j] = l[i];
            i--;
        }
    }
		System.out.println(Arrays.toString(rew));
}
