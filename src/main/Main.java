package main;

import main.Mediator.ProjectMediator;
import main.Observer.NotificationSystem;
import main.Observer.TaskObserver;
import main.Team.TeamMember;
import main.Team.TeamMemberFactory;

public class Main {
    public static void main(String[] args) {
        // Фабрика для створення членів команди
        TeamMember dev = TeamMemberFactory.createMember("developer", "Alice", 5, "Java, Python");
        TeamMember tester = TeamMemberFactory.createMember("tester", "Bob", 3, "Selenium, JUnit");
        TeamMember pm = TeamMemberFactory.createMember("pm", "Charlie", 10, "5");

        // Медіатор
        ProjectMediator mediator = new ProjectMediator();
        mediator.addTeamMember(dev);
        mediator.addTeamMember(tester);
        mediator.addTeamMember(pm);

        // Спостерігачі
        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.addObserver(new TaskObserver("Observer 1"));
        notificationSystem.addObserver(new TaskObserver("Observer 2"));

        // Завдання
        mediator.assignTask("Develop Login Module");
        notificationSystem.notifyObservers("Task 'Develop Login Module' started");

        mediator.assignTask("Test Login Module");
        notificationSystem.notifyObservers("Task 'Test Login Module' completed");
    }
}
