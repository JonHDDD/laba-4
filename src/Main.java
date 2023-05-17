public class Main {
    public static void main(String[] args) {

        //
        System.out.println("ЗАВДАННЯ 1 ЗАВДАННЯ 1 ЗАВДАННЯ 1 ЗАВДАННЯ 1 ЗАВДАННЯ 1");
        //

        int array[] = new int [49];

        for (int i=1, x=0; i<99; i=i+2, x++){
            array[x]=i;
            System.out.println(array[x]);
        }

        //
        System.out.println("ЗАВДАННЯ 2 ЗАВДАННЯ 2 ЗАВДАННЯ 2 ЗАВДАННЯ 2 ЗАВДАННЯ 2");
        //

        int twotask[]=new int [20];
        for (int y=0; y<20; y++){
            twotask[y]=(int)Math.round(Math.random()*10);
            System.out.print(twotask[y]+ " ");
        }
        System.out.println(" ");
        for (int y=1;y<20;y=y+2){
            twotask[y]= 0;
        }
        System.out.println("Оновлений масив");
        for (int y=0; y<20; y++){
            System.out.print(twotask[y]+ " ");
        }
        System.out.println(" ");

        //
        System.out.println("ЗАВДАННЯ 3 ЗАВДАННЯ 3 ЗАВДАННЯ 3 ЗАВДАННЯ 3 ЗАВДАННЯ 3");
        //

        int one[]=new int[5];
        int two[]=new int[5];
        int three[]=new int[5];
        int sone=0;
        int stwo=0;
        int sthree=0;
        for (int y=0; y<5; y++){
            one[y]=(int)Math.round(Math.random()*6);
            System.out.print(one[y]+ " ");
            sone=sone+one[y];
        }
        int sredneone=sone/one.length;
        System.out.println(" ");
        for (int y=0; y<5; y++){
            two[y]=(int)Math.round(Math.random()*6);
            System.out.print(two[y]+ " ");
            stwo=stwo+two[y];
        }
        int srednetwo=stwo/two.length;
        System.out.println(" ");
        for (int y=0; y<5; y++){
            three[y]=(int)Math.round(Math.random()*6);
            System.out.print(three[y]+ " ");
            sthree=sthree+three[y];
        }
        int srednethree=sthree/three.length;
        System.out.println(" ");
        if (sredneone > srednetwo && sredneone > srednethree) {
            System.out.println("Середнє значення першого масиву бiльше " + sredneone);
        } else if (srednetwo > sredneone && srednetwo > srednethree) {
            System.out.println("Середнє значення другого масиву бiльше " + srednetwo);
        }
        else if (srednethree>sredneone && srednethree>srednetwo){
            System.out.println("Середнє значення третього масиву бiльше " + srednethree);
        }
        else {
            System.out.println("Середнє значення всiх масивiв однакова");
        }

        //
        System.out.println("ЗАВДАННЯ 4 ЗАВДАННЯ 4 ЗАВДАННЯ 4 ЗАВДАННЯ 4 ЗАВДАННЯ 4");
        //

        int[] task_four_one = new int[10];
        int[] task_four_two = new int[10];
        int[] task_four_three = new int[10];
        for (int i = 0; i < 10; i++) {
            task_four_one[i] = (int) (Math.random() * 11);
            System.out.print(task_four_one[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            task_four_two[i] = (int) (Math.random() * 11);
            System.out.print(task_four_two[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            task_four_three[i] = task_four_one[i] + task_four_two[i];
            System.out.print(task_four_three[i] + " ");
        }
        System.out.println("");

        //
        System.out.println("ЗАВДАННЯ 5 ЗАВДАННЯ 5 ЗАВДАННЯ 5 ЗАВДАННЯ 5 ЗАВДАННЯ 5");
        //

        int[] task_five = new int[15];
        int parn =0;
        for (int i = 0; i < 15; i++) {
            task_five[i] = (int) (Math.random() * 11);
            System.out.print(task_five[i] + " ");
            if (task_five[i] % 2 == 0) {
                parn++;
            }
        }
        System.out.println("");
        System.out.println("Кiлькiсть парних елементів: " + parn);

        //
        System.out.println("ЗАВДАННЯ 6 ЗАВДАННЯ 6 ЗАВДАННЯ 6 ЗАВДАННЯ 6 ЗАВДАННЯ 6");
        //

        int[][] task_six = new int[15][];
        task_six [0] = new int [5];
        task_six [1] = new int [5];
        task_six [2] = new int [5];
        task_six [3] = new int [5];
        task_six [4] = new int [8];
        task_six [5] = new int [8];
        task_six [6] = new int [8];
        task_six [7] = new int [8];
        task_six [8] = new int [3];
        task_six [9] = new int [3];
        task_six [10] = new int [3];
        task_six [11] = new int [3];
        task_six [12] = new int [9];
        task_six [13] = new int [9];
        task_six [14] = new int [9];

        for(int i = 0;i < task_six.length;i++) {
            for (int j = 0; j < task_six[i].length; j++) {
                task_six[i][j] = (int) (Math.random() * 16);
                System.out.print(task_six[i][j] + " ");
            }
            System.out.println("");
        }
    }

}