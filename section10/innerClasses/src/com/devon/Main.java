package com.devon;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {
//	    GearBox porsche = new GearBox(6);
//
//        porsche.operateClutch(true);
//        porsche.changeGear(1);
//        //porsche.changeGear(2);
//        System.out.println(porsche.wheelSpeed(2200));


        //local class example
        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.printf("%s was clicked!\n",title);
            }
        }

        btnPrint.setOnClickListener(new ClickListener());
        listen();
    }

    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
