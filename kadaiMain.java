import java.util.Scanner;
import java.util.Random;

public class kadaiMain {
    public static void main(String[] args){

    Scanner Scanner=new Scanner(System.in);


    int count=0;
    int bre=1;


    System.out.println("*************");
    System.out.println("　戦艦ゲーム　");
    System.out.println("*************");
    

    int[][] a=new int[7][7];


    for(int p=1;p<100;p++){
        if(bre==4){

            hune ship=new hune();
            ship.lastdisp();
            break;

        }


        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                a[i][j]=0;
            }
        }
        if(bre==1){
            for(int x=0;x<3;x++){
                Random rnd=new Random();
                int b=rnd.nextInt(5)+1;
                int c=rnd.nextInt(5)+1;
                a[b][c]=1;
            }
        }else if(bre==2){
            for(int X=0; X<2; X++){
                Random rnd=new Random();
                int b=rnd.nextInt(5)+1;
                int c=rnd.nextInt(5)+1;
                a[b][c]=1;

            }
        }else if(bre==3){
            for(int X=0;X<1;X++){
                Random rnd=new Random();
                int b=rnd.nextInt(5)+1;
                int c=rnd.nextInt(5)+1;
                a[b][c]=1;
            }
        }
        for(int i=1;i<6;i++){
            for(int j=1;j<6;j++){
                if(j !=5){
                    System.out.print(a[i][j]);
                }else{
                    System.out.println(a[i][j]);
                    System.out.println("");
                }
            }
        }
        for(int g=0;g<=100;g++){
            System.out.println("----ターン"+p+"----");


            System.out.println("X座標を1～5で選んでください");
            String d=Scanner.next();
            System.out.println("Y座標を1～5で選んでください");
            String e=Scanner.next();

            int num1=Integer.parseInt(d);
            int num2=Integer.parseInt(e);

            if(1==a[num1][num2]&&count==2){

                System.out.println("戦艦を"+bre+"艦撃退した。残り"+(3-bre)+"艦いるぞ");
                count=0;
                bre++;
                break;

            }else if(1==a[num1][num2]){
                hune ship=new hune();
                ship.seconddisp();
                count++;
                break;

            
            }else if(1==a[num1][num2+1]){

                System.out.println(a[num1][num2+1]);
                System.out.println("波高し　戦艦はこの列の前にいます");
                p++;

            }else if(1==a[num1][num2-1]){
            System.out.println(a[num1][num2-1]);
            System.out.println("波高し　戦艦はこの列の後ろにいます");
            p++;

            }else if(1==a[num1+1][num2]){
                System.out.println(a[num1+1][num2]);
                System.out.println("波高し　戦艦はこの行の前にいます");
                p++;

            }else if(1==a[num1-1][num2]){
                System.out.println(a[num1-1][num2]);
                System.out.println("波高し　戦艦はこの行の後ろにいます");
                p++;

            }else{
                System.out.println("適がいない");
                p++;
            }

        }
    }
}
}
