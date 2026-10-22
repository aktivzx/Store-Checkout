import java.sql.SQLOutput;
import java.util.Scanner;

public class store {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mouse = 20;
        double keyboard = 40;
        double headphones = 50;
        double laptopS = 30;
        double total = 0;
        int totalQ = 0,totalM =0,totalK=0,totalL=0,totalH=0;

        for (int i = 0; ; ) {
            System.out.println("===== STORE MENU =====\n1.Mouse            - $20" + '\n' + "2.Keyboard         - $40" + '\n' + "3.Headphones       - $50" + '\n' + "4.Laptop Stand     - $30" + '\n' + "5.Checkout" + '\n' + '\n');
            System.out.println("Choose a product: ");
            int choose = scan.nextInt();

            if (choose <= 0 || choose >= 6) {
                System.out.println("Invalid product! Try again");
            } else if (choose == 1) {
                System.out.println("You selected Mouse!" + '\n' + "Price:$20");
                System.out.println("Enter quantity:");
                int qua = scan.nextInt();
                if (qua <= 0)
                    System.out.println("Error!\nQuantity must be greater than zero");
                else {
                    if (qua >= 5) {
                        System.out.println(qua + " * " + mouse + "$ = " + (qua * mouse) + '$');
                        System.out.println("Added to cart!");
                        System.out.println("You received 5% discount!");
                        double qum = (qua * mouse);
                        qum *= 0.95;
                        total += qum;
                        totalQ += qua;
                        totalM += qua;
                        System.out.println("Current total: " + total + '$');
                    } else {
                        System.out.println(qua + " * " + mouse + "$ = " + (qua * mouse) + '$');
                        System.out.println("Added to cart!");
                        total += (qua * mouse);
                        totalQ += qua;
                        totalM += qua;
                        System.out.println("Current total: " + total + '$');
                    }
                }
            } else if (choose == 2) {
                System.out.println("You selected keyboard" + '\n' + "Price:$40");
                System.out.println("Enter quantity: ");
                int qua = scan.nextInt();
                if (qua <= 0)
                    System.out.println("Error!\nQuantity must be greater than zero");
                else {
                    if (qua >= 5) {
                        System.out.println(qua + " * " + keyboard + "$ = " + (qua * keyboard) + '$');
                        System.out.println("Added to cart!");
                        System.out.println("You received 5% discount!");
                        double quk = (qua * keyboard);
                        quk *= 0.95;
                        total += quk;
                        totalK += qua;
                        totalQ += qua;
                        System.out.println("Current total: " + total + '$');
                    } else {
                        System.out.println(qua + " * " + keyboard + "$ = " + (qua * keyboard) + '$');
                        System.out.println("Added to cart!");
                        total += (qua * keyboard);
                        totalQ += qua;
                        totalK += qua;
                        System.out.println("Current total: " + total + '$');
                    }
                }
            } else if (choose == 3) {
                System.out.println("You selected headphones" + '\n' + "Price:$50");
                System.out.println("Enter quantity: ");
                int qua = scan.nextInt();
                if (qua <= 0)
                    System.out.println("Error!\nQuantity must be greater than zero");
                else {
                    if (qua >= 5) {
                        System.out.println(qua + " * " + headphones + "$ = " + (qua * headphones) + '$');
                        System.out.println("Added to cart!");
                        System.out.println("You received 5% discount!");
                        double quh = (qua * headphones);
                        quh *= 0.95;
                        total += quh;
                        totalK += qua;
                        totalH += qua;
                        System.out.println("Current total: " + total + '$');
                    } else {
                        System.out.println(qua + " * " + headphones + "$ = " + (qua * headphones) + '$');
                        System.out.println("Added to cart!");
                        total += (qua * headphones);
                        totalQ += qua;
                        totalH += qua;
                        System.out.println("Current total: " + total + '$');
                    }
                }
            } else if (choose == 4) {
                System.out.println("You selected Laptop Stand" + '\n' + "Price:$30");
                System.out.println("Enter quantity: ");
                int qua = scan.nextInt();
                if (qua <= 0)
                    System.out.println("Error!\nQuantity must be greater than zero");
                else {
                    if (qua >= 5) {
                        System.out.println(qua + " * " + laptopS + "$ = " + (qua * laptopS) + '$');
                        System.out.println("Added to cart!");
                        System.out.println("You received 5% discount!");
                        double qul = (qua * laptopS);
                        qul *= 0.95;
                        total += qul;
                        totalQ += qua;
                        totalL += qua;
                        System.out.println("Current total: " + total + '$');
                    } else {
                        System.out.println(qua + " * " + laptopS + "$ = " + (qua * laptopS) + '$');
                        System.out.println("Added to cart!");
                        total += (qua * laptopS);
                        totalQ += qua;
                        totalL += qua;
                        System.out.println("Current total: " + total + '$');
                    }
                }
            } else if (choose == 5) { // Конец и выдача чека
                // Считаем скидку и финальную сумму прямо здесь, когда total уже известен
                double dis = (total >= 100) ? total / 10 : 0;
                double finalR = total - dis;
                double dis15 = (total >= 200) ? (total * 3) / 20 : 0;
                double finalR15 = total - dis15;

                System.out.println("===== CHECKOUT =====\n\nItem purchased:" + totalQ + "\nSubtotal:" + total + '$');

                if (total >= 100 & total < 200) { // Условие когда есть скидка
                    System.out.println("You received a 10% discount!\nDiscount: " + dis + "\nFinal total: " + finalR + '$');
                    for (; ; ) {
                        System.out.println("Enter payment amount: ");
                        int pay = scan.nextInt();
                        if (pay < finalR)
                            System.out.println("Insufficient payment.\nYou still need to pay:" + (finalR - pay));
                        else if (pay >= finalR) {
                            System.out.println("Payment successful!");
                            double change = pay - finalR;
                            System.out.println("========================\n      SIMPLE STORE      \n========================\n\nItems purchased:" + totalQ + "\nSubtotal:" + total + "\nDiscount:" + dis + "\nFinal total:" + finalR + "\nPayment:" + pay + "\nChange:" + change);
                            System.out.println("===== ITEMS PURCHASED =====\nMouse:" + totalM +"\nKeyboards:" + totalK + "\nHeadphones:"+totalH+"\nLaptop Stand:"+ totalL);
                            System.out.println("Most purchased product:");
                            if(totalM>totalH & totalM>totalK & totalM>totalL) {
                                System.out.print("Mouse");
                                System.out.println("\nQuantity:"+totalM);
                            }
                            else if(totalH>totalM & totalH>totalK & totalH>totalL) {
                                System.out.print("Headphone");
                                System.out.println("\nQuantity:"+totalH);
                            }
                            else if(totalK>totalH & totalK>totalM & totalK>totalL) {
                                System.out.print("Keyboard");
                                System.out.println("\nQuantity:"+totalK);
                            }
                            else if(totalL>totalH & totalL>totalK & totalL>totalM) {
                                System.out.print("Laptop Stand");
                                System.out.println("\nQuantity:"+totalL);
                            }
                            if(totalQ>=10)
                                System.out.println("You earned a $10 coupon for your next visit!");
                            System.out.println("Thank you for shopping!");
                            System.exit(0);
                        }
                    }
                } else if (total >= 200) {
                    System.out.println("You received a 15% discount!\nDiscount: " + dis15 + "\nFinal total: " + finalR15 + '$');
                    for (; ; ) {
                        System.out.println("Enter payment amount: ");
                        int pay = scan.nextInt();
                        if (pay < finalR15)
                            System.out.println("Insufficient payment.\nYou still need to pay:" + (finalR15 - pay));
                        else if (pay >= finalR15) {
                            System.out.println("Payment successful!");
                            double change = pay - finalR15;
                            System.out.println("========================\n      SIMPLE STORE      \n========================\n\nItems purchased:" + totalQ + "\nSubtotal:" + total + "\nDiscount:" + dis15 + "\nFinal total:" + finalR15 + "\nPayment:" + pay + "\nChange:" + change);
                            System.out.println("===== ITEMS PURCHASED =====\nMouse:" + totalM +"\nKeyboards:" + totalK + "\nHeadphones:"+totalH+"\nLaptop Stand:"+ totalL);
                            System.out.println("Most purchased product:");
                            if(totalM>totalH & totalM>totalK & totalM>totalL) {
                                System.out.print("Mouse");
                                System.out.println("\nQuantity:"+totalM);
                            }
                            else if(totalH>totalM & totalH>totalK & totalH>totalL) {
                                System.out.print("Headphone");
                                System.out.println("\nQuantity:"+totalH);
                            }
                            else if(totalK>totalH & totalK>totalM & totalK>totalL) {
                                System.out.print("Keyboard");
                                System.out.println("\nQuantity:"+totalK);
                            }
                            else if(totalL>totalH & totalL>totalK & totalL>totalM) {
                                System.out.print("Laptop Stand");
                                System.out.println("\nQuantity:"+totalL);
                            }
                            if(totalQ>=10)
                                System.out.println("You earned a $10 coupon for your next visit!");
                            System.out.println("Thank you for shopping!");
                            System.exit(0);
                        }
                    }
                } else if (total < 100) { // Условие без скидки
                    for (; ; ) {
                        System.out.println("Enter payment amount: ");
                        int pay = scan.nextInt();
                        if (pay < total)
                            System.out.println("Insufficient payment.\nYou still need to pay:" + (total - pay));
                        else {
                            System.out.println("Payment successful!");
                            double change = pay - total;
                            System.out.println("========================\n      SIMPLE STORE      \n========================\n\nItems purchased:" + totalQ + "\nSubtotal:" + total + "\nDiscount:0" + "\nFinal total:" + total + "\nPayment:" + pay + "\nChange:" + change);
                            System.out.println("===== ITEMS PURCHASED =====\nMouse:" + totalM +"\nKeyboards:" + totalK + "\nHeadphones:"+totalH+"\nLaptop Stand:"+ totalL);
                            System.out.println("Most purchased product:");
                            if(totalM>totalH & totalM>totalK & totalM>totalL) {
                                System.out.print("Mouse");
                                System.out.println("\nQuantity:"+totalM);
                            }
                            else if(totalH>totalM & totalH>totalK & totalH>totalL) {
                                System.out.print("Headphone");
                                System.out.println("\nQuantity:"+totalH);
                            }
                            else if(totalK>totalH & totalK>totalM & totalK>totalL) {
                                System.out.print("Keyboard");
                                System.out.println("\nQuantity:"+totalK);
                            }
                            else if(totalL>totalH & totalL>totalK & totalL>totalM) {
                                System.out.print("Laptop Stand");
                                System.out.println("\nQuantity:"+totalL);
                            }
                            if(totalQ>=10)
                                System.out.println("You earned a $10 coupon for your next visit!");
                            System.out.println("Thank you for shopping!");
                            System.exit(0);

                        }
                    }
                }
            }
        }
    }
}