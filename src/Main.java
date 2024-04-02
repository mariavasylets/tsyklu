public class Main {
    public static void main(String[] args) {
        System.out.println("Завдання 1.a");
        for ( int a = 500; a<651; ){
            System.out.println(a);
            a+=10;
        }
        System.out.println("Завдання 1.b");
        int b = 500;
        while (b<651){
            System.out.println(b);
            b+=10;
        }
        System.out.println("Завдання 1.c");
        int c = 500;
        do{
            System.out.println(c);
            c+=10;
        }while (c<651);
        System.out.println("Завдання 2");
        for (int d=2; d<5000; d=2*d-1){
            System.out.println(d);
        }
        System.out.println("Завдання 3");
        int e = 1;
        while (e<=10){
            if (10%e==0){
                System.out.println(e);
            }else{
            }
            e++;
        }
        System.out.println("Завдання 4.a");
        int g=1;
        for (int f=1; f<10; f=f+1){
            g=g*(f+1);
            System.out.println(g);
        }
        System.out.println("Завдання 4.b");
        int h=1;
        int i=1;
        while (h<10){
            i=i*(h+1);
            System.out.println(i);
            h++;
        }
        System.out.println("Завдання 5");
        int hour=23;
        int minute=59;
        int h1=hour/10;
        int h2=hour%10;
        int m1=minute/10;
        int m2=minute%10;
        while (hour>=0){
            while (minute>=0){
                if (h1==m2 & h2==m1){
                    System.out.println(hour+":"+minute);
                }else{
                }
                minute--;
                hour=hour;
                h1=hour/10;
                h2=hour%10;
                m1=minute/10;
                m2=minute%10;
            }
            hour--;
            minute=59;
        }
    }
}