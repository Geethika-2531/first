package collections;

import java.util.*;
public class pgm10 {
	int id;
	String name;
	public pgm10(int id, String name) {
		this.id = id;
		this.name = name;
	}
@Override
	public String toString() {
		return "program10 [id=" + id + ", name=" + name + "]";
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
	pgm10 other = (pgm10) obj;
	return id == other.id && Objects.equals(name, other.name);
}
 
public static void main(String[] args) {
	LinkedList<pgm10> l = new LinkedList();
	l.add(new pgm10(101, "tom"));
	l.add(new pgm10(102, "ana"));
	l.add(new pgm10(103, "sana"));
	l.add(new pgm10(104, "geethika"));
 
	for(Object o : l) {
		System.out.println(o);
	}
}
}


