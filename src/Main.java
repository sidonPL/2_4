import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Tabliczka mnożenia\n");
        int rozmiar = scan.nextInt();
        int i=1;
        while(i<=rozmiar){
            int j=1;
            while(j<=rozmiar){
                System.out.print(i*j+"\t");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}