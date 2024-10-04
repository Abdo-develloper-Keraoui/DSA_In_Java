import java.util.Random;

public class SelectionSort {
    private Person[] people;
    private int arraySize;

    public SelectionSort(int arraySize) {
        this.people = new Person[arraySize];
        this.arraySize = arraySize;

    }

    public Person[] getPeople() {
        return people;
    }

    public int getArraySize() {
        return arraySize;
    }

    public void fillList() {
        Random random = new Random();
        //Allocating Memory for 'people' array
        for (int i = 0; i < arraySize; i++) {
            people[i] = new Person();
        }
        //Filling the 'people' array
        int i = 1;
        for(Person person: people) {
            int age = random.nextInt(100);
            String name = "person " + i;
            person.setAge(age);
            person.setName(name);
            i++;
        }
    }
    public void printArray() {
        for(Person person: people) {
            System.out.println(person);
        }
    }

    public Person findOldest(Person[] persons, int arraySize) {
        if(persons.length == 0) {
            return null;
        }
        Person oldest = persons[0];
        for (Person person : persons) {
            if (oldest.getAge() < person.getAge()) {
                oldest = person;
            }
        }
        return oldest;
    }
    public void swapPersons(Person person1, Person person2) {
        int ageSwap = person1.getAge();
        String nameSwap = person1.getName();

        person1.setAge(person2.getAge());
        person1.setName(person2.getName());

        person2.setAge(ageSwap);
        person2.setName(nameSwap);
    }

    //Basic and straightforward implementation of selection Sort
    public void selectionSort() {
        int arraySize = people.length;
        for(int i = 0; i < arraySize - 1; i++) {
            int indexOldest = i;
            for(int j = i + 1; j < arraySize; j++) {
                if(people[indexOldest].getAge() < people[j].getAge()) {
                    indexOldest = j;
                }
            }
            swapPersons(people[indexOldest], people[i]);
        }
    }
}
