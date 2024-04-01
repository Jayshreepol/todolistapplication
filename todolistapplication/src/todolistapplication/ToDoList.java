package todolistapplication;

import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	public static void main(String[] args) {
		ArrayList<String> tDoLists = new ArrayList<>();
    	 Scanner scanner = new Scanner(System.in);
    	 boolean flag = true;
		while(flag) {
			System.out.println("====== To-Do list view ======\n"+"1.Add items\n"+"2.Remove items\n"+"3.Edit items\n"+"4.View items\n"+"5.Exit\n");
			System.out.println("Enter the choice:");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
				case 1:
					System.out.println("Enter the task to add: ");
					String task = scanner.nextLine();
                    tDoLists.add(task);
					System.out.println("Task added:" + task);
					break;
				case 2:
				   if(tDoLists.isEmpty()){
					 System.out.println("To-Do list is empty:");
				   }else{
					  System.out.println("To-Do list");
					  for(int i=0;i<tDoLists.size();i++){
						System.out.println((i+1)+". "+tDoLists.get(i));
					  }
					   System.out.println("Enter the items number of remove:");
					   int itemNum = scanner.nextInt();
					   if(itemNum >=1 && itemNum <= tDoLists.size()){
						   String removeTask = tDoLists.remove(itemNum-1);
                           System.out.println("Task removed:"+removeTask);
					   }else{
						   System.out.println("Invalid item number");
					   }
				   }
			       break;
				case 3 :
				   if(tDoLists.isEmpty()){
					System.out.println("To-Do list is empty:");
				   }else{
					System.out.println("Enter the items number to update:");
					int updateNum = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter the new value for item:");
					String newItems = scanner.nextLine();
					if(updateNum >= 1 && updateNum <= tDoLists.size()){
						String updateTask = tDoLists.set( updateNum - 1, newItems);
						System.out.println("Updated task:"+updateNum+"."+ newItems);
					}else{
						System.out.println("Invalid item number");
					}
				   }
				   break;
				case 4:
				if(tDoLists.isEmpty()){
					System.out.println("To-Do list is empty:");
				 }else{
					System.out.println("To-Do List:");
					for(int i=0;i<tDoLists.size();i++){
						System.out.println((i+1)+". "+tDoLists.get(i));
					}
				 }
				    break;
				case 5:
				   scanner.close();
				   flag = false;
				default:
				System.out.println("Invalid choice");
					break;
			}
		}
	}
}
