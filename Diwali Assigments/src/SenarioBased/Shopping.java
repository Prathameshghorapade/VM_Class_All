package SenarioBased;

import java.util.*;

public class Shopping {

private List<Set<String>>listForAll=new ArrayList<>();


public void addShoppingList(Set<String>list){

    listForAll.add(list);
}


public Set<String>getShoppingListForCustomer(int indexNumber){

    if (indexNumber>=0 && indexNumber<listForAll.size() ){
        return listForAll.get(indexNumber);
    }else {
        System.out.println("Customer Not Found for This Index");
        return Collections.emptySet();
    }
}


public void printAllShoppingList(){

    for (int i=0;i<listForAll.size();i++){

        System.out.println("Customer "+(i+1)+ "Shopping List "+listForAll.get(i));
    }
}

    public static void main(String[] args) {

    Shopping shopingList=new Shopping();

    Set<String>customer1=new HashSet<>(Arrays.asList("Laptop","Laptop","mouse","KeyBoard"));

    Set<String>customer2=new HashSet<>(Arrays.asList("Cable","PC","mouse","KeyBoard"));

    Set<String>customer3=new HashSet<>(Arrays.asList("RAM Chip","Laptop","CD","KeyBoard"));


    shopingList.addShoppingList(customer1);
    shopingList.addShoppingList(customer2);
    shopingList.addShoppingList(customer3);


    shopingList.printAllShoppingList();


        System.out.println("Cutomer 2  "+shopingList.getShoppingListForCustomer(1));




    }
}
