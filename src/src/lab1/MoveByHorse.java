package lab1;

public class MoveByHorse implements MovementStrategy{

    @Override
    public void move() {
        System.out.println("Едет на лошади");
    }

    public String getDescription() {
        return "Едет на лошади";
    }
}
