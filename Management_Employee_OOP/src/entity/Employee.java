//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package entity;

abstract class Employee {
    protected String name;
    protected int age;
    protected String sex;
    protected String address;

    public Employee() {
    }

    public Employee(String name, int age, String sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }

    public String getAddress() {
        return this.address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void inputInfo();
}
