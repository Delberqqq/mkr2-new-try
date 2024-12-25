package main.Team;

public class ProjectManager extends TeamMember {
    private int projectsManaged;

    public ProjectManager(String name, int experience, int projectsManaged) {
        super(name, experience);
        this.projectsManaged = projectsManaged;
    }

    @Override
    public void performTask(String task) {
        System.out.println(name + " (PM) is managing project task: " + task);
    }
}
