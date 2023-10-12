package com.app.fruits;

import java.util.*;
public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int basketsize=10;
		Fruit[] basket=new Fruit[basketsize];
		int counter=0;
		int choice=0;
		while(choice!=9)
		{
			System.out.println("--------------------");
			System.out.println("0.Exit");
			System.out.println("1.Add Mango");
			System.out.println("2.Add Orange");
			System.out.println("3.Add Apple");
			System.out.println("4.Dsiplay name of all fruits in the basket");
			System.out.println("5.Display name,color,weight,taste of all fresh fruit in the basket");
			System.out.println("6.Display tatses of all stale fruits in basket");
    		System.out.println("7.Marks a fruit as stale");
    		System.out.println("8.Marks all sour fruits stale");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 0: break;
			
			case 1:
				
				if(counter<basketsize)
				{
					basket[counter]=new Mango("","",0, false);
					basket[counter].acceptFruit();
					counter++;
				}
				else 
				{
					System.out.println("Basket is full");
				}
				break;
			case 2:
				if(counter<basketsize)
				{
					basket[counter]=new Orange("","",0, false);
					basket[counter].acceptFruit();
					counter++;
				}
				else 
				{
					System.out.println("Basket is full");
				}
				break;
			case 3:
				if(counter<basketsize)
				{
					basket[counter]=new Apple("","",0, false);
					basket[counter].acceptFruit();
					counter++;
				}
				else 
				{
					System.out.println("Basket is full");
				}
				break;
			case 4:
				for(Fruit fruit : basket)
				{
					if(fruit!=null)
					{
						System.out.println(fruit.getName());
					}
				}
				break;
			case 5:
				for(Fruit fruit :basket)
				{
					if(fruit!=null && fruit.isFresh())
						System.out.println(fruit);
					System.out.println("Taste = "+fruit.taste());
					
				}
				break;
			case 6:
				for(Fruit fruit :basket)
				{
					if(fruit!=null && !fruit.isFresh())
						System.out.println(fruit.taste());
				}
				break;
			case 7:
				System.out.print("Enter the index to mark a fruit as stale: ");
			    int index = sc.nextInt();
			    
			    if (index >= 0 && index < counter) {
			        if (basket[index] != null) {
			            basket[index].setFresh(false);
			            System.out.println(basket[index].getName() + " marked as stale.");
			        } 
			        else 
			        {
			            System.out.println("No fruit at that index.");
			        }
			    } 
			    else 
			    {
			        System.out.println("Invalid index.");
			    }
			    break;
			case 8:
				for(int i=0;i<counter;i++)
				{
					if(basket[i]!=null && basket[i] instanceof Orange)
					{
						basket[i].setFresh(false);
					}
				}
				System.out.println("sour fruits marked as stale");
				break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}

	}

}
