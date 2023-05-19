/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen1_p1_miguelmoran;

import java.util.Scanner;

/**
 *
 * @author flash
 */
public class Examen1_P1_MiguelMoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        boolean seguir = true;
        while (seguir) {
            System.out.println("1.Sumador Binario");
            System.out.println("2.Estrella de David");
            System.out.println("3.Salir");
            System.out.println("Ingrese una opcion");
            int opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    String num1,
                     num2;
                    System.out.println("Ingrese un numero binario");
                    num1 = sc.next();
                    System.out.println("Ingrese otro numero binario del mismo tamaño que el anterior");
                    num2 = sc.next();
                    boolean test = true;
                    while (test) {
                        boolean test1 = false;
                        boolean test2 = false;
                        boolean test3 = false;
                        if (num1.length() == num2.length()) {
                            test1 = true;
                        }
                        for (int i = 0; i < num1.length(); i++) {
                            int d1 = num1.charAt(i);
                            if (d1 != 48 & d1 != 49) {
                                test2 = false;
                                break;
                            } else {
                                test2 = true;
                            }
                        }
                        for (int i = 0; i < num2.length(); i++) {
                            int d2 = num1.charAt(i);
                            if (d2 != 48 & d2 != 49) {
                                test3 = false;
                                break;
                            } else {
                                test3 = true;
                            }
                        }
                        if (test1 && test2 && test3) {
                            test = false;
                        } else {
                            System.out.println("Porfavor solo ingrese numeros binarios del mismo tamaño");
                            System.out.println("Ingrese un numero binario");
                            num1 = sc.next();
                            System.out.println("Ingrese otro numero binario del mismo tamaño que el anterior");
                            num2 = sc.next();
                        }
                    }
                    String accum1 = "";
                    int extra = 0;
                    int num3 = 0;
                    for (int i = num1.length() - 1; i >= 0; i--) {
                        int d1 = num1.charAt(i);
                        int d2 = num2.charAt(i);
                        if (d1 == 49 && d2 == 49) {
                            num3 = extra;
                            extra = 1;
                        } else if (d1 == 49 && d2 == 48) {
                            num3 = 1;
                            if (extra == 1) {
                                num3 = 0;
                            }
                        } else if (d1 == 48 && d2 == 49) {
                            num3 = 1;
                            if (extra == 1) {
                                num3 = 0;
                            }
                        } else if (d2 == 48 && d2 == 48) {
                            num3 = extra;
                            extra = 0;
                        }
                        accum1 += num3;
                    }
                    accum1 += extra;
                    String accum2 = "";
                    for (int i = accum1.length() - 1; i >= 0; i--) {
                        char d3 = accum1.charAt(i);
                        accum2 += d3;
                    }
                    System.out.println(num1 + " + " + num2 + " = " + accum2);
                    break;

                case 2:
                    System.out.println("Ingrese un tamaño mayor que 9 e impar");
                    int size = sc.nextInt();
                    for (int y = 0; y < size; y += 2) {
                        for (int x = y / 2; x > 0; x--) {
                            System.out.print(" ");
                        }
                        for (int x = y; x < size; x++) {
                            System.out.print("*");
                            if (y < size - 2 & y > 1) {
                                for (x = x; x < size - 2; x++) {
                                    System.out.print(" ");
                                }
                                System.out.print("+");
                                x++;
                            }
                        }
                        for (int x = size - y - 2; x < size; x++) {
                            if (y == 0) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        for (int x = y; x < size; x++) {
                            if (y == 0 || y == size - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print("+");
                            }
                            if (y < size - 2 & y > 1) {
                                for (x = x; x < size - 2; x++) {
                                    System.out.print(" ");
                                }
                                System.out.print("*");
                                x++;
                            }
                        }
                        System.out.println();
                    }
                    for (int y = 2; y < size; y += 2) {
                        for (int x = (size - y) / 2; x > 0; x--) {
                            System.out.print(" ");
                        }
                        for (int x = size - y; x < size; x++) {
                            System.out.print("*");
                            if (y < size - 2 & y > 1) {
                                for (x = x; x < size - 2; x++) {
                                    System.out.print(" ");
                                }
                                System.out.print("+");
                                x++;
                            }
                        }
                        for (int x = y - 2; x < size; x++) {
                            if (y == size) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        for (int x = size - y; x < size; x++) {
                            if (y == 0 || y == size - 1) {
                                System.out.print("*");
                            } else {
                                System.out.print("+");
                            }
                            if (y < size - 2 & y > 1) {
                                for (x = x; x < size - 2; x++) {
                                    System.out.print(" ");
                                }
                                System.out.print("*");
                                x++;
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    seguir = false;
                    break;

                default:
                    System.out.println("Porfavor elija una opcion valida");
            }
        }
    }

}
