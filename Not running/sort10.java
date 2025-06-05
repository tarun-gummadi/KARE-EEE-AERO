//version Management System
import java.util.Scanner;
public class sort10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of files in VMS:"+" ");
        int nseq = sc.nextInt();
        System.out.print("Enter the number of files ignored by VMS:"+" ");
        int mseq = sc.nextInt();
        System.out.print("Enter the number of files tracked by VMS:"+" ");
        int kseq = sc.nextInt();
        int[] arr15 = new int[nseq];
        for(int i = 0;i<nseq;i++){
            System.out.println("Enter the file:"+" "+(i+1)+" ");
            arr15[i]= sc.nextInt();
        }
        int[] arr16 = new int[mseq];
        for(int i = 0;i<mseq;i++){
            System.out.println("Enter the ignored"+"file:"+" "+(i+1)+" ");
            arr16[i]= sc.nextInt();
        }
        int[] arr17 = new int[kseq];
        for(int i = 0;i<kseq;i++){
            System.out.println("Enter the tracked"+"file:"+" "+(i+1)+" ");
            arr17[i]= sc.nextInt();
        }
        int count = 0;
        for(int i = 0;i<mseq;i++){
            for(int j = 0;j<kseq;j++){
                if(arr16[i]==arr17[j]){
                    count++;
                }
            }
        }System.out.println("Therefore number of ignored and tracked files are"+" "+count);
        int sum = 0;
        for(int i = 1;i<nseq;i++){
            boolean inA = false;
            boolean inB = false;
            for(int j = 0;j<mseq;j++){
                if(arr15[i]==arr16[j]){
                    inA = true;
                    break;
                }
            }
            for(int x = 0;x<kseq;x++){
                if(arr15[i]==arr17[x]){
                    inB = true;
                    break;
                }
            }
            if(!inA && !inB){
                sum++;
            }
        }
        System.out.println("Therefore number of unignored and untracked files are"+" "+sum);
        sc.close();   
    }
    
}