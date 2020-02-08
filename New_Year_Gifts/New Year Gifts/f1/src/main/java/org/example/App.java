package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class App extends Printlist
{
    public static void main(String[] args)
    {
        //System.out.println( "Hello sagar!" );
        //total values to give answeres
        Double totalminprice=0.0;
        Double totalmaxprice=0.0;
        Double totalminweight=0.0;
        Double totalmaxweight=0.0;

        //total no of chocolates
        int totalchoco=0;

        //initializing scanner
        Scanner sc=new Scanner(System.in);

        //ArrayList for types of chocolates as it is easy for adding few other types
        ArrayList<String> typesofchocolates=new ArrayList<String>();
        typesofchocolates.add("Traditionalsweets");
        typesofchocolates.add("Gulabjamun");
        typesofchocolates.add("Tossit");
        typesofchocolates.add("Chocolate");
        typesofchocolates.add("Wafers");
        typesofchocolates.add("Candy");

        //Initializing objects of all chocolates and sweets
        Traditionalsweets traditionalsweets;
        Gulabjamun gulabjamun;
        Tossit tossit;
        Chocolate chocolate;
        Wafers wafers;
        Candy candy;

        //requesting user whether he want answere in weight or price
        System.out.println("enter 1 to get sort using price \nenter 2 to sort using weight");
        int choiceonporw=sc.nextInt();//choice on price or weight

        //requesting user to enter about chocolates ans sweets that children collected
        System.out.println("Types of chocolates\n");

        printthelist();
        /*for(int i=0;i<typesofchocolates.size();i++)
        {
            System.out.println(i+1+""+typesofchocolates.get(i));
        }*/

        System.out.println("Enter number of total types of chocolates you have and enter the number of it from the given List");

        int nooftypes=sc.nextInt();
        int[] typesuserhas=new int[nooftypes];//types of chocolates user has

        float maxprice=0;
        float minprice=0;
        float maxweight=0;
        float minweight=0;


        traditionalsweets=new Traditionalsweets();
        gulabjamun=new Gulabjamun();
        tossit=new Tossit();
        chocolate=new Chocolate();
        wafers=new Wafers();
        candy=new Candy();
        for(int i=0;i<nooftypes;i++)
        {
            System.out.println("now enter the value from list");
            int choice=sc.nextInt();
            typesuserhas[i]=choice;

            if(choiceonporw==1)
            {
                System.out.println("Enter maxprice and minprice in rupees");
                maxprice=sc.nextFloat();
                minprice=sc.nextFloat();
            }
            else if(choiceonporw==2)
            {
                System.out.println("Enter maxweight and minweight in grams");
                maxweight=sc.nextFloat();
                minweight=sc.nextFloat();
            }
            else
            {
                System.out.println("please enter correct option");
            }
            if(choice==1)
                traditionalsweets=new Traditionalsweets(maxprice,minprice,maxweight,minweight);
            else if(choice==2)
                gulabjamun=new Gulabjamun(maxprice,minprice,maxweight,minweight);
            else if(choice==3)
                tossit=new Tossit(maxprice,minprice,maxweight,minweight);
            else if(choice==4)
                chocolate=new Chocolate(maxprice,minprice,maxweight,minweight);
            else if(choice==5)
                wafers=new Wafers(maxprice,minprice,maxweight,minweight);
            else if(choice==6)
                candy=new Candy(maxprice,minprice,maxweight,minweight);

            //else conditions for hierarchy

        }


        //taking the input one by one about count of chocolates and sweets
        while(true)
        {
            System.out.println("enter type of chocolate and count of it from the list");
            printthelist();
            System.out.println("enter -1 if you left with no chocolates");
            int choice=sc.nextInt();
            if(choice==-1)
            {
                if(choiceonporw==1)
                {
                    System.out.println("Total maximum price expected  :  "+Math.round(totalmaxprice*100.0)/100.0+"/-Rupees");
                    System.out.println("Total minimum price expected  :  "+Math.round(totalminprice*100.0)/100.0+"/-Rupees");
                }
                else
                {
                    System.out.println("Total maximum weight expected  :  "+Math.round(totalmaxweight*1.0)/1.0+"  grams");
                    System.out.println("Total minimum weight expected  :  "+Math.round(totalminweight*1.0)/1.0+"  grams");
                }
                break;
            }
            else
            {
                System.out.println("you have choosen : "+typesofchocolates.get(choice-1));
                System.out.println("now enter total count you have of it : ");
                int totalcountch=sc.nextInt();//total count of selected type of chocolates
                totalchoco=totalchoco+totalcountch;//adding total count this type of chocolates to total count
                if(choice==1)
                {
                    if(choiceonporw==1)
                    {
                        totalmaxprice=totalmaxprice+(totalcountch*traditionalsweets.getemaxprice());
                        totalminprice=totalminprice+(totalcountch*traditionalsweets.geteminprice());
                    }
                    else
                    {
                        totalmaxweight=totalmaxweight+(totalcountch*traditionalsweets.getemaxweight());
                        totalminweight=totalminweight+(totalcountch*traditionalsweets.geteminweight());
                    }
                }
                else if(choice==2)
                {
                    if(choiceonporw==1)
                    {
                        totalmaxprice=totalmaxprice+(totalcountch*gulabjamun.getemaxprice());
                        totalminprice=totalminprice+(totalcountch*gulabjamun.geteminprice());
                    }
                    else
                    {
                        totalmaxweight=totalmaxweight+(totalcountch*gulabjamun.getemaxweight());
                        totalminweight=totalminweight+(totalcountch*gulabjamun.geteminweight());
                    }
                }
                else if(choice==3)
                {
                    if(choiceonporw==1)
                    {
                        totalmaxprice=totalmaxprice+(totalcountch*tossit.getemaxprice());
                        totalminprice=totalminprice+(totalcountch*tossit.geteminprice());
                    }
                    else
                    {
                        totalmaxweight=totalmaxweight+(totalcountch*tossit.getemaxweight());
                        totalminweight=totalminweight+(totalcountch*tossit.geteminweight());
                    }
                }
                else if(choice==4)
                {
                    if(choiceonporw==1)
                    {
                        totalmaxprice=totalmaxprice+(totalcountch*chocolate.getemaxprice());
                        totalminprice=totalminprice+(totalcountch*chocolate.geteminprice());
                    }
                    else
                    {
                        totalmaxweight=totalmaxweight+(totalcountch*chocolate.getemaxweight());
                        totalminweight=totalminweight+(totalcountch*chocolate.geteminweight());
                    }
                }
                else if(choice==5)
                {
                    if(choiceonporw==1)
                    {
                        totalmaxprice=totalmaxprice+(totalcountch*wafers.getemaxprice());
                        totalminprice=totalminprice+(totalcountch*wafers.geteminprice());
                    }
                    else
                    {
                        totalmaxweight=totalmaxweight+(totalcountch*wafers.getemaxweight());
                        totalminweight=totalminweight+(totalcountch*wafers.geteminweight());
                    }
                }
                else if(choice==6)
                {
                    if(choiceonporw==1)
                    {
                        totalmaxprice=totalmaxprice+(totalcountch*candy.getemaxprice());
                        totalminprice=totalminprice+(totalcountch*candy.geteminprice());
                    }
                    else
                    {
                        totalmaxweight=totalmaxweight+(totalcountch*candy.getemaxweight());
                        totalminweight=totalminweight+(totalcountch*candy.geteminweight());
                    }
                }
                //else using hierarchy
            }

        }

    }



}
