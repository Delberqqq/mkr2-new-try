package main.Team;

public class TeamMemberFactory {
    public static TeamMember createMember(String role, String name, int experience, String extraInfo) {
        switch (role.toLowerCase()) {
            case "developer":
                return new Developer(name, experience, extraInfo);
            case "tester":
                return new Tester(name, experience, extraInfo);
            case "pm":
                return new ProjectManager(name, experience, Integer.parseInt(extraInfo));
            default:
                throw new IllegalArgumentException("Invalid role: " + role);
        }
    }
}
