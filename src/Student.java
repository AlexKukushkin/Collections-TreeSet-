import java.util.Comparator;
import java.util.TreeSet;


class NameCompare implements Comparator<Stud>{

    @Override
    public int compare(Stud e1, Stud e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class SalaryCompare implements Comparator<Stud>{
    @Override
    public int compare(Stud e1, Stud e2) {
        if(e1.getSalary() > e2.getSalary()){
            return 1;
        } else {
            return -1;
        }
    }
}

class AgeCompare implements Comparator<Stud>{
    @Override
    public int compare(Stud e1, Stud e2) {
        if(e1.getAge() > e2.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}

class Stud implements Comparable<Stud> {

    private String name;
    private int salary;
    private int age;

    @Override
    public int compareTo(Stud o) {
        if (this.age == o.age)
            return 0;
        if (this.age > o.age)
            return 1;
        return -1;
    }

    public Stud(String n, int a, int s){
        this.name = n;
        this.age = a;
        this.salary = s;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String toString(){
        return "Name: " + this.name + " Age: " + this.age + " Salary: " + this.salary;
    }
}
public class Student{
    public static void main(String a[]){
        TreeSet<Stud> nameComp = new TreeSet<Stud>(new NameCompare());
        nameComp.add(new Stud("A", 25, 3000));
        nameComp.add(new Stud("D", 35,6000));
        nameComp.add(new Stud("C", 21, 2000));
        nameComp.add(new Stud("B", 23, 2400));

        for(Stud e:nameComp){
            System.out.println(e);
        }

        System.out.println(" ;;; ");
        System.out.println(" ;;; ");

        TreeSet<Stud> salaryComp = new TreeSet<Stud>(new SalaryCompare());
        salaryComp.add(new Stud("Robert", 27, 3000));
        salaryComp.add(new Stud("John",28, 5000));
        salaryComp.add(new Stud("Tom",25, 2000));
        salaryComp.add(new Stud("James",31, 2500));

        for(Stud e:salaryComp){
            System.out.println(e);
        }

        System.out.println(" ;;; ");
        System.out.println(" ;;; ");

        TreeSet<Stud> ageComp = new TreeSet<Stud>(new AgeCompare());
        ageComp.add(new Stud("Robert", 27, 3000));
        ageComp.add(new Stud("John",28, 5000));
        ageComp.add(new Stud("Tom",25, 2000));
        ageComp.add(new Stud("James",31, 2500));

        for(Stud e:ageComp){
            System.out.println(e);
        }
    }
}


