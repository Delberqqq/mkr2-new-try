package main.Team;

public class Developer extends TeamMember {
    private String programmingLanguages;

    public Developer(String name, int experience, String programmingLanguages) {
        super(name, experience);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void performTask(String task) {
        System.out.println(name + " (Developer) is working on: " + task + " using " + programmingLanguages);
    }
}
