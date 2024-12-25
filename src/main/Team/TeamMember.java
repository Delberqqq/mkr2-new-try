package main.Team;

public abstract class TeamMember {
    protected String name;
    protected int experience;

    public TeamMember(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public abstract void performTask(String task);
}
