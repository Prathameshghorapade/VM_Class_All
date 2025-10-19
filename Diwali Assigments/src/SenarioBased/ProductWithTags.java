package SenarioBased;

import java.util.*;

public class ProductWithTags {


    private Map<String, Set<String>>productWithTags=new HashMap<>();

    public void addProductWithTags(String productName,Set<String>tags){

        productWithTags.put(productName,tags);
    }


    public Set<String> getTagsOfSpecificProduct(String productName){
        if (productWithTags.containsKey(productName)){
            return productWithTags.get(productName);
        }else {
            System.out.println("product Not Found");
            return Collections.emptySet();
        }
    }


    public void printAllProductTags(){

        Iterator<Map.Entry<String,Set<String>>>iterator=productWithTags.entrySet().iterator();

        while (iterator.hasNext()){

            Map.Entry<String,Set<String>>entry=iterator.next();

            String productName=entry.getKey();
            Set<String>tags=entry.getValue();

            System.out.println("ProductName "+productName);

            Iterator<String>tagIterator=tags.iterator();

            while (tagIterator.hasNext()){

                System.out.println(" - "+tagIterator.next());
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        ProductWithTags productWithTags=new ProductWithTags();

        Set<String>mobileTags=new HashSet<>(Arrays.asList("android","Electronic","smartPhone"));

        Set<String>laptopTags=new HashSet<>(Arrays.asList("asus","Electronic","gaming"));

        Set<String>tvTags=new HashSet<>(Arrays.asList("androidTv","Electronic","smartTv"));


        productWithTags.addProductWithTags("Mobile",mobileTags);
        productWithTags.addProductWithTags("Laptop",laptopTags);
        productWithTags.addProductWithTags("TV",tvTags);


        productWithTags.printAllProductTags();

        System.out.println("Tags for Tv"+productWithTags.getTagsOfSpecificProduct("TV"));




    }
}
