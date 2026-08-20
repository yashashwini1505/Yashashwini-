package day4;
public class Demo2 {

    public static void main(String[] args) {

        int n = 100000;
        int[] student = new int[n];

        for (int i = 0; i < n; i++) {
            student[i] = i + 1;

            if (student[i] == 1000) {
                System.out.println("student found: true");
                break;
            }
        }
    }
}

