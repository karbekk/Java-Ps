package collections.lists;

import collections.Product;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by kartik on 10/20/16.
 */

public class Shipment implements Iterable<Product>

{

private static final int LIGHT_VAN_MAX_WEIGHT = 20;

private final List<Product> products = new ArrayList<>();

public void add(Product product)
{
    products.add(product);
}

    @Override
    public Iterator<Product> iterator() {
        return null;
    }
}
