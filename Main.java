import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class element{
	private String name,symbol;
	private int num;
	private double wt;
	public element(String name, String symbol, int num, double wt) {
		super();
		this.name = name;
		this.symbol = symbol;
		this.num = num;
		this.wt = wt;
	}
	@Override
	public String toString() {
		return "Element name=" + name + "\nSymbol=" + symbol + "\nAtomic Number=" + num + "\nAtomic Weight=" + wt + "\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getWt() {
		return wt;
	}
	public void setWt(double wt) {
		this.wt = wt;
	}
	
}
public class Main {

	public static void main(String[] args) {
		List<element> list=new ArrayList<element>();
		Scanner sc=new Scanner(System.in);
		String name="",symbol="";
		int num=0;
		double wt=0;
		int ch1=0,ch2=0;
		char option='y';
		int found=0;
		while(option=='y'||option=='Y') {
			System.out.println("1.Add new element");
			System.out.println("2.Explore");
			System.out.println("3.Quit");
			ch1=sc.nextInt();
			switch(ch1) {
			case 1:
				System.out.println("Enter the element name: ");
				name=sc.next();
				System.out.println("Enter the symbol: ");
				symbol=sc.next();
				System.out.println("Enter the atomic number: ");
				num=sc.nextInt();
				System.out.println("Enter the atomic weight");
				wt=sc.nextDouble();
				list.add(new element(name, symbol, num, wt));
				System.out.println("Element successfully added to the list");
				break;
			case 2:
				System.out.println("1.Search by name");
				System.out.println("2.Search by symbol");
				System.out.println("3.Search by atomic number");
				System.out.println("4.Search by atomic weigth");
				ch2=sc.nextInt();
				switch(ch2) {
				case 1:
					System.out.println("Enter the name: ");
					name=sc.next();
					found=0;
					for(element e:list) {
						if(name.equals(e.getName())) {
							System.out.println("The element searched is: ");
							System.out.println(e);
							found=1;
						}
					}
					if(found==0) {
						System.out.println("Element not found");
					}
					break;
				case 2:
					System.out.println("Enter the symbol: ");
					symbol=sc.next();
					found=0;
					for(element e:list) {
						if(symbol.equals(e.getSymbol())) {
							System.out.println("The element searched is: ");
							System.out.println(e);
							found=1;
						}
					}
					if(found==0) {
						System.out.println("Element not found");
					}
					break;
				case 3:
					System.out.println("Enter the atomic number: ");
					num=sc.nextInt();
					found=0;
					for(element e:list) {
						if(num==e.getNum()) {
							System.out.println("The element searched is: ");
							System.out.println(e);
							found=1;
						}
					}
					if(found==0) {
						System.out.println("Element not found");
					}
					break;
				case 4:
					System.out.println("Enter the atomic number: ");
					wt=sc.nextInt();
					found=0;
					for(element e:list) {
						if(wt==e.getWt()) {
							System.out.println("The element searched is: ");
							System.out.println(e);
							found=1;
						}
					}
					if(found==0) {
						System.out.println("Element not found");
					}
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			case 3:
				System.exit(0);
			default:
					System.out.println("Invalid choice...");
					option='y';
			}
		}
	}

}
