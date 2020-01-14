
package dependencyInjection;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author KHALID
 */
public class Employee {
    private int id;
    private String name;
    private List<Address> address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public Employee(int id, String name, List<Address> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    
    public void show(){
        System.out.println(id+" : "+name);
        Iterator<Address> iterate=address.iterator();
        while (iterate.hasNext()) {
            System.out.println(iterate.next());
            
        }
    }
            
}
