package me.tuhin.streams;

import java.util.List;

public class _Streams {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("A", Gender.MALE),
                new Person("B", Gender.MALE),
                new Person("C", Gender.FEMALE),
                new Person("D", Gender.FEMALE)
        );

        people.stream()
                .map(person -> person.gender.equals(Gender.MALE))
                .forEach(System.out::println);
    }


    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

    }

    enum Gender {
        MALE,
        FEMALE,
    }
}

