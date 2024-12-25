package main.Mediator;

import main.Team.TeamMember;

import java.util.ArrayList;
import java.util.List;

public class ProjectMediator {
    private List<TeamMember> teamMembers = new ArrayList<>();

    public void addTeamMember(TeamMember member) {
        teamMembers.add(member);
    }

    public void assignTask(String task) {
        System.out.println("Assigning task: " + task);
        for (TeamMember member : teamMembers) {
            member.performTask(task);
        }
    }
}
