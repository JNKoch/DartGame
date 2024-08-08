package EigenesProjektNr1;

public class Player2 {
    private String name;

    public Player2(String name) {
        if (name.equals("Cons")) {
            System.out.println("Fettsack");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
