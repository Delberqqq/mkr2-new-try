package main.Team;

public class Tester extends TeamMember {
    private String testingTools;

    public Tester(String name, int experience, String testingTools) {
        super(name, experience);
        this.testingTools = testingTools;
    }

    @Override
    public void performTask(String task) {
        System.out.println(name + " (Tester) is testing using: " + testingTools + " for task: " + task);
    }
}
