package collections;

import java.util.Objects;
import java.util.LinkedList;
public class emp {
        int id;
        String name;
        public emp(int id,String name) {
        	this.id=id;
        	this.name=name;
        }
    @Override
        public String toString() {
        	return "Emp [id=" + id + ", name=" + name + "]";
    	}
    @Override
    public int hashCode() {
    	return Objects.hash(id, name);
    }
    @Override
    public boolean equals(Object obj) {
    	if (this == obj)
    		return true;
    	if (obj == null)
    		return false;
    	if (getClass() != obj.getClass())
    		return false;
    	emp other = (emp) obj;
    	return id == other.id && Objects.equals(name, other.name);
    }
    public static void main(String[] args) {
    	LinkedList<emp> l = new LinkedList();
    	l.add(new emp(101, "tom"));
    	l.add(new emp(102, "ana"));
    	l.add(new emp(103, "sana"));
    	l.add(new emp(104, "priya"));
    	for(Object o : l) {
    		System.out.println(o);
    	}
    }
}
