package Hw12;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
 Condo myCondo = new Condo(500, 250, 3, 1, 1983, 500);
 House myHouse= new House(700,700,4,2,1999,200);
        System.out.println(myCondo.toString());
        System.out.println(myHouse.toString());
    }
}

