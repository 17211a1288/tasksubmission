package epam;

class DIP {
    public static void main(String[] args) {
        Person parent = new Person("I", Role.PARENT);
        Person child1 = new Person("ME", Role.CHILD);
        Person child2 = new Person("WE", Role.CHILD);

        Relationships relationships = new Relationships();
        relationships.addParentAndChild(parent);
        relationships.addParentAndChild(child1);
        relationships.addParentAndChild(child2);

        Research research = new Research(parent, relationships);
        System.out.println(research);

    }
}
