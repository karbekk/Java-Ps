package collections;

import collections.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by kartik on 10/15/16.
 */
public class CollectionConcept {

    public static void main(String[] args)
    {
        Product door = new Product("Wooden",32);
        Product window = new Product("Glass",12);
        Product floor = new Product("panel",19);

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(window);
        products.add(floor);

        System.out.print(products);

        final Iterator<Product> productIterator =   products.iterator();
        while (productIterator.hasNext())
        {
            Product product = productIterator.next();
            if(product.getWeight()>20)
            {
                System.out.println(product);
            }
            else
            {
                   productIterator.remove();
            }
        }

        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.isEmpty());

        Collection<Product> otherProducts = new ArrayList<>();
        otherProducts.add(door);
        otherProducts.add(window);

        products.removeAll(otherProducts);
        products.remove(window);

      /*
        Never modify the collection elements if using for. Use iterator. Because for is a cursor. so
        trying to iterate over and updating at same time throws excepttions.

        for (Product product: products)
        {
            System.out.println(product);
        }
      */
    }

}
